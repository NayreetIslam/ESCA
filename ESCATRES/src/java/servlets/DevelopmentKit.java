/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import esca_orm.DevelopmentBoardKit;

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
@WebServlet(name = "DevelopmentKit", urlPatterns = {"/DevelopmentKit"})
public class DevelopmentKit extends HttpServlet {

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
        
        String action= request.getParameter("action");
         
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
                String devKitList = dropDownList(request, response);
                request.getSession().setAttribute("devKitList", devKitList);
                request.getRequestDispatcher("GeneralPurpose.jsp").forward(request, response);
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
            Logger.getLogger(DevelopmentKit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void list(HttpServletRequest request, HttpServletResponse response) throws PersistentException, ServletException, IOException{
        /* TODO output your page here. You may use following sample code. */
        
                
        String table = " "
                + " <table class=\"table\"> "
                + "                    <tr> "
                + "                            <td>Id(PK)</td>"
                + "                            <td>Name</td>"
                + "                            <td>Company</td>"
                + "                            <td></td>"
                + "                            <td></td>"
                + "                    </tr>";


        esca_orm.DevelopmentBoardKit[] DevKits = esca_orm.DAOFactory.getDAOFactory().getDevelopmentBoardKitDAO().listDevelopmentBoardKitByQuery(null, null);
        for(int i = 0; i < DevKits.length; i++) {
                        table+="<tr>"
                                + "<td>"
                                + DevKits[i].getORMID()
                                +"</td>"
                                + "<td>"
                                +DevKits[i].getName()
                                +"</td>"
                                +"<td>"
                                +DevKits[i].getCopany()
                                + "</td>"
                                + "<td>"
                                + "<a href=\"DevelopmentKit.jsp?action=search&id="+ DevKits[i].getORMID()+"\">Edit</a>"
                                + "</td>"
                                + "<td>"
                                + "<a href=\"DevelopmentKit?action=delete&id="+ DevKits[i].getORMID()+"\">Delete</a>"
                                + "</td>"
                     + "</tr>";
        }

        table+= "</table>";
        
        Processor processor = new Processor();  
        String processorsList = processor.dropDownList();
        request.getSession().setAttribute("processorList", processorsList);
        
        Ram ram = new Ram();
        String ramList = ram.dropDownList();      
        request.getSession().setAttribute("ramList", ramList);
        
        Rom rom = new Rom();
        String romList = rom.dropDownList();      
        request.getSession().setAttribute("romList", romList); 
        
        TypePort type = new TypePort();
        
        String typePortList = type.dropDownList();
        request.getSession().setAttribute("typePortList", typePortList);
        
        request.getSession().setAttribute("table", table);
        request.getRequestDispatcher("/backend/DevelopmentKit.jsp").forward(request, response);   
    }
    
    public void add(HttpServletRequest request, HttpServletResponse response) throws PersistentException{
        
        String name= request.getParameter("name"); 
        String company= request.getParameter("company");
        int  idProcessor= Integer.parseInt(request.getParameter("processorList"));
        int  idRam= Integer.parseInt(request.getParameter("ramList"));
        int idRom= Integer.parseInt(request.getParameter("romList"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        
        PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();

        try {
            esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
            esca_orm.dao.DevelopmentBoardKitDAO devKitDAO = lDAOFactory.getDevelopmentBoardKitDAO();
            esca_orm.DevelopmentBoardKit devKit = devKitDAO.createDevelopmentBoardKit();
           
            esca_orm.dao.ProcessorDAO processorDao = lDAOFactory.getProcessorDAO();
            esca_orm.Processor processor = processorDao.getProcessorByORMID(idProcessor);
            
            esca_orm.dao.RAMDAO ramDao = lDAOFactory.getRAMDAO();
            esca_orm.RAM ram = ramDao.getRAMByORMID(idRam);
            
            esca_orm.dao.ROMDAO romDao = lDAOFactory.getROMDAO();
            esca_orm.ROM rom = romDao.getROMByORMID(idRom);
            
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ADD_FEATURE
            devKit.setName(name);
            devKit.setCopany(company);
            devKit.setRAM(ram);
            devKit.setProcessor(processor);
            devKit.setROM(rom);
            devKit.setCost(cost);
            
            devKitDAO.save(devKit);

            t.commit();
            //response.sendRedirect("backend/GeneralPurpose.jsp");
            request.getRequestDispatcher("DevelopmentKit?action=list").forward(request, response); 
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
			esca_orm.dao.DevelopmentBoardKitDAO devKitDao = lDAOFactory.getDevelopmentBoardKitDAO();
			esca_orm.DevelopmentBoardKit devKit = devKitDao.loadDevelopmentBoardKitByORMID(id);
			// Delete the persistent object
			devKitDao.delete(devKit);
			
			t.commit();
                        request.getRequestDispatcher("DevelopmentKit?action=list").forward(request, response); 
		}
		catch (Exception e) {
			t.rollback();
		}
    }
    
    public String dropDownList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException{
        String devKitList = "<select id=\"devKitList\" name=\"devKitList\"class=\"form-control\">\n";
        
        DevelopmentBoardKit[] devKits = esca_orm.DAOFactory.getDAOFactory().getDevelopmentBoardKitDAO().listDevelopmentBoardKitByQuery(null, null);
        for(int i = 0; i < devKits.length; i++) {
            
            devKitList+="<option value="+devKits[i].getORMID()+">"+devKits[i].getName()+"</option>\n";
            
        }
                        
        devKitList+= "</select>";
        
        return devKitList;
           
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
            Logger.getLogger(DevelopmentKit.class.getName()).log(Level.SEVERE, null, ex);
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
