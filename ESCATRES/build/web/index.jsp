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
        <link rel="stylesheet" href="./../bootstrap/css/bootstrap-theme.min.css">
        <script src="./../bootstrap/js/bootstrap.min.js"></script>
        
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
            <div id="sidebar-wrapper" >
                
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
                            <p>ESCA (Embedded System Configuration Assistant) is a project that borns on University of Ontario Institute of Technology, ON, Canada in conjunction with Universidad de La Frontera, Temuco, Chile. This project tries to mix two big topics: Embedded Systems and Software Product Lines and seeks to assist in the construction phase of a determinate embedded system.</p>
                            <p>ESCA consist in an open web application that supports the stage of select the correct hardware and devices to build a specific embedded system with a determinate purpose(s). </p>
                            <p>It Selects the best configurations of devices that satisfy a set of requirements and constraints provided by the user returning specific final product specifications to build that system. </p>
                            <p>In "Assitant" section, you can try it.</p>
                            <!--<a href="#add-asign-btn" class="btn btn-primary" id="add-asign-btn">Agregar Asignatura</a>-->
                            <br>
                        </div>
                    </div>
                    
                    <img src="https://login.uoit.ca/cas/images/uoit/uoit_logo.png" width="300px"> 
                    <img>
                    <!--
                        <div class="panel panel-default" style="background-color: #e3eef8">
                            <div class="panel-body">

                                <h3 style="margin-top: 10px;">1. Name</h3>

                                <div class="col-lg-3">
                                    <img src="images/default.jpg" width="100%">

                                </div>
                                <div class="col-lg-9">
                                    <p>Company:</p>
                                    <p>Cost:</p>
                                    <p>Procesor:</p>
                                    <p>RAM:</p>
                                    <p>ROM:</p>
                                </div>


                            </div>
                        </div>
                    -->
                    </div>
                </div>
            </div>
            
            <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        
    </body>
</html>
