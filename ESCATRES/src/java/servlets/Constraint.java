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
@WebServlet(name = "Constraint", urlPatterns = {"/Constraint"})
public class Constraint extends HttpServlet {

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
    
    public void list(HttpServletRequest request, HttpServletResponse response) throws PersistentException, ServletException, IOException{
        String table = " "
                + " <table class=\"table\"> "
                + "                    <tr> "
                + "                            <td>Id(PK)</td>"
                + "                            <td>Name</td>"
                + "                            <td>Type</td>"
                + "                            <td></td>"
                + "                            <td></td>"                
                + "                    </tr>";


        esca_orm.Constraint[] constraints = esca_orm.DAOFactory.getDAOFactory().getConstraintDAO().listConstraintByQuery(null, null);
        
        for(int i = 0; i < constraints.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + constraints[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +constraints[i].getName()
                                +"</td>"
                                +"<td>"
                                +constraints[i].getType()
                                + "</td>"                                
                                + "<td>"
                                + "<a href=\"Constraint.jsp?action=search&id="+ constraints[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"Constraint?action=delete&id="+ constraints[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";

        request.getSession().setAttribute("table", table);
        request.getRequestDispatcher("/backend/Constraint.jsp").forward(request, response);

    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        
        String name= request.getParameter("name"); 
        String type= request.getParameter("type");
        
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.ConstraintDAO constraintDao = lDAOFactory.getConstraintDAO();
            esca_orm.Constraint constraint = constraintDao.createConstraint();
            // Initialize the properties of the persistent object here
            
            constraint.setName(name);
            constraint.setType(type);
            
            
            
            constraintDao.save(constraint);
            
            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("Constraint?action=list").forward(request, response); 
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
			esca_orm.dao.ConstraintDAO constraintDao = lDAOFactory.getConstraintDAO();
			esca_orm.Constraint constraint = constraintDao.loadConstraintByORMID(id);
			// Delete the persistent object
			constraintDao.delete(constraint);
			
			t.commit();
                        request.getRequestDispatcher("Constraint?action=list").forward(request, response); 
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
    
    public String displayConstraints(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        String display ="";
        esca_orm.Constraint[] constraints = esca_orm.DAOFactory.getDAOFactory().getConstraintDAO().listConstraintByQuery(null, null);
        
        for(int i = 0; i < constraints.length; i++) {
            String name= constraints[i].getName();
            String typeConstraint= constraints[i].getType();
            //String unit= constraints[i].getUnit();
                    
            display+="<label>"+ name+/*" ("+unit+")+*/": </label>\n";
                    
            
                    if(typeConstraint.equals("Range")){
                        display+= "<div style=\"display: flex\"> \n"
                                + "<div class=\"form-group\">\n"
                                + "   <label for=\"name\">Min</label>\n"
                                + "   <input style=\"display: inline-block; width: 80%\" type=number step=0.01 min=\"0\" class=\"form-control\" name=\"min"+name+"\" id=\"min"+name+"\" placeholder=\"Enter Min\" required>\n"
                                + " </div>"
                                + "<div class=\"form-group\">\n"
                                + "     <label for=\"name\">Max</label>\n"
                                + "     <input style=\"display: inline-block; width: 80%\" type=number step=0.01 min=\"0\" class=\"form-control\" name=\"max"+name+"\" id=\"max"+name+"\" placeholder=\"Enter Max\" required>\n"
                                + "</div>"
                                + "</div>";
                    }else if(typeConstraint.equals("Boolean")){
                        display+="<div class=\"checkbox\">\n" +
                                "  <label><input name=\"cb"+name+"\" id=\"cb"+name+"\" type=\"checkbox\" value=\"\">"+name+"</label>\n" +
                                "</div>";
                    }
        }
        
        return display;
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
            Logger.getLogger(Constraint.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Constraint.class.getName()).log(Level.SEVERE, null, ex);
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
    
}
