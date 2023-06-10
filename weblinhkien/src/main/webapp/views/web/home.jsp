<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang Chủ" /></title>
</head>
<body>
	<div class="wrapper">
		<section class="top-content">
			<div class="menu">
				<div class="menu-header">
					<div class="menu-header-btn">
						<i class="menu-header-icon fa-solid fa-bars"></i> <span
							class="menu-header-text">Danh mục sản phẩm</span>
					</div>
				</div>
				<ul class="menu-sidebar">
					<c:forEach items="${listCategory}" var="category">
						<li<%--  class="${active == category.categoryProductID ? "active":"" }" --%>><a
							href="web-category?categoryProductID=${category.categoryProductID}">${category.categoryName}</a></li>
					</c:forEach>


				</ul>
			</div>

			<div class="slideshow">
				<div class="slideshow-container">
					<div class="mySlides fade">
						<img
							src="<c:url value='/template/web/assets/image/slideshow1.png'/>">
					</div>
					<div class="mySlides fade">
						<img
							src="<c:url value='/template/web/assets/image/slideshow2.jpg'/>">
					</div>
					<div class="mySlides fade">
						<img
							src="<c:url value='/template/web/assets/image/slideshow3.jpg'/>">
					</div>
					<div class="mySlides fade">
						<img
							src="<c:url value='/template/web/assets/image/slideshow4.jpg'/>">
					</div>
					<div class="mySlides fade">
						<img
							src="<c:url value='/template/web/assets/image/slideshow5.jpg'/>">
					</div>
				</div>

				<div class="dot-slide">
					<span class="dot"></span> <span class="dot"></span> <span
						class="dot"></span> <span class="dot"></span> <span class="dot"></span>
				</div>
			</div>
		</section>

		<!-- Start product-all -->

		<div class="product">
			<div class="product-title">Tất cả sản phẩm</div>
			<div class="container d-flex justify-content-center mt-20 mb-20">
			<form name="f" action="" method="post">
			 <input type="hidden"  name="num" value="1"> 			
				<div class="row ">
					<c:forEach items="${requestScope.listProduct}" var="p">
						<div class="col-md-3 mt-2 mb-2">
							<div class="card" >
								<div class="card-body">
									<div class="card-img-actions">
										<img
											src="${p.image}"
											class="card-img img-fluid"  width="96" height="350" alt="">
									</div>
								</div>
								<div class="card-body bg-light text-center">
									<div class="mb-2">
										<h6 class="font-weight-semibold mb-2">
											<a href="detailProduct?productID=${p.productID}"
												class="text-default mb-2" data-abc="true">${p.productName }</a>
										</h6>
										
									</div>
									<h3 class="mb-0 font-weight-semibold">${p.productPrice}</h3>
									<div>
										<i class="fa fa-star star"></i> <i class="fa fa-star star"></i>
										<i class="fa fa-star star"></i> <i class="fa fa-star star"></i>
									</div>
								           
									<div class="text-muted mb-3">${p.manufact}</div>
									<%-- <button style="background-color: orange; margin-bottom: 20px"
										type="button" class="btn bg-cart">
									<a href="addCart/productID=${product.productID }"></a>
										<i class="fa fa-cart-plus mr-2"></i> Add to cart
									</button> --%>
									
										<button style="background-color: orange; margin-bottom: 20px"
											 onclick="addCart('${p.productID}')" class="btn bg-cart" name = "">
											<i class="fa fa-cart-plus mr-2"></i> Add to cart
										</button> 
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				</form>
			</div>
		</div>
		<!-- <div class="pagination">
			<nav aria-label="Page navigation example">
				<ul class="pagination justify-content-center">
					<li class="page-item disabled"><a class="page-link" href="#"
						tabindex="-1">Previous</a></li>
					<li class="page-item"><a class="page-link" href="#">1</a></li>
					<li class="page-item"><a class="page-link" href="#">2</a></li>
					<li class="page-item"><a class="page-link" href="#">3</a></li>
					<li class="page-item"><a class="page-link" href="#">Next</a></li>
				</ul>
			</nav>
		</div> -->
	</div>
</body>
</html>

	