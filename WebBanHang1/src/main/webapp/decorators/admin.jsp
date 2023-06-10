<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Dashboard - Home" /></title>
<link rel="stylesheet"
	href="<c:url value='/template/admin/css/main.css'/>" type="text/css">
<!-- Font-icon css-->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<c:url value = '/template/admin/css/product.css'/>">
</head>
<body class="app sidebar-mini">

	<!-- header -->
	<%@include file="/common/admin/header.jsp"%>
	<!-- header -->
	<!-- menu -->
	<%@include file="/common/admin/menu.jsp"%>
	<!-- menu -->
	<div id="content">
		<dec:body />
	</div>

	<script src="<c:url value='/template/admin/js/jquery-3.3.1.min.js'/>"></script>
	<script></script>
	<script src="<c:url value='/template/admin/js/popper.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/main.js'/>"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="<c:url value='/template/admin/js/plugins/pace.min.js'/>"></script>
	<!-- Page specific javascripts-->
	<script>
      	function showMessLogOut(){
      		var option = confirm("Bạn có chắc muốn đăng xuất ?");
      		if (option === true){
      			window.location.href = 'log-out';
      		}
      	}
      	function showMess(id){
			var option = confirm('Bạn có chắc rằng muốn xóa ?');
			if (option === true){
				window.location.href = 'delete-user?user_id='+id;
			}
		}
      	function showMessDeleteProduct(id){
			var option = confirm('Bạn có chắc rằng muốn xóa ?');
			if (option === true){
				window.location.href = 'delete-product?product_id='+id;
			}
		}
      	function showUpdateProduct(idproduct){
    		var option = confirm('Bạn có chắc rằng muốn cập nhật ?');
    		if (option === true){
    			document.getElementById('form_product').action = "admin-edit-product?idproduct="+idupdate;
    			document.getElementById('active_submit').type = "submit";
    		}else{
    			document.getElementById('form_1').action = "admin-product";
    			document.getElementById('active_submit').type = "submit";
    		}
    	}
      	function showMessDeleteCategory(id){
			var option = confirm('Bạn có chắc rằng muốn xóa ?');
			if (option === true){
				window.location.href = 'delete-category?category_id='+id;
			}
		}
      	function showMessDelOrder(id){
			var option = confirm('Bạn có chắc rằng muốn xóa ?');
			if (option === true){
				window.location.href = 'admin-delete-order?order_id='+id;
			}
		}
      </script>
      <script type="text/javascript">
      var data = {
      	labels: ["January", "February", "March", "April", "May"],
      	datasets: [
      		{
      			label: "My First dataset",
      			fillColor: "rgba(220,220,220,0.2)",
      			strokeColor: "rgba(220,220,220,1)",
      			pointColor: "rgba(220,220,220,1)",
      			pointStrokeColor: "#fff",
      			pointHighlightFill: "#fff",
      			pointHighlightStroke: "rgba(220,220,220,1)",
      			data: [65, 59, 80, 81, 56]
      		},
      		{
      			label: "My Second dataset",
      			fillColor: "rgba(151,187,205,0.2)",
      			strokeColor: "rgba(151,187,205,1)",
      			pointColor: "rgba(151,187,205,1)",
      			pointStrokeColor: "#fff",
      			pointHighlightFill: "#fff",
      			pointHighlightStroke: "rgba(151,187,205,1)",
      			data: [28, 48, 40, 19, 86]
      		}
      	]
      };
      var pdata = [
      	{
      		value: 300,
      		color:"#F7464A",
      		highlight: "#FF5A5E",
      		label: "Red"
      	},
      	{
      		value: 50,
      		color: "#46BFBD",
      		highlight: "#5AD3D1",
      		label: "Green"
      	},
      	{
      		value: 100,
      		color: "#FDB45C",
      		highlight: "#FFC870",
      		label: "Yellow"
      	}
      ]
      
      var ctxl = $("#lineChartDemo").get(0).getContext("2d");
      var lineChart = new Chart(ctxl).Line(data);
      
      var ctxb = $("#barChartDemo").get(0).getContext("2d");
      var barChart = new Chart(ctxb).Bar(data);
      
      var ctxr = $("#radarChartDemo").get(0).getContext("2d");
      var radarChart = new Chart(ctxr).Radar(data);
      
      var ctxpo = $("#polarChartDemo").get(0).getContext("2d");
      var polarChart = new Chart(ctxpo).PolarArea(pdata);
      
      var ctxp = $("#pieChartDemo").get(0).getContext("2d");
      var pieChart = new Chart(ctxp).Pie(pdata);
      
      var ctxd = $("#doughnutChartDemo").get(0).getContext("2d");
      var doughnutChart = new Chart(ctxd).Doughnut(pdata);
    </script>
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
</body>
</html>