/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import esca_orm.GENERAL_PURPOSE;
import esca_orm.MiniSpecification;
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
@WebServlet(name = "GenPurpose", urlPatterns = {"/GenPurpose"})
public class GenPurpose extends HttpServlet {

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
        
        if(action.equals("list")){
                list(request,response);
        }else if(action.equals("add")){
            add(request,response);
        }else if(action.equals("delete")){
            delete(request,response);
        }else if(action.equals("dropDownList")){
            dropDownList(request, response);
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
            Logger.getLogger(GenPurpose.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GenPurpose.class.getName()).log(Level.SEVERE, null, ex);
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


        GENERAL_PURPOSE[] gENERAL_PURPOSEs = esca_orm.DAOFactory.getDAOFactory().getGENERAL_PURPOSEDAO().listGENERAL_PURPOSEByQuery(null, null);
        for(int i = 0; i < gENERAL_PURPOSEs.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + gENERAL_PURPOSEs[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +gENERAL_PURPOSEs[i].getTitle()
                                +"</td>"
                                +"<td>"
                                +gENERAL_PURPOSEs[i].getDescription()
                                + "</td>"
                                + "<td>"
                                + "<a href=\"GENERAL_PURPOSE.jsp?action=search&id="+ gENERAL_PURPOSEs[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"GenPurpose?action=delete&id="+ gENERAL_PURPOSEs[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";
        request.getSession().setAttribute("table", table);
        
        DevelopmentKit devKit = new DevelopmentKit();
        String devKitList = devKit.dropDownList(request, response);
        
        request.getSession().setAttribute("devKitList", devKitList);
        
        request.getRequestDispatcher("/backend/GeneralPurpose.jsp").forward(request, response);   
    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        
        String title= request.getParameter("title"); 
        String description= request.getParameter("description");
        String procDataBus = request.getParameter("procDataBus");
        Double ramAmount = Double.parseDouble(request.getParameter("ramAmount"));
        String ramType = request.getParameter("ramType");
             
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.GENERAL_PURPOSEDAO eSCA_ORMGENERAL_PURPOSEDAO = lDAOFactory.getGENERAL_PURPOSEDAO();
            esca_orm.GENERAL_PURPOSE eSCA_ORMGENERAL_PURPOSE = eSCA_ORMGENERAL_PURPOSEDAO.createGENERAL_PURPOSE();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ADD_FEATURE
            eSCA_ORMGENERAL_PURPOSE.setTitle(title);
            eSCA_ORMGENERAL_PURPOSE.setDescription(description);
            
            
            eSCA_ORMGENERAL_PURPOSEDAO.save(eSCA_ORMGENERAL_PURPOSE);
            
            esca_orm.dao.MiniSpecificationDAO minSpecDao = lDAOFactory.getMiniSpecificationDAO();
            esca_orm.MiniSpecification minSpec = minSpecDao.createMiniSpecification();
            
            minSpec.setProcessorDataBus(procDataBus);
            minSpec.setRamAmmount(ramAmount);
            minSpec.setRamType(ramType);
            minSpec.setGENERAL_PURPOSE(eSCA_ORMGENERAL_PURPOSE);
            
            minSpecDao.save(minSpec);
            
            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("GenPurpose?action=list").forward(request, response); 
            //request.getRequestDispatcher("/backend/GeneralPurpose.jsp").forward(request, response);   
        }
        catch (Exception e) {
                t.rollback();
        }
            
        
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        int id= Integer.parseInt(request.getParameter("id"));
            System.out.println("hola");
            PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();
		try {
			esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
			esca_orm.dao.GENERAL_PURPOSEDAO eSCA_ORMGENERAL_PURPOSEDAO = lDAOFactory.getGENERAL_PURPOSEDAO();
			esca_orm.GENERAL_PURPOSE eSCA_ORMGENERAL_PURPOSE = eSCA_ORMGENERAL_PURPOSEDAO.loadGENERAL_PURPOSEByORMID(id);
			// Delete the persistent object
			eSCA_ORMGENERAL_PURPOSEDAO.delete(eSCA_ORMGENERAL_PURPOSE);
			
			t.commit();
                        request.getRequestDispatcher("GenPurpose?action=list").forward(request, response); 
		}
		catch (Exception e) {
			t.rollback();
                        System.out.println("error");
		}
    }
    
    /*
    public void dropDownList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException{
        String dropDown = "<select class=\"form-control\">\n";
        
        GENERAL_PURPOSE[] generalPurposes = esca_orm.DAOFactory.getDAOFactory().getGENERAL_PURPOSEDAO().listGENERAL_PURPOSEByQuery(null, null);
        for(int i = 0; i < generalPurposes.length; i++) {
            
            dropDown+="<option>"+generalPurposes[i].getTitle()+"</option>\n";
        }
                        
        dropDown+= "</select>";

        request.getSession().setAttribute("dropDown", dropDown);
        request.getRequestDispatcher("assistant.jsp").forward(request, response);   
    }*/
    
    public String dropDownList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException{
        String dropDown = "<select id=\"genPurpList\" name=\"genPurpList\"  class=\"form-control\">\n";
        //form=\"getSys\"
        GENERAL_PURPOSE[] generalPurposes = esca_orm.DAOFactory.getDAOFactory().getGENERAL_PURPOSEDAO().listGENERAL_PURPOSEByQuery(null, null);
        for(int i = 0; i < generalPurposes.length; i++) {
            
            dropDown+="<option value="+generalPurposes[i].getORMID()+">"+generalPurposes[i].getTitle()+"</option>\n";
        }
                        
        dropDown+= "</select>";
        
        return dropDown; 
    }
    
}
