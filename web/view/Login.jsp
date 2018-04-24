<%-- 
    Document   : logDemo
    Created on : 24 Jan, 2017, 5:05:20 AM
    Author     : asmita shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Form</title>

        <!-- Custom CSS -->
        <link href="assets/css1/style.css" rel='stylesheet' type='text/css' />
     
<style>
    .bkg
    {
    background: url('images/blue1_1.jpg');
    background-size: cover;
    min-height: 799px;  
    z-index: -1;
    height: 100%;
    width: 100%;
    
}
.grid
{
    color: #D7E5E6!important;
    font-size: 2.3em;
    margin-top:30px;
    text-align: left;
    text-transform:uppercase;
}
.button
{
    color:white!important;
    font-size: 2.3em;
    text-align: center;
    text-transform:uppercase;
        
}
.login-box{
    margin-top: 12%;
    box-shadow: 10px 10px 5px #888888!important;
    /*opacity: 0.5;*/
}
.z{
    background-color: black!important;
    box-shadow: 10px 10px 5px #888888!important;
    
}
.shadow{
      text-shadow: 1px 1px #888888;
}

</style>

</head>
<body class="dashboard-page">
    <%@include file="ClientHeader.jsp" %>
    <div class="bkg img-responsive">
	<div class="main-grid">
            <div class="agile-grids">	
		<!-- validation -->
		<div class="grids">
                    <div class=" panel panel-widget agile-validation">
			<div class="login-box validation-grids validation-grids-right login-form">
                      	    <div class=" widget-shadow login-form-shadow" data-example-id="basic-forms"> 
				<div class="input-info">
                        	    <h3 class="shadow">Login form :</h3>
				</div>
				<div class="form-body form-body-info">
                                    <form data-toggle="validator" novalidate=""  action="../LoginController" method="post">
					<div class="form-group has-feedback">
                                            <input type="text" class="form-control" name="username" placeholder="Enter Your Username" data-error="Bruh, that email address is invalid" required="">
						<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
					</div>
					<div class="form-group">
					    <input type="password" data-toggle="validator" data-minlength="6" class="form-control inputPassword" name="password" placeholder="Password" required="">
                                        </div>
					<div class="bottom">
				       	    <div class="form-group">
                                                <label class="shadow">
                                                    <a href="reset.jsp"><p>Forgot Password?</a>
						</label>			
	               			    </div>
					    <div class="form-group button">
                                                <input type="submit" class="btn z btn-md" name="Login" value="LOGIN">
					    </div>						
                                            
					</div>
				    </form>
				</div>
			    </div>
		        </div>
		    </div>
	        </div>
	    </div>
	</div>

</body>

</html>

