
<%@page import="models.Product"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><dec:title default="LINH KIEN" /></title>
</head>
<body class="app sidebar-mini">
	<main class="app-content">
		<div class="app-title">
			<div>
				<h1>
					<i class="fa fa-th-list"></i> LINH KIỆN
				</h1>
			</div>
			<ul class="app-breadcrumb breadcrumb">
				<li class="breadcrumb-item"><i
					class="fa fa-plus-square-o fa-lg"></i></li>
				<li class="breadcrumb-item active"><a
					href="admin-add-product">Thêm Linh Kiện</a></li>
			</ul>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="tile">
					<div class="tile-body">
						<div class="table-responsive">
							<table class="table table-hover table-bordered" id="sampleTable">
								<thead>
									<tr>
										<th>STT</th>
										<th>ID</th>
										<th>Tên Linh Kiện</th>
										<th>Tên Hãng Sản Xuất</th>
										<th>Số Lượng</th>
										<th>Mô Tả</th>
										<th>Loại Linh Kiện</th>
										<th>Giá tiền</th>
										<th>Tác Vụ</th>
									</tr>
								</thead>
								<tbody>
								<% int i = 1; %>
									<c:forEach items="${listProduct}"  var="product">
									<tr>
											<td><%=i++%></td>
											<td>${product.productID}</td>
											<td>${product.productName}</td>
											<td>${product.manufact}</td>
											<td>${product.amount}</td>
											<td>${product.describe}</td>
											<td>${product.categoryID}</td>
											<td>${product.productPrice}</td>
											<td><a href="#" onclick="showMessDeleteProduct(${product.productID})">XÓA</a>||<a href="admin-edit-product?idproduct=${product.productID}">SỬA</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				<div class="tile">
					<div class="heading"
						style="display: flex; width: 70%; font-size: 20px; font-weight: 600; margin-bottom: 4px;">Hãng
						sản xuất</div>
					<div class="tile-body">
						<div class="table-responsive">
							<table class="table table-hover table-bordered" id="sampleTable">
								<thead>
									<tr>
										<th>STT</th>
										<th>ID</th>
										<th>Hãng Sản Xuất</th>
										<th>Tác Vụ</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listManufac}" var="manufac">
										<tr>
											<td>1</td>
											<td>${manufac.manufacProductID}</td>
											<td>${manufac.manufacName}</td>
											<td><a href="#">XÓA</a></td>
										</tr>
									</c:forEach>


								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="tile">
					<div class="heading"
						style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Danh
						mục</div>
					<div class="tile-body">
						<div class="table-responsive">
							<table class="table table-hover table-bordered" id="sampleTable">
								<thead>
									<tr>
										<th>STT</th>
										<th>ID</th>
										<th>Danh mục sản phẩm</th>
										<th>Tác Vụ</th>

									</tr>
								</thead>
								<tbody>
								<%int k = 1; %>
									<c:forEach items="${listCategory}" var="category">
										<tr>
											<td><%=k++%></td>
											<td>${category.categoryProductID}</td>
											<td>${category.categoryName}</td>
											<td><a href="#" onclick="showMessDeleteCategory(${category.categoryProductID})">XÓA</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				<div class="tile">
					<div class="row">
						<div class="heading"
							style="display: flex; width: 70%; font-size: 20px; font-weight: 600; margin-bottom: 4px; padding-left: 14px;">Thêm
							hãng sản xuất</div>
					</div>
					<div class="tile-body">
						<form action="" class="add-brand-list">
							<input type="hidden" name="" value=""> <input type="text"
								name="" value=""> <input type="submit" name=""
								value="Thêm">
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="tile">
					<div class="heading"
						style="font-size: 20px; font-weight: 600; margin-bottom: 4px;">Thêm
						danh mục</div>
					<div class="tile-body">
						<form action="admin-add-category" class="add-brand-list">
							<input type="hidden" name=""> <input type="text"
								name="addcategory" value=""> <input type="submit" name=""
								value="Thêm">
						</form>
					</div>
				</div>
			</div>
		</div>

	</main>
</body>
</html>