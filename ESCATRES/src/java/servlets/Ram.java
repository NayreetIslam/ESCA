/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import esca_orm.RAM;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo Esperguel
 */
@WebServlet(name = "Ram", urlPatterns = {"/Ram"})
public class Ram extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, PersistentException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
       
        switch (action) {
            case "list":
                list(request,response);
                break;
            case "add":
                add(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(Ram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(Ram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public void list(HttpServletRequest request, HttpServletResponse response) throws PersistentException, ServletException, IOException{
        String table = " "
                + " <table class=\"table\"> "
                + "                    <tr> "
                + "                            <td>Id(PK)</td>"
                + "                            <td>Name</td>"
                + "                            <td>Frecuency</td>"
                + "                            <td>Type</td>"
                + "                            <td>Amount</td>"
                + "                            <td></td>"
                + "                            <td></td>"
                + "                    </tr>";


        esca_orm.RAM[] rams = esca_orm.DAOFactory.getDAOFactory().getRAMDAO().listRAMByQuery(null, null);
        for(int i = 0; i < rams.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + rams[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +rams[i].getName()
                                +"</td>"
                                +"<td>"
                                +rams[i].getFrecuency()
                                + "</td>"
                                +"<td>"
                                +rams[i].getType()
                                + "</td>"
                                + "<td>"
                                +rams[i].getAmount()+" MB"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"Ram.jsp?action=search&id="+ rams[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"Ram?action=delete&id="+ rams[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";

        request.getSession().setAttribute("table", table);
        request.getRequestDispatcher("/backend/Ram.jsp").forward(request, response);

    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
       
        String name= request.getParameter("name"); 
        double frecuency= Double.parseDouble(request.getParameter("frecuency"));
        double amount= Double.parseDouble(request.getParameter("amount"));
        String type=request.getParameter("type");
        String metric = request.getParameter("metric");
        
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.RAMDAO ramDao = lDAOFactory.getRAMDAO();
            esca_orm.RAM ram = ramDao.createRAM();
            // Initialize the properties of the persistent object here
            
            ram.setName(name);
            //Parsing to MB and setting amount
            switch (metric) {
                case "kB":
                    ram.setAmount((amount/1024));
                    break;
                case "GB":
                    ram.setAmount((amount*1024));
                    break;
                default:
                    ram.setAmount(amount);
                    break;
            }
            
            ram.setType(type);
            ram.setFrecuency(frecuency);
            
            
            ramDao.save(ram);
            
            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("Ram?action=list").forward(request, response); 
            //request.getRequestDispatcher("/backend/GeneralPurpose.jsp").forward(request, response);   
        }
        catch (Exception e) {
                t.rollback();
        }
        
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        int id= Integer.parseInt(request.getParameter("id"));
            
            PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();
		try {
			esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
			esca_orm.dao.RAMDAO ramDao = lDAOFactory.getRAMDAO();
			esca_orm.RAM ram = ramDao.loadRAMByORMID(id);
			// Delete the persistent object
			ramDao.delete(ram);
			
			t.commit();
                        request.getRequestDispatcher("Ram?action=list").forward(request, response); 
		}
		catch (Exception e) {
			t.rollback();
		}

    }
    
    public String dropDownList() throws ServletException, IOException, PersistentException{
        String dropDown = "<select id=\"ramList\" name=\"ramList\" class=\"form-control\">\n";
        
        esca_orm.RAM[] rams = esca_orm.DAOFactory.getDAOFactory().getRAMDAO().listRAMByQuery(null, null);
        for(int i = 0; i < rams.length; i++) {
            
            dropDown+="<option value="+rams[i].getORMID()+">"+rams[i].getName()+"</option>\n";
        }
                        
        dropDown+= "</select>";

        return dropDown;
    }
    
}
