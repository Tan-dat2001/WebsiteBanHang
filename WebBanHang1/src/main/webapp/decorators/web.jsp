<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="JG3 - Trang Chủ" /></title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='/template/web/assets/fonts/fontawesome-free-6.1.1-web/fontawesome-free-6.1.1-web/css/all.min.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='/template/web/assets/css/style.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='/template/web/assets/css/checkout.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">



</head>
<body>

	<div id="main">
		<%@include file="/common/web/header.jsp"%>
		<div id="content">
			<dec:body />
		</div>
		<%@include file="/common/web/footer.jsp"%>
	</div>


	<script type="text/javascript"
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="<c:url value='/template/web/assets/js/slideShow.js'/>"></script>
	<script type="text/javascript">
	function addCart(productID){
		
		document.f.action="addCart?productID="+productID;
		document.f.submit();
	}
	function showMessLogOut(){
  		var option = confirm("Bạn có chắc muốn đăng xuất ?");
  		if (option === true){
  			window.location.href = 'log-out';
  		}
  	}
	</script>

</body>
</html>
