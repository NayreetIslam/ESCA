/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import esca_bussines.ConstraintValue;
import core.ConstraintFilter;
import core.MinReqFilter;
import esca_orm.DevelopmentBoardKit;
import esca_orm.GENERAL_PURPOSE;
import esca_orm.MiniSpecification;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "GetSystems", urlPatterns = {"/GetSystems"})
public class GetSystems extends HttpServlet {

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
        
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        int genPurpIndex= Integer.parseInt(request.getParameter("genPurpList")); 
        
        String extra[] = request.getParameterValues("extraFeatures");
        double minCost= Double.parseDouble(request.getParameter("minCost"));
        double maxCost= Double.parseDouble(request.getParameter("maxCost"));
        double minWeight= Double.parseDouble(request.getParameter("minWeight"));
        double maxWeight= Double.parseDouble(request.getParameter("maxWeight"));
        
        
        core.MinReqFilter reqFilter = new MinReqFilter(getRequirements(genPurpIndex));
        reqFilter.Filter();
        
        ArrayList<esca_orm.DevelopmentBoardKit> finalList = reqFilter.getDevKits();
        
        ArrayList <esca_bussines.ConstraintValue> constraintList = new ArrayList<>();
        
        esca_bussines.ConstraintValue const1 = new ConstraintValue("range", "Cost", minCost, maxCost);
        constraintList.add(const1);
        esca_bussines.ConstraintValue const2 = new ConstraintValue("range", "Weight", minWeight, maxWeight);
        constraintList.add(const2);
        
        core.ConstraintFilter consFilter = new ConstraintFilter(constraintList, finalList);
        consFilter.filter();
        finalList = consFilter.getDevKitList();
        
        
        
        String print = list(finalList);
        
                    
            // obtener minimum requeriments
            // comparar con feature model
            // obtener todas las combinaciones posibles
            // aplicar filtros
            // devolver
            
            
            
            time_end = System.currentTimeMillis();
            long runtime = time_end - time_start;
          
            
            request.getSession().setAttribute("print", print);
            request.getSession().setAttribute("runtime", runtime);
            request.getRequestDispatcher("/results.jsp").forward(request, response);

        
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
            Logger.getLogger(GetSystems.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GetSystems.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public MiniSpecification getRequirements(int idGeneralPurpose) throws PersistentException{
        
        System.out.println("GENERAL_PURPOSEid="+idGeneralPurpose);
        MiniSpecification spec = esca_orm.DAOFactory.getDAOFactory().getMiniSpecificationDAO().loadMiniSpecificationByQuery("GENERAL_PURPOSEid="+idGeneralPurpose, null);
        
        return spec;
    }
    
    public String list(ArrayList<esca_orm.DevelopmentBoardKit> list){
        
        String printList="";
        
        for (int i=0; i<list.size();i++) {
            
        
        printList+="<div class=\"panel panel-default\" style=\"background-color: #e3eef8\">\n" +
"                        <div class=\"panel-body\">\n" +
"                            \n" +
"                            <h3 style=\"margin-top: 10px;\"> "
                + (i+1)+". "+list.get(i).getName()+"</h3>\n" +
"                            \n" +
"                            <div class=\"col-lg-3\">\n" +
"                                <img src=\""+list.get(i).getUrlImage()+"\" width=\"100%\">\n" +
"\n" +
"                            </div>\n" +
"                            <div class=\"col-lg-9\">\n" +
"                                <p><b>Company:</b> "+ list.get(i).getCopany()+" </p>\n" +
"                                <p><b>Cost:</b> "+list.get(i).getCost()+" USD</p>\n" +
"                                <p><b>Procesor:</b> "+list.get(i).getProcessor().getName()+" "+list.get(i).getProcessor().getClockSpeed()+"GHz "+list.get(i).getProcessor().getCache()+"kB Cache <a class=\"processorDetail\" id=\""+list.get(i).getProcessor().getORMID()+"\" href=\"#popupDetails\" role=\"button\" data-toggle=\"modal\" >Details</a></p> \n" +
"                                <p><b>Data Bus:</b> "+list.get(i).getProcessor().getDataBus()+"-bit</p>\n" +
"                                <p><b>RAM:</b> "+list.get(i).getRAM().getAmount()+" MB "+list.get(i).getRAM().getType()+" "+list.get(i).getRAM().getFrecuency()+"MHz </p>" +
"                                <p><b>ROM:</b> "+list.get(i).getROM().getAmount()+" kB "+list.get(i).getROM().getType()+"</p>\n" +
"                                <p><b>Weight:</b> "+list.get(i).getWeight()+" gr.</p>"+
                  "              <a href=\""+list.get(i).getBuy_url()+"\">Product Page</a>"+                                 
"                            </div>\n" +
"                            \n" +
"                            \n" +
"                        </div>\n" +
"                    </div>";
        }
        
        return printList;
    }
}

