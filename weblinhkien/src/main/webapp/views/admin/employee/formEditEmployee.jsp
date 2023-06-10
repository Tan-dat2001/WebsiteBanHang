<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf-8"%>
<%@include file = "/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> <dec:title default="NHAN VIEN" /></title>
</head>
<body class="app sidebar-mini">
	<main class="app-content">
		<div class="app-title">
			<div>
				<h1><i class="fa fa-edit"></i>SỬA NHÂN VIÊN</h1>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<div class="title">
					<div class="row">
						<div class="col-lg-13"></div>
						<div class="col-lg-6">
							<form>
								<div>
									<input type="hidden" name="id" value="1">
								</div>
								<div class="form-group">
									<label for="exampleInputName">Tên  Nhân Viên</label> <input
										name="tenNhanVien" class="form-control" id="exampleInputName"
										type="text" placeholder="">
								</div>
								<div class="form-group">
									<label for="exampleInputPass">Mật Khẩu</label> <input
										name="tenNhanVien" class="form-control" id="exampleInputPass"
										type="text" placeholder="">
								</div>
								<div class="form-group">
									<label for="exampleSelect1">Chức Vụ</label> <select
										name="chucVu" class="form-control" id="exampleSelect1">
										<option>1</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
									</select>
								</div>
								<div class="form-group">
									<label for="exampleInputAdd">Địa Chỉ</label> <input
										name="tenNhanVien" class="form-control" id="exampleInputAdd"
										type="text" placeholder="">
								</div>
								<div class="form-group">
									<label for="exampleInputPhone">Số Điện Thoại</label> <input
										name="sdt" class="form-control" id="exampleInputPhone"
										type="text" placeholder="">
								</div>
								<div class="form-group">
									<label for="exampleInputDOB">Ngày Sinh</label> <input
										name="DOB" class="form-control" id="exampleInputDOB" type="date" min="1930-01-01" placeholder="">
								</div>
								<div class="col-lg-12 text-center">
									<button class="btn btn-primary" type="submit">Sửa Nhân Viên</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>

</body>
</html>