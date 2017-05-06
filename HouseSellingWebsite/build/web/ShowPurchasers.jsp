<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <title>Show Houses by me</title>
        <style>
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
.header_in_page {
    width: 100%;
   
}
#d1 {
    width:50%; margin:0 auto;
    
}
        </style>
    </head>
    <body>
        <div id="d1"><a href="HouseServlet?action=showpurchases&amp;uemail=${uemail}">click to show my interested Houses</a></div>
        <div class="header_in_page"><b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp"class="logout">Logout</a></b>
                                                                                                 </div>
    </body>
    
</html>
