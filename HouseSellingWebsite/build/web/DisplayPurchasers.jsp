<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <title>Display Purchasers</title>
        <style>
            .header_in_page {
    width: 100%;
}
a.logout {
    text-decoration: none;
    /* text-decoration: inherit; */
    text-align: right;
    position: relative;
    right: 0;
    float: right;
    padding: 10px;
    background: #333;
    color: #ffffff;
    border: 0;
    border-radius: 3px;
    right: 20px;
    cursor: pointer;
}
        </style>
    </head>
       <body>
           <div class="container">
        <h3>Houses interested by ${uemail}</h3>       
       <form action="HouseServlet" method="post">
            <c:set var="purchasers" value="${purchasers}" scope="session"/>
            <table class="table">
                <tr>
                    
                    <th>Home Id</th>
                    <th>Location</th>
                    <th>Credit Card Details</th>
                    <th>email</th>
                    <th>Meeting time to discuss about the house with owner</th>                    
                </tr>
                
                <c:forEach var="purchasal" items="${purchasers}" >
                    <tr>                       
                        <td>${purchasal.getHome_id()}</td>
                        <td>${purchasal.location}</td>
                        <td>${purchasal.getCc_num()}</td>
                        <td>${purchasal.getUemail()}</td>  
                        <td>${purchasal.getMeet_time()}</td>
                    </tr> 
                </c:forEach>
                <!-- Hint! Remember to code for the 'Edit' and 'Delete' links -->  
            </table>
            </form>
            <br>
            <b style="color: red;padding-left: 10%;font-size: 30px;"><div class="header_in_page"> <a href="index.jsp"class="logout">Logout</a></div></b>
        <!-- Hint! You need to code a form for the 'Add Product' button -->
           </div>
    </body>
</html>
