<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESCA - @cheloesperguel</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/estilo.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>

        <div id="wrapper">

            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <jsp:include page="htmlResources/Menu.jsp" />
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    
                    <div class="row">
                        <div class="col-lg-12">
                            <a href="#menu-toggle" class="btn btn-primary" id="menu-toggle"><i class="glyphicon glyphicon-menu-hamburger"></i> Menu</a>
                            <h1>Embedded System Configuration Assistant</h1>
                            <p>Select your requirements to find the right configuration.</p>
                            <!--<a href="#add-asign-btn" class="btn btn-primary" id="add-asign-btn">Agregar Asignatura</a>-->
                            <br>
                            
                                                        
                        </div>
                    </div>
                    
                <div class="panel panel-primary">
                <div id="genPurpDiv" class="panel-heading">Select your requirements</div>
                <div onclick="" class="panel-body">
                    
                    <form class="form"  role="form" action="${pageContext.request.contextPath}/GetSystems" method="POST">
                    
                    <h3>General Purpose</h3>
                        
                    <%=request.getSession().getAttribute("dropDown")%>
                    
                    <br>
                    <div id="descGenPurpDiv" class="alert alert-warning" role="alert" style="display:none">
                        <strong>Description:</strong><br>
                        <div id="contentDesc">
                            
                        </div>
                    </div>
                    
                    <h3>Additional Features</h3>
                    
                    <div id="extraFeaturesDiv">

                    </div>
                     

                    <h3>Constraints <button type="button" class="btn btn-primary">Manage</button></h3>
                    
                    <%=request.getSession().getAttribute("display")%>
 
                    <button type="submit" class="btn btn-primary">Continue</button>
                    </form>
                </div>
                </div>

                </div>
            </div>
        </div>
                    
        <!-- /#wrapper -->
        <!-- Modal Escenario-->
        <div class="modal fade" id="popupNuevaAventura" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Cerrar</span></button>
                <h4 class="modal-title" id="myModalLabel">Creando nuevo profesor</h4>
              </div>
              <div id="nuevaAventura" class="modal-body">
                  <form id="nuevoProfesor" action="ControlaProfesores" role="form" method="post">
                      <div class="form-group">
                        <label for="nombreProfesor">Nombre</label>
                        <input type="text" class="form-control" name="nombreProfesor" placeholder="Ingresa nombre" required>
                      </div>
                      <div class="form-group">
                        <label for="tiempoJuego">Email</label>
                        <input type="text" class="form-control" name="emailProfesor" placeholder="email@dominio.com" required>                      
                      </div>        
                   </form>      
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                <button type="button" class="btn btn-primary" id="botonAventura" onClick="nuevoProfesor()">Crear</button>        
              </div>
            </div>
          </div>
        </div>
        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        
        <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });

        </script>

                            
        <script type="text/javascript">
            $(document).ready(function(){
              $("#hide").click(function(){
                $("#panel-add-asign").hide("fast");
              });
              $("#add-asign-btn").click(function(){
                $("#panel-add-asign").show("fast");
              });
            });
        </script>
        
        
        <script>
        function nuevoProfesor(){
           document.getElementById("nuevoProfesor").submit();
        }
        
        </script> 
        
        <script type="text/javascript">
            function refreshExtraFeature(){

               $("#extraFeaturesDiv").load('Assistant?action=listExtraFeature&idSelected='+$('#genPurpList option:selected').val());
            }
            refreshExtraFeature();  //out of function to run ASAP page load     
        </script> 
        
        <script type="text/javascript">
            function refreshDescription(){
               $("#descGenPurpDiv").hide("fast");
               $("#descGenPurpDiv").show("fast");
               $("#contentDesc").load('Assistant?action=showDesc&idSelected='+$('#genPurpList option:selected').val());
            }
            refreshDescription();       
        </script> 
        
        <script type="text/javascript">
            $(document).ready(function() {
                $('#genPurpList').change(function(){
                    refreshExtraFeature();
                    refreshDescription();
                    //$("#extraFeaturesDiv").load('Assistant?action=listExtraFeature&idSelected='+$('#genPurpList option:selected').val());
                });
                
            });
        </script>


    </body>
</html>
