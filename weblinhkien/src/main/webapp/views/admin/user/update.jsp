<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<div class="col-lg-12 well">
            <h1 style="font-family: Arial ; color: blue; text-align: center;">Sửa Thông Tin</h1>
            <form method="post" id="form_1">
            	<div class="row">
                <div class="col-sm-6 form-group error_form">
                    <label>Tên Người Dùng</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input id ="username" type="text" name="tenNguoiDungcapnhat" class="form-control" value="${user.userName}">
                    </div>
                </div>
                
                <div class="col-sm-6 form-group error_form">
                    <label>Ngày Sinh</label>
                    <div class="input-group">
                        <input id ="birthday" style="border-radius: 5px;" name="ngaySinhcapnhat" type="date" class="form-control" value="${user.dateOfBirth}">
                    </div>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Số Điện Thoại</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                        <input id ="phone" type="text" name="sdtcapnhat" class="form-control" value="${user.phone}">
                    </div>
                </div>
                <div class="col-sm-12 form-group error_form">
                    <label>Địa Chỉ</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
                        <input id ="address" type="text" name="diaChicapnhat" class="form-control" value="${user.adress}">
                    </div>
                </div>	
                	<span><a href="admin-home" style="margin-left: 19px;">Quay về trang chủ</a></span>
                <div class="col-sm-12">
                    <div class="col-sm-3"></div>
                    <div class="col-sm-6 text-center ">
                            <button id="active_submit" onclick="showUpdateMess(${user.userID})" class="btn btn-block btn-warning">Cập Nhật</button>
                    </div>
                    <div class="col-sm-3"></div>
                </div>
            </div>
            </form>
        </div>
</body>
</html>