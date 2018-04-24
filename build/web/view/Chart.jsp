

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Charts</title>
        <script src='../css/Chart.min.js'></script>
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.5.4/bootstrap-select.min.css"/>
        <style>
            .container1 {
                 width: 50%;
                 height: 30%;
                 margin: auto;
            }
        </style>
    </head>
    <body>
        <%@include file="index.jsp" %> 
        <div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
            <div class="col-sm-offset-2 col-sm-8">
		<select class="form-control" id="graph_type" name="graph_type" style="cursor: pointer">
			<option value="pie" selected>Pie Chart</option>
			<option value="bar">Bar Chart</option>
			<option value="line">Line Chart</option>
			<option value="radar">Radar Chart</option>
			<option value="doughnut">Doughnut Chart</option>
			<option value="polarArea">Polar Area Chart</option>
		</select>
	    </div>
            <div>
                  <canvas  id="myChart" width="600" height="400"></canvas>
            </div>
        </div>
        <div class="container1">
            <div>
                <canvas id="myChart2" width="600" height="400"></canvas>
            </div>
        </div>
    </body>
    <script>
        var ctx = document.getElementById("myChart").getContext('2d');
        var myChart = new Chart(ctx, {
        type: 'doughnut',
        data: {
            labels: ["7AM-3PM", "3PM-11PM", "11PM-7AM"],
            datasets: [{
                backgroundColor: [
                    "#2ecc71",
                    "#3498db",
                    "#95a5a6",
                  ],
            data: [<%=(String)session.getAttribute("dailyClicks")%>]
             // data: [10,10,10]  
         }]
        }
    });
   
    var ctx1 = document.getElementById('myChart2').getContext('2d');
    var myChart1 = new Chart(ctx1, {
      type: 'line',
      data: {
        labels: ["7AM-3PM", "3PM-11PM", "11PM-7AM"],
        datasets: [{
          label: 'no. of views',
          data: [<%=(String)session.getAttribute("dailyClicks")%>],
          backgroundColor: "rgba(153,255,51,0.4)",
          borderColor: "rgba(153,255,51,1)"
        }]
        }
    });

  </script>
</html>
