<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><dec:title default="NGUOI DUNG" /></title>
</head>
<body class="app sidebar-mini">
	<main class="app-content">
		<div class="app-title">
			<div>
				<h1>
					<i class="fa fa-th-list"></i> KHÁCH HÀNG
				</h1>
			</div>

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
										<th>Tên Người Dùng</th>
										<th>Mật Khẩu</th>
										<th>Số Điện Thoại</th>
										<th>Địa Chỉ</th>
										<th>Ngày Sinh</th>
										<th>Tác Vụ</th>
									</tr>
								</thead>
								<tbody><%int i = 1; %>
									<c:forEach items="${listUser}" var="user">
										<tr>
											<td><%=i++%></td>
											<td>${user.userID }</td>
											<td>${user.userName }</td>
											<td>${user.password }</td>
											<td>${user.phone }</td>
											<td>${user.adress }</td>
											<td>${user.dateOfBirth }</td>
											<td><a href="#"  onclick="showMess(${user.userID})">XÓA</a>||<a href="update-user?idupdate=${user.userID}">SỬA</a></td>	</tr>
									</c:forEach>
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