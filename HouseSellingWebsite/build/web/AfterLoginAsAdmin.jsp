<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
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
        <form class="form-horizontal" action="HouseServlet" method="post">        
            <div class="section-header">
                <p class="section-title text-center wow fadeInDown">Welcome, Sell Your Own House by filling below</p>
            </div>
            <div class="container" >                
                <div class='col-md-6 well' style="left:25%;height: 200%;">	
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Home Id</h4></label>
        <div class="col-md-8">
            <input type="text" name="homeid" class="form-control" title = 'type your home id'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Location</h4></label>
        <div class="col-md-8">
            <input type="text" name="location" class="form-control" title = 'type your location'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Area</h4></label>
        <div class="col-md-8">
            <input type="text" name="area" class="form-control" title = 'type your area'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Cost</h4></label>
        <div class="col-md-8">
            <input type="text" name="cost" class="form-control" title = 'type your cost that you want to sell'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Company</h4></label>
        <div class="col-md-8">
            <input type="text" name="builders" class="form-control" title = 'type your Constructions name'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Status</h4></label>
        <div class="col-md-8">
            <input type="text" name="status_" class="form-control" title = 'type when your House is constructed'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Number of Bed rooms and Bath rooms</h4></label>
        <div class="col-md-8">
            <input type="text" name="bdba" class="form-control" title = 'type number of bed rooms and bath rooms'>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Contact</h4></label>
        <div class="col-md-8">
            <input type="text" name="contact" class="form-control" title = 'type your phone number'>
        </div>
    </div>    
	<div class='col-md-offset-3'>
        <input type="submit" name="addhouse" value="Add House" class="btn btn-primary btn-lg"/>&nbsp;&nbsp;<input type="submit" name="viewhouses" value="View Houses" class="btn btn-primary btn-lg"/>       
	</div>           
</div>
</div>
            <b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp">Logout</a></b>
</form>
</body>
</html>