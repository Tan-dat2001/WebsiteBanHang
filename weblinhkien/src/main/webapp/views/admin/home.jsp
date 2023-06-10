<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Dashboard - Home" /></title>
</head>
<body class="app sidebar-mini">
	<main class="app-content">
		<div class="app-title">
		  <div>
			<h1><i class="fa fa-pie-chart"></i> Charts</h1>
			<p>Various type of charts for your project</p>
		  </div>
		  <ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">charts</a></li>
		  </ul>
		</div>
		<div class="row">
		  <div class="col-md-6">
			<div class="tile">
			  <h3 class="tile-title">Line Chart</h3>
			  <div class="embed-responsive embed-responsive-16by9">
				<canvas class="embed-responsive-item" id="lineChartDemo"></canvas>
			  </div>
			</div>
		  </div>
		  <div class="col-md-6">
			<div class="tile">
			  <h3 class="tile-title">Bar Chart</h3>
			  <div class="embed-responsive embed-responsive-16by9">
				<canvas class="embed-responsive-item" id="barChartDemo"></canvas>
			  </div>
			</div>
		  </div>
		  <div class="col-md-6">
			<div class="tile">
			  <h3 class="tile-title">Radar Chart</h3>
			  <div class="embed-responsive embed-responsive-16by9">
				<canvas class="embed-responsive-item" id="radarChartDemo"></canvas>
			  </div>
			</div>
		  </div>
		  <div class="col-md-6">
			<div class="tile">
			  <h3 class="tile-title">Polar Chart</h3>
			  <div class="embed-responsive embed-responsive-16by9">
				<canvas class="embed-responsive-item" id="polarChartDemo"></canvas>
			  </div>
			</div>
		  </div>
		</div>
	  </main>
</body>
</html>