<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Đăng Ký"/></title>
</head>
<body>
	<div class="col-lg-12 well">
            <h1 style="font-family: Arial ; color: blue; text-align: center;">Đăng ký</h1>
            <form action="create-user" method="post" id="form_1">
            	<div class="row">
                <div class="col-sm-6 form-group error_form">
                    <label>Nhập Tên Người Dùng</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input id ="username" type="text" name="tenNguoiDung" class="form-control">
                    </div>
                    <span class="form-message"></span>
                </div>
                
                <div class="col-sm-6 form-group error_form">
                    <label>Ngày Sinh</label>
                    <div class="input-group">
                        <input id ="birthday" style="border-radius: 5px;" name="ngaySinh" type="date" class="form-control">
                    </div>
                    <span class="form-message"></span>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Tên Tài Khoản </label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input id ="account" type="text" name="account" class="form-control">
                    </div>
                        <span class="form-message"></span>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Tạo Mật khẩu </label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input id ="password" type="password" name="matKhau" class="form-control">
                    </div>
                        <span class="form-message"></span>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Xác Nhận Mật Khẩu</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input id ="repassword" type="password" name="xacNhanMatKhau" class="form-control">
                    </div>
                        <span class="form-message"></span>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Số Điện Thoại</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                        <input id ="phone" type="text" name="sdt" class="form-control">
                    </div>
                        <span class="form-message"></span>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Địa Chỉ</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
                        <input id ="address" type="text" name="diaChi" class="form-control">
                    </div>
                        <span class="form-message"></span>
                </div>	
               <!--  <div class="col-sm-12 form-group error_form"><label>Giới Tính</label>
                    <div class="col-sm-12 form-group  ">
                        <div class="form-check-inline">
                            <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="gioiTinh" value="nam"> NAM
                            </label>
                        </div>
                        <div class="form-check-inline">
                            <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="gioiTinh" value="nu"> NỮ
                            </label>
                        </div>
                    </div>
                </div>     -->
                	<c:if test="${showMess != null}">
      					<%
      					HttpSession ss = request.getSession();
      					String key = ((String)ss.getAttribute("showMess"));
      					String mau = key.contains("!") ? "#f33a58" : "#2df02d"; %>
                		<div style="width: 100%; text-align: center; margin-bottom: 10px">
                			<span style="color:<%=mau%>">${showMess}</span>
                		</div>
                	</c:if>
                	<span><a href="web-home" style="margin-left: 19px;">Quay về trang chủ</a></span>
                <div class="col-sm-12">
                    <div class="col-sm-3"></div>
                    <div class="col-sm-6 text-center ">
                            <button type="submit" class="btn btn-block btn-warning">Đăng Kí</button>
                    </div>
                    <div class="col-sm-3"></div>
                </div>
            </div>
            </form>
        </div>
</body>
</html>