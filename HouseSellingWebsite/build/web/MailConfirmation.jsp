<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>Mail Confirmation</title>
    </head>
    <style>
   .send_email_panel{
    padding: 20px;
    border: 1px solid #ccc;
    max-width: 200px;
    text-align: center;
    background: #fefefe;
    margin: auto;
}
.pad_top{
    float:left;
}
.form_box{
    padding:5px;
}
.submit_confirm {
    border: 0;
    padding: 10px;
    width: 92%;
    margin: 0 1px;
    background: #333;
    color: #ccc;
    border-radius: 3px;
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
.email_text {
    padding: 5px;
    border-radius: 3px;
    border: 1px solid #ccc;
    margin-bottom: 10px;
}
.header_in_page {
    width: 100%;
}
.clear_fix{
    clear:both;
}
    </style>
    <body class="container">
       <div class="header_in_page"> <a href="index.jsp"class="logout">Logout</a>
           <div class="clear_fix"></div>
        <blockquote class="send_email_panel">
        <h3>House Interested</h3>
        <form action="EmailServlet" method="post" class="form_box">
         
         <label class="pad_top">Email:</label>
         <input type="email" name="email" class="email_text">
        <input type="submit" value="send confirmation" class="submit_confirm">
        
         </form>
        </blockquote>
    </body>
</html>
