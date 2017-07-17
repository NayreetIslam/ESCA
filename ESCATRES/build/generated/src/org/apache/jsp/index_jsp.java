package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../bootstrap/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"./../bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\">\n");
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
      out.write("            <div id=\"sidebar-wrapper\" >\n");
      out.write("                \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "htmlResources/Menu.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <a href=\"#menu-toggle\" class=\"btn btn-primary\" id=\"menu-toggle\"><i class=\"glyphicon glyphicon-menu-hamburger\"></i> Menu</a>\n");
      out.write("                            <h1>Embedded System Configuration Assistant</h1>\n");
      out.write("                            <p>ESCA (Embedded System Configuration Assistant) is a project that borns on University of Ontario Institute of Technology, ON, Canada in conjunction with Universidad de La Frontera, Temuco, Chile. This project tries to mix two big topics: Embedded Systems and Software Product Lines and seeks to assist in the construction phase of a determinate embedded system.</p>\n");
      out.write("                            <p>ESCA consist in an open web application that supports the stage of select the correct hardware and devices to build a specific embedded system with a determinate purpose(s). </p>\n");
      out.write("                            <p>It Selects the best configurations of devices that satisfy a set of requirements and constraints provided by the user returning specific final product specifications to build that system. </p>\n");
      out.write("                            <p>In \"Assitant\" section, you can try it.</p>\n");
      out.write("                            <!--<a href=\"#add-asign-btn\" class=\"btn btn-primary\" id=\"add-asign-btn\">Agregar Asignatura</a>-->\n");
      out.write("                            <br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <img src=\"https://login.uoit.ca/cas/images/uoit/uoit_logo.png\" width=\"300px\"> \n");
      out.write("                    <img>\n");
      out.write("                    <!--\n");
      out.write("                        <div class=\"panel panel-default\" style=\"background-color: #e3eef8\">\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <h3 style=\"margin-top: 10px;\">1. Name</h3>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-3\">\n");
      out.write("                                    <img src=\"images/default.jpg\" width=\"100%\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-9\">\n");
      out.write("                                    <p>Company:</p>\n");
      out.write("                                    <p>Cost:</p>\n");
      out.write("                                    <p>Procesor:</p>\n");
      out.write("                                    <p>RAM:</p>\n");
      out.write("                                    <p>ROM:</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
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
