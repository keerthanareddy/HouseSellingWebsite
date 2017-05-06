<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <title>Confirm Delete</title>
    </head>
    <body>
          <div class="container" >
 <form action="HouseServlet" method="post"> 
        <h3> Delete this house from your interest list?</h3>
        <blockquote>
        <label>Location: ${home.address}</label><br>
        <label>Area: ${home.area}</label><br>
        <label>Cost: ${home.cost}</label><br>
        <label>Builders: ${home.company}</label><br>
        <label>Status: ${home.status}</label><br>
        <label>Number of Bed rooms and Bath rooms: ${home.noBdAndBa}</label><br>
        <label>Contact: ${home.contact}</label><br>
        
        </blockquote>
        <input type="submit" name = "Yes" value="Yes" class="btn btn-primary btn-sm"/><input type="hidden" name = "homeId" value="${home.homeId}">&nbsp;&nbsp;
        <input type="submit" name = "No" value="No" class="btn btn-primary btn-sm"/> 
        
        </form>
          </div>
       <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
    </body>
</html>
