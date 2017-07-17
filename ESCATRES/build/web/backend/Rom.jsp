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
               <jsp:include page="../htmlResources/Menu.jsp" />
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    
                                      
                    <h3>Rom List</h3>
        
                    <br>
                    <a href="#add-rom-btn" class="btn btn-primary" id="add-rom-btn">Add</a>
                    <br>
                    <br>
                    
                    <div id="panel-add-rom" class="panel panel-default" style="display: none">

                        <div class="panel-body">
                        <form class="form"  role="form" action="${pageContext.request.contextPath}/Rom" method="GET">
                            
                            <input class="form-control" name="action" id="action" value="add" style="display:none">
                            <div class="form-group">
                                <label for="name">Name</label>
                                <input class="form-control" name="name" id="name" placeholder="Enter name">
                            </div>
                            
                            
                            <div style="display: flex"> 
                                <div class="form-group">
                                    <label for="amount">Amount</label>
                                    <input style="display: inline-block; width: 80%" type=number step=0.01 min="0" class="form-control" name="amount" id="amount" placeholder="Enter amount">
                                </div>
                                <div class="form-group">
                                    <label for="metric">Metric</label>
                                    <select style="display: inline-block; width: 80%" name="metric" class="form-control">
                                        <option>kB</option>
                                        <option>MB</option>                                                                          
                                    </select>                                  
                                </div>
                            </div>
                                                       
                            <div class="form-group">
                                <label for="type">Type</label>
                                <select name="type" class="form-control">
                                    <option>PROM</option>
                                    <option>EPROM</option>
                                    <option>EEPROM</option>
                                </select>                            
                            </div>
                            
                                                        
                            <!--
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
                            -->
                            
                            <button type="submit" class="btn btn-success">Register</button>
                            <button id="hide" type="button" class="btn btn-danger">Cancelar</button>
                        </form>
                        </div>    
                    </div>
                    
                   
                    
                    <div class="panel panel-primary">
                        <!-- Default panel contents -->
                        <div class="panel-heading"> Table </div>
                        <div class="panel-body">
                                                                                   
                            <%=request.getSession().getAttribute("table")%>
                            
                        </div>
                    </div>
                     
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
            <a href="#" class="btn btn-primary" id="add-asign-bt">Continue</a>

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
                $("#panel-add-rom").hide("fast");
              });
              $("#add-rom-btn").click(function(){
                $("#panel-add-rom").show("fast");
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
