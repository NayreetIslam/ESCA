package org.apache.jsp.backend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DevelopmentKit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ESCA - @cheloesperguel</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, shrink-to-fit=no, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"../css/estilo.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <div id=\"sidebar-wrapper\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../htmlResources/Menu.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    \n");
      out.write("                                      \n");
      out.write("                    <h3>Developmnet Board List</h3>\n");
      out.write("        \n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#add-proc-btn\" class=\"btn btn-primary\" id=\"add-proc-btn\">Add</a>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <div id=\"panel-add-proc\" class=\"panel panel-default\" style=\"display: none\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                        <form class=\"form\"  role=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Processor\" method=\"GET\">\n");
      out.write("                            \n");
      out.write("                            <input class=\"form-control\" name=\"action\" id=\"action\" value=\"add\" style=\"display:none\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"name\">Name</label>\n");
      out.write("                                <input class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Enter name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"architecture\">Architecture</label>\n");
      out.write("                                <input class=\"form-control\" name=\"architecture\" id=\"architecture\" placeholder=\"Enter architecture\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"clockSpeed\">Clock Speed</label>\n");
      out.write("                                <input type=number step=0.01 min=\"0\" class=\"form-control\" name=\"clockSpeed\" id=\"clockSpeed\" placeholder=\"Enter clock speed\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                                                       \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"dataBus\">Data Bus</label>\n");
      out.write("                                <select name=\"dataBus\" class=\"form-control\">\n");
      out.write("                                    <option>8 bit</option>\n");
      out.write("                                    <option>16 bit</option>\n");
      out.write("                                    <option>32 bit</option>\n");
      out.write("                                    <option>64 bit</option>\n");
      out.write("                                </select>                            \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"numberCores\">Number of Cores</label>\n");
      out.write("                                <select name=\"numberCores\" class=\"form-control\">  \n");
      out.write("                                    ");
 
                                        for(int i=0; i<16;i++){
                                            out.print("<option>"+(i+1)+"</option>");
                                        }
                                    
      out.write("\n");
      out.write("                                </select>                            \n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"cache\">Cache</label>\n");
      out.write("                                <input type=number step=0.01 min=\"0\" class=\"form-control\" name=\"cache\" id=\"cache\" placeholder=\"Enter cache\">\n");
      out.write("                            </div>    \n");
      out.write("                            \n");
      out.write("                            <!--\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"pwd\">Profesor</label>\n");
      out.write("                                <div class=\"btn-group btn-input clearfix\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default dropdown-toggle form-control\" data-toggle=\"dropdown\">\n");
      out.write("                                      <span data-bind=\"label\">Selecciona</span> <span class=\"caret\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                      <li><a href=\"#\">Item 1</a></li>\n");
      out.write("                                      <li><a href=\"#\">Another item</a></li>\n");
      out.write("                                      <li><a href=\"#\">This is a longer item that will not fit properly</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#popupNuevaAventura\" > <i class=\"glyphicon glyphicon-plus\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                            -->\n");
      out.write("                            \n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">Register</button>\n");
      out.write("                            <button id=\"hide\" type=\"button\" class=\"btn btn-danger\">Cancelar</button>\n");
      out.write("                        </form>\n");
      out.write("                        </div>    \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <!-- Default panel contents -->\n");
      out.write("                        <div class=\"panel-heading\"> Table </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                                                                                   \n");
      out.write("                            ");
      out.print(request.getSession().getAttribute("table"));
      out.write("\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     \n");
      out.write("                    <!--\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <-- Default panel contents --\n");
      out.write("                        <div class=\"panel-heading\">Lista Asignaturas</div>\n");
      out.write("\n");
      out.write("                            <!-- Table --      \n");
      out.write("                        <table class=\"table\">\n");
      out.write("                          <thead>\n");
      out.write("                            <tr>\n");
      out.write("                              <th>Firstname</th>\n");
      out.write("                              <th>Lastname</th>\n");
      out.write("                              <th>Email</th>\n");
      out.write("                            </tr>\n");
      out.write("                          </thead>\n");
      out.write("                          <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                              <td>John</td>\n");
      out.write("                              <td>Doe</td>\n");
      out.write("                              <td>john@example.com</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                              <td>Mary</td>\n");
      out.write("                              <td>Moe</td>\n");
      out.write("                              <td>mary@example.com</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                              <td>July</td>\n");
      out.write("                              <td>Dooley</td>\n");
      out.write("                              <td>july@example.com</td>\n");
      out.write("                            </tr>\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                -->\n");
      out.write("            <a href=\"#\" class=\"btn btn-primary\" id=\"add-asign-bt\">Continue</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("        </div>    \n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("        <!-- Modal Escenario-->\n");
      out.write("        <div class=\"modal fade\" id=\"popupNuevaAventura\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("          <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Cerrar</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">Creando nuevo profesor</h4>\n");
      out.write("              </div>\n");
      out.write("              <div id=\"nuevaAventura\" class=\"modal-body\">\n");
      out.write("                  <form id=\"nuevoProfesor\" action=\"ControlaProfesores\" role=\"form\" method=\"post\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label for=\"nombreProfesor\">Nombre</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"nombreProfesor\" placeholder=\"Ingresa nombre\" required>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label for=\"tiempoJuego\">Email</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"emailProfesor\" placeholder=\"email@dominio.com\" required>                      \n");
      out.write("                      </div>        \n");
      out.write("                   </form>      \n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"botonAventura\" onClick=\"nuevoProfesor()\">Crear</button>        \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Menu Toggle Script -->\n");
      out.write("        <script>\n");
      out.write("        $(\"#menu-toggle\").click(function(e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("              $(\"#hide\").click(function(){\n");
      out.write("                $(\"#panel-add-asign\").hide(\"fast\");\n");
      out.write("              });\n");
      out.write("              $(\"#add-asign-btn\").click(function(){\n");
      out.write("                $(\"#panel-add-asign\").show(\"fast\");\n");
      out.write("              });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("        function nuevoProfesor(){\n");
      out.write("           document.getElementById(\"nuevoProfesor\").submit();\n");
      out.write("        }\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
