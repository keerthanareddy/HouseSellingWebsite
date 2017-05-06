<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminLogin</title>
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
</style>
    <body>
    
        
   
    
        <form class="form-horizontal" action="HouseServlet" method="post">
        <div class="container"  >
            <div class="section-header"><br>
                <h1><p class="section-title text-center wow fadeInDown">Login As Admin here</p> </h1>
            </div>
            <div class="container" >
                
                <div class='col-md-6 well' style="left:25%;height: 200%;">
	
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Username:</h4></label>
        <div class="col-md-8">
            <input type="text" name="adminname" class="form-control" title = 'select your user name'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Password:</h4></label>
        <div class="col-md-8">
            <input type="password" name="adminpassword" class="form-control" title = 'select your password'>
        </div>
    </div>
    
	<div class='col-md-offset-3'>
        <input type="submit" name="adminlogin" value="sign in" class="btn btn-primary btn-lg"/>
        <div class="header_in_page"><b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp"class="logout">Logout</a></b></div>
	</div>
            <br><br>

</div>
</div>
           
        </div>
            </form>
</body>
</html>