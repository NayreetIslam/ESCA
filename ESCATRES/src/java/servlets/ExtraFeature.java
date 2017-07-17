/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import esca_orm.ADD_FEATURE;
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
@WebServlet(name = "ExtraFeature", urlPatterns = {"/ExtraFeature"})
public class ExtraFeature extends HttpServlet {

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
            case "dropDownList":
                dropDownList(request, response);
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
            Logger.getLogger(ExtraFeature.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ExtraFeature.class.getName()).log(Level.SEVERE, null, ex);
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
        /* TODO output your page here. You may use following sample code. */
        String table = " "
                + " <table class=\"table\"> "
                + "                    <tr> "
                + "                            <td>Id(PK)</td>"
                + "                            <td>Title</td>"
                + "                            <td>Description</td>"
                + "                            <td></td>"
                + "                            <td></td>"
                + "                    </tr>";


        ADD_FEATURE[] addFeatures = esca_orm.DAOFactory.getDAOFactory().getADD_FEATUREDAO().listADD_FEATUREByQuery(null, null);
        for(int i = 0; i < addFeatures.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + addFeatures[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +addFeatures[i].getTitle()
                                +"</td>"
                                +"<td>"
                                +addFeatures[i].getDescription()
                                + "</td>"
                                +"<td>"
                                +addFeatures[i].GENERAL_PURPOSE.getCollection().iterator().next().toString()
                                + "</td>"
                                + "<td>"
                                + "<a href=\"ExtraFeature.jsp?action=search&id="+ addFeatures[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"ExtraFeature?action=delete&id="+ addFeatures[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";
        request.getSession().setAttribute("table", table);
        
        GenPurpose genPurp = new GenPurpose();
        String genPurpList = genPurp.dropDownList(request, response);
        
        request.getSession().setAttribute("genPurpList", genPurpList);
        
        request.getRequestDispatcher("/backend/ExtraFeature.jsp").forward(request, response);   
    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        
        String title= request.getParameter("title"); 
        String description= request.getParameter("description");
        int idGenPurp= Integer.parseInt(request.getParameter("genPurpList"));
                
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.ADD_FEATUREDAO addFeatureDao = lDAOFactory.getADD_FEATUREDAO();
            esca_orm.ADD_FEATURE addFeature = addFeatureDao.createADD_FEATURE();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ADD_FEATURE
            addFeature.setTitle(title);
            addFeature.setDescription(description);
            
            esca_orm.dao.GENERAL_PURPOSEDAO genPurpDao = lDAOFactory.getGENERAL_PURPOSEDAO();
            esca_orm.GENERAL_PURPOSE genPurp = genPurpDao.getGENERAL_PURPOSEByORMID(idGenPurp);
            
            addFeature.GENERAL_PURPOSE.add(genPurp);
            addFeatureDao.save(addFeature);

            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("ExtraFeature?action=list").forward(request, response); 
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
			esca_orm.dao.ADD_FEATUREDAO addFeatureDao = lDAOFactory.getADD_FEATUREDAO();
			esca_orm.ADD_FEATURE addFeature = addFeatureDao.loadADD_FEATUREByORMID(id);
                        System.out.println("OBTENIEDNO -<-----------------<-<-<--<");
                        System.out.println(addFeature.getTitle());
			// Delete the persistent object
			addFeatureDao.delete(addFeature);
			
                      
			t.commit();
                        request.getRequestDispatcher("ExtraFeature?action=list").forward(request, response); 
		}
		catch (Exception e) {
                    e.printStackTrace();
			t.rollback();
		}
    }
    
    public String dropDownList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException{
        String dropDown = "<select id=\"extraFeatureList\" name=\"extraFeatureList\" class=\"form-control\">\n";
        
        ADD_FEATURE[] extraFeatures = esca_orm.DAOFactory.getDAOFactory().getADD_FEATUREDAO().listADD_FEATUREByQuery(null, null);
        for(int i = 0; i < extraFeatures.length; i++) {
            
            dropDown+="<option value="+extraFeatures[i].getORMID()+">"+extraFeatures[i].getTitle()+"</option>\n";
        }
                        
        dropDown+= "</select>";

        return dropDown;
    }
    
    public ADD_FEATURE[] getExtraFeatureObjects() throws PersistentException{
        
        ADD_FEATURE[] extraFeatures = esca_orm.DAOFactory.getDAOFactory().getADD_FEATUREDAO().listADD_FEATUREByQuery(null, null);

        return extraFeatures;
    }

}
