<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Đăng Nhập"/></title>
   
</head>
<body>
	<div class="row">
            <div class="col-md-12">
                <h1>
                    <center>Admin</center>
                </h1>
                <div class="card-body">
                   <form action="quan-tri" method="post">
                   		 <div class="row">
                        <div class="col-sm-12 form-group">
                            <label>Tên Tài khoản</label>
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input type="text" name="tenDangNhap" placeholder="Tên Đăng Nhập" class="form-control">
                            </div>
                        </div>
                        <div class="col-sm-12 form-group">
                            <label>Mật khẩu</label>
                            <div class="input-group" style="margin-bottom:8px;">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input type="password" name="matKhau" placeholder="Mật Khẩu" class="form-control">
                            </div>
                            <a href="web-home" >Quay lại trang chủ</a>
                        </div>
                        <h4 class="loginfail__admin">${adminlogin}</h4>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 text-center">
                                <button type="submit" class="btn btn-block btn-info">Đăng nhập</button>
                        </div>
                    </div>
                   </form>
                    <!-- <div class="or-text">
                        <div class="or-text-row">
                            <div class="or-text-line">
                                <i class="btn btn-default btn-circle" ; disabled="disabled">Hoặc</i>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="btn-group">
                                <form action="...">
                                    <button type="submit" class="btn btn-primary"><span class="fa fa-facebook-square"
                                            style="font-size: 1.5em"></span>Facebook
                                    </button>
                                </form>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="btn-group">
                                <form action="...">
                                    <button type="submit" class="btn btn-danger"><span class="fa fa-google-plus-circle "
                                            style="font-size: 1.5em"></span>Google+
                                    </button>
                                </form>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="btn-group">
                                <form action="...">
                                    <button type="submit" class="btn btn-info"><span class="fa fa-linkedin-square  "
                                            style="font-size: 1.5em"></span>Linkedin
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div><br><br> -->
                </div>
            </div>
        </div>
</body>
</html>