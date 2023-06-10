<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><dec:title default="NHAN VIEN" /></title>
</head>
<body class="app sidebar-mini">
	<main class="app-content">
		<div class="app-title">
			<div>
				<h1>
					<i class="fa fa-th-list"></i> NHÂN VIÊN
				</h1>
			</div>
			<ul class="app-breadcrumb breadcrumb">
				<li class="breadcrumb-item"><i
					class="fa fa-plus-square-o fa-lg"></i></li>
				<li class="breadcrumb-item active"><a
					href="formThemNhanVien.html">Thêm Nhân Viên</a></li>
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
										<th>Tên Nhân Viên</th>
										<th>Mật Khẩu</th>
										<th>Chức Vụ</th>
										<th>Số Điện Thoại</th>
										<th>Địa Chỉ</th>
										<th>Ngày Sinh</th>
										<th>Tác Vụ</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>1</td>
										<td>Linh</td>
										<td>11111111</td>
										<td>giám đốc</td>
										<td>0704816311</td>
										<td>Điện An, Điện Bàn, Quảng Nam</td>
										<td>Nữ</td>
										<td><a href="#">XÓA</a>||<a href="formSuaNhanVien.html">SỬA</a></td>
									</tr>
									<tr>
										<td>2</td>
										<td>2</td>
										<td>LinhTK</td>
										<td>1111</td>
										<td>admin</td>
										<td>0704816311</td>
										<td>Điện An, Điện Bàn, Quảng Nam</td>
										<td>Nữ</td>
										<td><a href="#">XÓA</a>||<a href="#">SỬA</a></td>

									</tr>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>