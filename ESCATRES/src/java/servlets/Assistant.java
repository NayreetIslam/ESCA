/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import esca_orm.ADD_FEATURE;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.orm.PersistentException;

/**
 *
 * @author Marcelo Esperguel
 */
@WebServlet(name = "Assistant", urlPatterns = {"/Assistant"})
public class Assistant extends HttpServlet {

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
        // list(request,response);
            case "start":
                start(request, response);
                break;
            case "listExtraFeature":
                int idSelected = Integer.parseInt(request.getParameter("idSelected"));
                listExtraFeature(request, response, idSelected);
                break;
            case "showDesc":
                int idSelectedDesc = Integer.parseInt(request.getParameter("idSelected"));
                showDesc(request, response, idSelectedDesc);
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
            Logger.getLogger(Assistant.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Assistant.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void start(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException{
        GenPurpose genPurp = new GenPurpose();
        Constraint constraint = new Constraint();
        String dropDown = genPurp.dropDownList(request, response);
        String display = constraint.displayConstraints(request, response);
        
        request.getSession().setAttribute("dropDown", dropDown);
        request.getSession().setAttribute("display" , display);
        request.getRequestDispatcher("assistant.jsp").forward(request, response);   
    }
    
    
    public void listExtraFeature(HttpServletRequest request, HttpServletResponse response, int id) throws IOException, PersistentException{
         try (PrintWriter out = response.getWriter()) {
            
            ExtraFeature exFeatureServlet = new ExtraFeature();
            
             ADD_FEATURE[] extraFeatures = exFeatureServlet.getExtraFeatureObjects();
             List list;
             
             
             out.print("<select name=\"extraFeatures\" id=\"extraFeatures\" multiple=\"multiple\" class=\"form-control\">");
             for (int i=0; i< extraFeatures.length;i++) {
                list = new ArrayList(extraFeatures[i].GENERAL_PURPOSE.getCollection());
                //Collections.sort(list);
                 //System.out.println(extraFeature.getTitle());
                 for(int j=0; j<list.size();j++){
                     System.out.println(list.get(j).toString()+"="+id);
                     if(list.get(j).toString().equals(""+id)){
                        out.print("<option value="+extraFeatures[i].getORMID()+">"+extraFeatures[i].getTitle()+"</option>");
                     }
                 }
                                  
             }
            out.print(" </select>");
            
        }
    }
    public void showDesc(HttpServletRequest request, HttpServletResponse response, int id) throws IOException, PersistentException{
         try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String desc;
            
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.GENERAL_PURPOSEDAO eSCA_ORMGENERAL_PURPOSEDAO = lDAOFactory.getGENERAL_PURPOSEDAO();
            esca_orm.GENERAL_PURPOSE eSCA_ORMGENERAL_PURPOSE = eSCA_ORMGENERAL_PURPOSEDAO.loadGENERAL_PURPOSEByORMID(id);

            desc=eSCA_ORMGENERAL_PURPOSE.getDescription();
            
            out.print(desc);
            
        }
    }
}
