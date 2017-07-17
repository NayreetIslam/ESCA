/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import esca_orm.*;
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
@WebServlet(name = "Processor", urlPatterns = {"/Processor"})
public class Processor extends HttpServlet {

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
            case "showDetails":
                getDetail(request,response);
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
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
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
                + "                            <td>Arhitecture</td>"
                + "                            <td>Clock Speed</td>"
                + "                            <td></td>"
                + "                            <td></td>"
                + "                    </tr>";


        esca_orm.Processor[] processors = esca_orm.DAOFactory.getDAOFactory().getProcessorDAO().listProcessorByQuery(null, null);
        for(int i = 0; i < processors.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + processors[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +processors[i].getName()
                                +"</td>"
                                +"<td>"
                                +processors[i].getArchitecture()
                                + "</td>"
                                +"<td>"
                                +processors[i].getClockSpeed()
                                + "</td>"
                                + "<td>"
                                + "<a href=\"GENERAL_PURPOSE.jsp?action=search&id="+ processors[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"Processor?action=delete&id="+ processors[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";

        request.getSession().setAttribute("table", table);
        request.getRequestDispatcher("/backend/Processor.jsp").forward(request, response);

    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        String name= request.getParameter("name"); 
        String architecture= request.getParameter("architecture");
        double clockSpeed= Double.parseDouble(request.getParameter("clockSpeed"));
        String dataBus=request.getParameter("dataBus");
        
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.ProcessorDAO eSCA_ORMProcessorDAO = lDAOFactory.getProcessorDAO();
            esca_orm.Processor eSCA_ORMProcessor = eSCA_ORMProcessorDAO.createProcessor();
            // Initialize the properties of the persistent object here
            
            eSCA_ORMProcessor.setName(name);
            eSCA_ORMProcessor.setArchitecture(architecture);
            eSCA_ORMProcessor.setClockSpeed(clockSpeed);
            eSCA_ORMProcessor.setDataBus(dataBus);
            
            
            eSCA_ORMProcessorDAO.save(eSCA_ORMProcessor);
            
            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("Processor?action=list").forward(request, response); 
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
			esca_orm.dao.ProcessorDAO eSCA_ORMProcessorDAO = lDAOFactory.getProcessorDAO();
			esca_orm.Processor eSCA_ORMProcessor = eSCA_ORMProcessorDAO.loadProcessorByORMID(id);
			// Delete the persistent object
			eSCA_ORMProcessorDAO.delete(eSCA_ORMProcessor);
			
			t.commit();
                        request.getRequestDispatcher("Processor?action=list").forward(request, response); 
		}
		catch (Exception e) {
			t.rollback();
		}

    }
    
    public String dropDownList() throws ServletException, IOException, PersistentException{
        String dropDown = "<select id=\"processorList\" name=\"processorList\" class=\"form-control\">\n";
        
        esca_orm.Processor[] processors = esca_orm.DAOFactory.getDAOFactory().getProcessorDAO().listProcessorByQuery(null, null);
        for(int i = 0; i < processors.length; i++) {
            
            dropDown+="<option value="+processors[i].getORMID()+">"+processors[i].getName()+"</option>\n";
        }
                        
        dropDown+= "</select>";

        return dropDown;
    }

    private void getDetail(HttpServletRequest request, HttpServletResponse response) throws IOException, PersistentException {
        
        int id=Integer.parseInt(request.getParameter("idProc"));
        esca_orm.Processor proc = esca_orm.DAOFactory.getDAOFactory().getProcessorDAO().getProcessorByORMID(id);
        String print="";
        try (PrintWriter out = response.getWriter()) {
            
            print+="<div class=\"col-md-3\">\n" +
"                       <img src=\"http://cdn6.bigcommerce.com/s-7f2gq5h/product_images/uploaded_images/arm-chip.jpg\" width=\"100%\">\n" +
                   "</div>\n" +
"                   <div class=\"col-md-9\">\n"
                        + "<p><b>Processor Name:</b> "+proc.getName()+"</p>"
                        +"<p><b>Data Bus:</b> "+proc.getDataBus()+"-Bit</p>"
                        +"<p><b>Cache:</b> "+proc.getCache()+" kB</p>"
                        +"<p><b>Cores:</b> "+proc.getNumberCores()+"</p>"
                        +"<p><b>Clock Speed:</b> "+proc.getClockSpeed()+" Mhz </p>"  
                        +"<p><b>Architechture:</b> "+proc.getArchitecture()+"</p>"
                        +"<p><b>Version:</b> "+proc.getArchitectureVersion()+"</p>"
                        +"<p><b>Familiy:</b> "+proc.getFamiliy()+"</p>"
                        
                    +"</div>";
            out.print(print);
        }

    }
    
    
}
