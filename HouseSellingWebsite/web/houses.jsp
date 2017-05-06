<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>houses</title>
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
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
         <div class="container" >
        <form action="HouseServlet" method="post">
            <c:set var="homeList" value="${homeList}" scope="session"/>
            <table class="table">
                <tr>
                    <th>Home Id</th>
                    <th>Location</th>
                    <th>Area</th>
                    <th>Cost</th>
                    <th>Builders</th>
                    <th>Status</th>
                    <th>Number of Bed rooms and Bath rooms</th>
                    <th>Contact</th>                    
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="home" items="${homeList}" >
                    <tr>
                        <td>${home.homeId}</td>
                        <td>${home.address}</td>
                        <td>${home.area}</td>
                        <td>${home.cost}</td>
                        <td>${home.company}</td>
                        <td>${home.status}</td>
                        <td>${home.noBdAndBa}</td>
                        <td>${home.contact}</td>
                        <td><a href="HouseServlet?action=edit&amp;homeId=${home.homeId}">Edit</a></td>
                        <td><a href="HouseServlet?action=delete&amp;homeId=${home.homeId}">Delete</a></td>
                    </tr> 
                </c:forEach>
                <!-- Hint! Remember to code for the 'Edit' and 'Delete' links -->  
            </table>
            <br>
            <input type="submit" name = "addhouse" value="Add House"/><br>
        </form>
        <!-- Hint! You need to code a form for the 'Add Product' button -->
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
         </div>
           <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
    </body>
</html>
