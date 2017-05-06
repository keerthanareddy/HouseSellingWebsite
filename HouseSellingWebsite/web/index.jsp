<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell Your House</title>
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
    <body id="home" class="homepage">
        
     
   <header id="header">
        <nav id="main-menu" class="navbar navbar-default navbar-fixed-top" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><h1 style="color: #4286f4">Sell Your House</h1></a>
                </div>
				
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="scroll active"><a href="#home">Home</a></li>                        
                        <li class="scroll"><a href="#about">About</a></li>
                        <li class="scroll"><a href="#meet-team">My Account</a></li>
                        <li class="scroll"><a href="#pricing">Register</a></li>
                        <li class="scroll"><a href="#get-in-touch">Contact</a></li>                        
                    </ul>
                </div>
                
                
            </div><!--/.container-->
        </nav><!--/nav-->
    </header><!--/header-->
   
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
    <section id="about">
        <div class="container">

            <div class="section-header"><br>
                <p class="section-title text-center wow fadeInDown">About Us</p>
                <br>
                <p class="text-center wow fadeInDown" style="font-size: 20px;text-align: justify; width: 80%;padding-left: 28%">
                    This website is for selling your House.
                    One can sell his sell his house by posting in this website, where as one can buy the house by logging in as User.
                    Typically, this website conducts business with customers under conditions and terms agreed upon in a agreement or contract, which may be implied, explicit, or written.
                     
                    </p>
                <br><br><br>
            </div>            
        </div>
    </section><!--/#about-->
    <section id="meet-team">
        <div class="container"  >
            <div class="section-header"><br>
                <p class="section-title text-center wow fadeInDown">Login</p>
            </div>
            <div class="container" >
                <br><br>
                <div class='col-md-6 well' style="left:25%;height: 200%;">
	<form class="form-horizontal" action="HouseServlet" method="post">
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Username:</h4></label>
        <div class="col-md-8">
            <input type="text" name="username" class="form-control" title = 'select your user name'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Password:</h4></label>
        <div class="col-md-8">
            <input type="password" name="password" class="form-control" title = 'select your password'>
        </div>
    </div>
    
	<div class='col-md-offset-3'>
        <input type="submit" name="login" value="sign in" class="btn btn-primary btn-lg"/>
        <a href="LoginForAdmin.jsp">Login As Admin</a>
	</div>
            <br><br>
</form>
</div>
</div>
           
        </div>
    </section><!--/#login-->
    <section id="pricing">
        <div class="container">
            <div class="section-header">
                <br>
                <p class="section-title text-center wow fadeInDown">Register</p>                
            </div>
             <div class="container" >
                 
    <div class='col-md-6 well' style="left:25%;height: 100%;">
        <form class="form-horizontal" action="HouseServlet" method="post">
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>FirstName</h4></label>
        <div class="col-md-8">
            <input type="text" name="fname"  value="${HouseServlet.fname}" class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>MiddleName</h4></label>
        <div class="col-md-8">
            <input type="text" name="mname" value="${HouseServlet.mname}" class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>LastName</h4></label>
        <div class="col-md-8">
            <input type="text" name="lname" value="${HouseServlet.lname}"class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>AddressLine</h4></label>
        <div class="col-md-8">
            <input type="text" name="address" value="${HouseServlet.AddressLine1}"class="form-control" title = 'select your user name'>
        </div>
    </div>  
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>City</h4></label>
        <div class="col-md-8">
            <input type="text" name="city" value="${HouseServlet.city}"class="form-control" title = 'select your user name'>
        </div>
    </div> 
        <div class="form-group">
        <label class="col-md-3 control-label"><h4>State</h4></label>
        <div class="col-md-8">
            <input type="text" name="state" value="${HouseServlet.state}"class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>Zipcode</h4></label>
        <div class="col-md-8">
            <input type="text" name="zipcode" value="${HouseServlet.zipcode}"class="form-control" title = 'select your user name'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>EmailID</h4></label>
        <div class="col-md-8">
            <input type="text" name="email" value="${HouseServlet.email}"class="form-control" title = 'select your user name'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Password</h4></label>
        <div class="col-md-8">
            <input type="password" name="password" value="${HouseServlet.password}" class="form-control" title = 'select your password'>
        </div>
    </div>
       <div class="form-group">
        <label class="col-md-3 control-label"><h4>cc_num</h4></label>
        <div class="col-md-8">
            <input type="text" name="ccnum" value="${HouseServlet.ccnum}" class="form-control" title = 'select your user name'>
        </div>
    </div>
     
       <div class="form-group">
        <label class="col-md-3 control-label"><h4>cc_cvv</h4></label>
        <div class="col-md-8">
            <input type="text" name="cvv" value="${HouseServlet.cvv}" class="form-control" title = 'select your user name'>
        </div>
    </div>
	<div class='col-md-offset-3'>
        <input type="submit" name="register" value="Register" class="btn btn-primary btn-lg"/>        
	</div>
</form>
</div>
</div>        
        </div>
    </section><!--/#register-->
    <section id="get-in-touch">
        <div class="container">
            <div class="section-header">
                <h2 class="section-title text-center wow fadeInDown">Get in Touch</h2>
                <p class="text-center wow fadeInDown">email:kganguma@uncc.edu</p>
                <p class="text-center wow fadeInDown">Phone:980-309-3069</p>
            </div>
        </div>
    </section><!--/#contact-->
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
