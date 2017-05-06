<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <title>Edit Profile</title>
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
    </head>
    <body>
        <div class="container">
            <div class="section-header">
                <br>
                <h1 class="section-title text-center wow fadeInDown">Edit Profile</h1>                
            </div>
             <div class="container" >
                 
    <div class='col-md-6 well' style="left:25%;height: 100%;">
        <form class="form-horizontal" action="HouseServlet" method="post">
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>FirstName</h4></label>
        <div class="col-md-8">
            <input type="text" name="fname"  value="${cust.fname}" class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>MiddleName</h4></label>
        <div class="col-md-8">
            <input type="text" name="mname" value="${cust.mname}" class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>LastName</h4></label>
        <div class="col-md-8">
            <input type="text" name="lname" value="${cust.lname}" class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>AddressLine</h4></label>
        <div class="col-md-8">
            <input type="text" name="address" value="${cust.getAddressLine1()}" class="form-control" title = 'select your user name'>
        </div>
    </div>  
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>City</h4></label>
        <div class="col-md-8">
            <input type="text" name="city" value="${cust.city}" class="form-control" title = 'select your user name'>
        </div>
    </div> 
        <div class="form-group">
        <label class="col-md-3 control-label"><h4>State</h4></label>
        <div class="col-md-8">
            <input type="text" name="state" value="${cust.state}" class="form-control" title = 'select your user name'>
        </div>
    </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>Zipcode</h4></label>
        <div class="col-md-8">
            <input type="text" name="zipcode" value="${cust.zipcode}"class="form-control" title = 'select your user name'>
        </div>
    </div
      </div>
            <div class="form-group">
        <label class="col-md-3 control-label"><h4>Email</h4></label>
        <div class="col-md-8">
            <input type="text" name="email" value="${cust.email}"class="form-control" title = 'select your user name'>
        </div>
    </div>
   
    <div class="form-group">
        <label class="col-md-3 control-label"><h4>Password</h4></label>
        <div class="col-md-8">
            <input type="password" name="password" value="${cust.password}" class="form-control" title = 'select your password'>
        </div>
    </div>
       <div class="form-group">
        <label class="col-md-3 control-label"><h4>cc_num</h4></label>
        <div class="col-md-8">
            <input type="text" name="ccnum" value="${cust.ccnum}" class="form-control" title = 'select your user name'>
        </div>
    </div>
     
       <div class="form-group">
        <label class="col-md-3 control-label"><h4>cc_cvv</h4></label>
        <div class="col-md-8">
            <input type="text" name="cvv" value="${cust.cvv}" class="form-control" title = 'select your user name'>
        </div>
    </div>
	<div class='col-md-offset-3'>
        <input type="submit" name="UpdateCustomer" value="edit profile" class="btn btn-primary btn-lg"/>        
	</div>
</form>
</div>
</div>        
        </div>
        <div class="header_in_page"><b style="color: red;padding-left: 10%;font-size: 30px;"> <a href="index.jsp"class="logout">Logout</a></b></div>
    </body>
</html>
