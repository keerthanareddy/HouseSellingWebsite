<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <title>UserLoginIn</title>
        <link href="CSS/font-awesome.min.css" rel="stylesheet">
    <link href="CSS/animate.min.css" rel="stylesheet">
    <link href="CSS/owl.carousel.css" rel="stylesheet">
    <link href="CSS/owl.transitions.css" rel="stylesheet">
    <link href="CSS/prettyPhoto.css" rel="stylesheet">
    <link href="CSS/main.css" rel="stylesheet">
    <link href="CSS/responsive.css" rel="stylesheet">        
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head>
    <body>
           <header id="header">
        <nav id="main-menu" class="navbar navbar-default navbar-fixed-top" role="banner">
            <div class="container">
	<!--	   		 -->
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="scroll"><a href="HouseServlet?action=viewhousesbyuser&amp;uemail=${username}">View My Interested Houses</a></li>                        
                        <li class="scroll"><a href="HouseServlet?action=showpurchases&amp;uemail=${username}">View History</a></li>
                        <li class="scroll"><a href="HouseServlet?action=editprofile&amp;uemail=${username}">Edit Profile</a></li>
                        <li class="scroll"><a href="index.jsp">Logout</a></li>                      
                    </ul>
                </div>
                
                
            </div><!--/.container-->
        </nav><!--/nav-->
    </header><!--/header-->
       <h3>  <i> Hello ${username}</i> </h3>
       <section id="main-slider">
        <br>
        
        <div class="owl-carousel">
            
            <div class="item" style="background-image: url(images/slider/background1.jpg);">
              
            </div><!--/.item-->
            <div class="item" style="background-image: url(images/slider/background2.jpg);">
              
            </div>
             <div class="item" style="background-image: url(images/slider/background3.jpeg);">
               
            </div><!--/.item-->
        </div><!--/.owl-carousel-->
    </section><!--/#main-slider-->  
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/mousescroll.js"></script>
    <script src="js/smoothscroll.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/jquery.inview.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/main.js"></script>
    </body>
</html>
