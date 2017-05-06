<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <title>Display Houses To User</title>
        
    </head>
    
    <body>        
         <div class="container" >
             <h3>  <i> Logged in as ${username}</i> </h3>    
        <form action="HouseServlet" method="post">
            <c:set var="houseList" value="${houseList}" scope="session"/>
            
            
           <table class="table">
  
    <tr>
      <th>House Id</th>
                    <th>Location</th>
                    <th>Area</th>
                    <th>Cost</th>
                    <th>Builders</th>
                    <th>Status</th>
                    <th>Bedrooms&Bathrooms</th>
                    <th>photos</th>                    
                    <th></th>
                    <th></th>
    </tr>
  
  <tbody>
      <c:forEach var="house" items="${houseList}" >
    <tr>
      <td>${house.homeId}</td>
                        <td>${house.address}</td>
                        <td>${house.area}</td>
                        <td>${house.cost}</td>
                        <td>${house.company}</td>
                        <td>${house.status}</td>
                        <td>${house.noBdAndBa}</td>
                        <td>${house.contact}</td>
                        <td><a href="HouseServlet?action=purchaseHouse&amp;homeId=${house.homeId}&amp;uemail=${username}">Purchase</a></td>
    </tr>
</c:forEach>
  </tbody>
</table> 
            <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
            
            
        </form>
         </div>
        <!-- Hint! You need to code a form for the 'Add Product' button -->
    </body>
</html>
