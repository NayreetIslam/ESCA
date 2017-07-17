/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Marcelo Esperguel
 */
@WebServlet(name = "Rom", urlPatterns = {"/Rom"})
public class Rom extends HttpServlet {

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
            Logger.getLogger(Rom.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Rom.class.getName()).log(Level.SEVERE, null, ex);
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
                + "                            <td>Type</td>"
                + "                            <td>Amount</td>"
                + "                            <td></td>"
                + "                            <td></td>"
                + "                    </tr>";


        esca_orm.ROM[] roms = esca_orm.DAOFactory.getDAOFactory().getROMDAO().listROMByQuery(null, null);
        for(int i = 0; i < roms.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + roms[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +roms[i].getName()
                                +"</td>"                                
                                +"<td>"
                                +roms[i].getType()
                                + "</td>"
                                + "<td>"
                                +roms[i].getAmount()+" kB"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"Rom.jsp?action=search&id="+ roms[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"Rom?action=delete&id="+ roms[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";

        request.getSession().setAttribute("table", table);
        request.getRequestDispatcher("/backend/Rom.jsp").forward(request, response);

    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
       
        String name= request.getParameter("name"); 
        double amount= Double.parseDouble(request.getParameter("amount"));
        String type=request.getParameter("type");
        String metric = request.getParameter("metric");
        
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.ROMDAO romDao = lDAOFactory.getROMDAO();
            esca_orm.ROM rom = romDao.createROM();
            // Initialize the properties of the persistent object here
            
            rom.setName(name);
            
            //Parsing to kb and setting amount
            switch (metric) {
                case "MB":
                    rom.setAmount((amount*1024));
                    break;
                default:
                    rom.setAmount(amount);
                    break;
            }
            
            rom.setType(type);

            
            
            romDao.save(rom);
            
            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("Rom?action=list").forward(request, response); 
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
                        esca_orm.dao.ROMDAO romDao = lDAOFactory.getROMDAO();
                        esca_orm.ROM rom = romDao.createROM();
			// Delete the persistent object
			romDao.delete(rom);
			
			t.commit();
                        request.getRequestDispatcher("Rom?action=list").forward(request, response); 
		}
		catch (Exception e) {
			t.rollback();
		}

    }
    
    public String dropDownList() throws ServletException, IOException, PersistentException{
        String dropDown = "<select id=\"romList\" name=\"romList\" class=\"form-control\">\n";
        
        esca_orm.ROM[] roms = esca_orm.DAOFactory.getDAOFactory().getROMDAO().listROMByQuery(null, null);
        for(int i = 0; i < roms.length; i++) {
            
            dropDown+="<option value="+roms[i].getORMID()+">"+roms[i].getName()+"</option>\n";
        }
                        
        dropDown+= "</select>";

        return dropDown;
    }
    
}
