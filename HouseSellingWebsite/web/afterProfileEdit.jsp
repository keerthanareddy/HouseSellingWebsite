<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>After Profile Edit</title>
    </head>
    <body>
         <div class="container" >
        <h3>Profile edited as:</h3>
        <blockquote>
        <label>First Name: ${cust.fname}</label><br>
        <label>Middle Name: ${cust.mname}</label><br>
        <label>Last Name: ${cust.lname}</label><br>
        <label>Address: ${cust.getAddressLine1()}</label><br>
        <label>City: ${cust.city}</label><br>
        <label>State: ${cust.state}</label><br>
        
        <label>Zip code: ${cust.zipcode}</label><br>
        <label>Credit Details: ${cust.ccnum}</label><br>
        <label>cvv: ${cust.cvv}</label><br>
        </blockquote>
       <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
         </div>
    </body>
</html>
