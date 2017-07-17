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
                            <h1>Systems List</h1>
                            <div class="panel panel-default" style="background-color: #34d41c4d">
                                <div class="panel-body">

                                    <p>Runtime: <%=request.getSession().getAttribute("runtime")%> miliseconds.</p>
                                    
                                </div>
                            </div>
                            
                            <p> <%=request.getSession().getAttribute("print")%> </p>
                            <!--<a href="#add-asign-btn" class="btn btn-primary" id="add-asign-btn">Agregar Asignatura</a>-->
                            <br>
                        </div>
                    </div>
                    
                            
                    <!-- Modal Escenario-->
                    <div class="modal fade" id="popupDetails" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                      <div class="modal-dialog">
                        <div class="modal-content">
                          <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Cerrar</span></button>
                            <h4 class="modal-title" id="myModalLabel">Detail Product</h4>
                          </div>
                          <div id="popupBody" class="modal-body row ">
                              
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                          </div>
                        </div>
                      </div>
                    </div>
                    
                </div>
            </div>
        </div>
                            
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        
        <script type="text/javascript">

            $(".processorDetail").click(function(){
                var id = this.id;
                
                $("#popupBody").load("Processor?action=showDetails&idProc="+id);

            });
        </script>
        
        
    </body>
</html>
