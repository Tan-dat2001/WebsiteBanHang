<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Đăng Nhập"/></title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value='/template/login/css/loginfail.css'/>" type="text/css"/>
    <style>
    	body {
            padding-top: 20px;
            padding-bottom: 20px;
            background: #B0C4DE;
        }

        @media (min-width: 768px) {
            .container {
                max-width: 500px;
            }
        }

        @-ms-viewport {
            width: device-width;
        }
        .container{
            margin-top: 32px;
        }

        .or-text-row {
            display: table-row;
        }

        .or-text {
            display: table;
            width: 100%;
            position: relative;
            margin: 20px 0;
        }

        .or-text-step button[disabled] {
            opacity: 1 !important;
            filter: alpha(opacity=100) !important;
        }

        .or-text-row:before {
            top: 14px;
            bottom: 0;
            position: absolute;
            content: "";
            width: 100%;
            height: 1px;
            background-color: #e8e8e8;
            z-order: 0;
        }

        .or-text-line {
            display: table-cell;
            text-align: center;
            position: relative;
            width: 100%;
        }

        .or-text-line p {
            margin-top: 10px;
        }

        .btn-circle {
            width: 54px;
            height: 30px;
            text-align: center;
            padding: 2px 0;
            font-size: 17px;
            line-height: 1.428571429;
            border-radius: 35px;
        }

        .fa {
            padding-right: 10px;
        }

        .col-md-12 {
            background-color: #FFF;
            border-radius: 5px;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            padding: 20px;

        }
    </style>
</head>
<body>
	<div class="container">
		<dec:body/>
	</div>
</body>
</html>