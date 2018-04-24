

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up Form</title>

        <!-- Custom CSS -->
        <link href="assets/css1/style.css" rel='stylesheet' type='text/css' />
     
<style>
    .bkg
    {
    background: url('images/blue1_1.jpg');
    background-size: cover;
    min-height: 799px;  
    z-index: -1; 
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
.signin-box{
    margin-top: 10%;
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
.help{
    font-size: 1em;
    color: #333;
    padding-bottom:-50px;
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
                    <div class="forms-grids">
			<div class="forms3">
                            <div class="w3agile-validation w3ls-validation">
				<div class="panel panel-widget agile-validation register-form">
                                    <div class="signin-box validation-grids widget-shadow" data-example-id="basic-forms"> 
					<div class="input-info">
                                            <h3 class="shadow">Registration Form :</h3>
					</div>
					<div class="form-body form-body-info">
                                            <form action="../SignupController" method="post">
						<div class="form-group valid-form">
                                                    <input type="text" class="form-control" id="inputName" name="username" placeholder="username" required="">
						</div>
						<div class="form-group has-feedback">
                                                    <input type="email" class="form-control inputEmail" name="emailID" placeholder="Email" data-error="That email address is invalid" required="">
							<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
                                                    	<!--<span class="help-block with-errors">Please enter a valid email address</span>-->
						</div>
						<div class="form-group">
						    <input type="password" data-toggle="validator" data-minlength="6" class="form-control inputPassword" name="password" placeholder="Password" required="">
                                                        <!--<span class="help-block">Minimum of 6 characters</span>-->
						</div> 
                                                <div class="form-group">
						    <input type="password" data-toggle="validator" data-minlength="6" class="form-control inputPassword" name="repassword" placeholder="Reenter Password" required="">
                                                        <!--<span class="help-block">Minimum of 6 characters</span>-->
						</div>
                                                <div class="form-group valid-form">
                                                    <input type="radio" class="radio" name="gender" value="0" checked>Male
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="radio" class="radio" name="gender" value="1">Female
                                                </div>
                                                <span class="help">Select your interest</span>
                                                <div class="checkbox">
                                                    <input type="checkbox" name="categories" value="world">World
                                                </div>
                                                <div class="checkbox">
                                                    <input type="checkbox" name="categories" value="technology">Technology
                                                </div>
                                                <div class="checkbox">
                                                    <input type="checkbox" name="categories" value="business">Business
                                                </div>
                                                <div class="checkbox">
                                                    <input type="checkbox" name="categories" value="lifestyle">Lifestyle
                                                </div>
                                                <div class="checkbox">
                                                   <input type="checkbox" name="categories" value="politics">Politics
                                                </div>
                                                <div class="checkbox">
                                                   <input type="checkbox" name="categories" value="sports">Sports
                                                </div>
                                   
												
											
						<div class="form-group button">
                                                    <input type="submit" class="btn z btn-info btn-md" name="Submit" value="SUBMIT">
                                                </div>
                                            </form>
					</div>
                                    </div>
				</div>	
                            </div>
<!--                            <div class="clear"> </div>-->
			</div>
                    </div>
	        </div>
	    </div>
	</div>
    </div>
</body>

</html>

