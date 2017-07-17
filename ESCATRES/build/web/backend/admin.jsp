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
        <link href="../css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../css/estilo.css" rel="stylesheet">

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
               <jsp:include page="../htmlResources/Menu.jsp" />
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    
                    <div class="row">
                        <div class="col-lg-12">
                            <a href="#menu-toggle" class="btn btn-primary" id="menu-toggle"><i class="glyphicon glyphicon-menu-hamburger"></i> Menu</a>
                            <h1>Admin ESCA</h1>
                            <p>Manage your devices in this page.</p>
                            <!--<a href="#add-asign-btn" class="btn btn-primary" id="add-asign-btn">Agregar Asignatura</a>-->
                            <div id="panel-add-asign" class="panel panel-default" style="display: none">
                                <div class="panel-body">
                                <form class="form-inline" role="form">
                                    <div class="form-group">
                                        <label for="name">Nombre</label>
                                        <input class="form-control" id="name" placeholder="Enter name">
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Codigo</label>
                                        <input type="email" class="form-control" id="email" placeholder="Enter code">
                                    </div>
                                    <div class="form-group">
                                        <label for="pwd">Profesor</label>
                                        <div class="btn-group btn-input clearfix">
                                            <button type="button" class="btn btn-default dropdown-toggle form-control" data-toggle="dropdown">
                                              <span data-bind="label">Selecciona</span> <span class="caret"></span>
                                            </button>
                                            <ul class="dropdown-menu" role="menu">
                                              <li><a href="#">Item 1</a></li>
                                              <li><a href="#">Another item</a></li>
                                              <li><a href="#">This is a longer item that will not fit properly</a></li>
                                            </ul>
                                        </div>
                                        <button type="button" class="btn btn-default" data-toggle="modal" data-target="#popupNuevaAventura" > <i class="glyphicon glyphicon-plus"></i></button>
                                    </div>
                                    <button type="submit" class="btn btn-success">Register</button>
                                    <button id="hide" type="button" class="btn btn-danger">Cancelar</button>
                                </form>
                                </div>    
                            </div>
                            
                        </div>
                    </div>
                    
                    <h3>Hardware/Devices</h3>
                    
                    <ul class="">
                        <li class=""><a href="../DevelopmentKit?action=list">Development Kit Boards</a></li>
                        <li class=""><a href="../Processor?action=list">Processor</a></li>
                        <li class=""><a href="../Ram?action=list">Memory RAM</a></li>
                        <li class=""><a href="../Rom?action=list">Memory ROM</a></li>
                    </ul>
                    
                    <h3>Requirements/Constraints</h3>
                    
                    <ul class="">
                        <li class=""><a href="../GenPurpose?action=list">General Purposes</a></li>
                        <li class=""><a href="../ExtraFeature?action=list">Extra Features</a></li>
                        <li class=""><a href="../Constraint?action=list">Constraints</a></li>
                    </ul>
                    
                    <h3>Types</h3>
                    
                    <ul class="">
                        <li class=""><a href="../TypePort?action=list">Port Types</a></li>
                        
                    </ul>
                    <br>
                    
                        
                    
                    <!--
                    <div class="panel panel-primary">
                        <-- Default panel contents --
                        <div class="panel-heading">Lista Asignaturas</div>

                            <!-- Table --      
                        <table class="table">
                          <thead>
                            <tr>
                              <th>Firstname</th>
                              <th>Lastname</th>
                              <th>Email</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <td>John</td>
                              <td>Doe</td>
                              <td>john@example.com</td>
                            </tr>
                            <tr>
                              <td>Mary</td>
                              <td>Moe</td>
                              <td>mary@example.com</td>
                            </tr>
                            <tr>
                              <td>July</td>
                              <td>Dooley</td>
                              <td>july@example.com</td>
                            </tr>
                          </tbody>
                        </table>
                    </div>
                -->
                
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
                $("#panel-add-ram").hide("fast");
              });
              $("#add-ram-btn").click(function(){
                $("#panel-add-ram").show("fast");
              });
            });
        </script>
        
        
        <script>
        function nuevoProfesor(){
           document.getElementById("nuevoProfesor").submit();
        }
        </script> 


    </body>
</html>
