<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Đăng Ký"/></title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
   <style>
        body {
            padding-top: 20px;
            padding-bottom: 20px;
            background: #B0C4DE	;
        }

        .col-lg-12 {
            background-color: #FFF;
            box-sizing: border-box;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        }

        input[type="radio"] {
            margin-left: 60px;

        }

        @media (min-width: 200px) {
            .container {
                max-width: 500px;
            }
        }
        .container{
            margin-top: 32px;
        }
        .form-group.invalid .form-control{
        	border-color: #f33a58;
        }
        
        .form-group.invalid .form-message{
        	color: #f33a58;
        }
        
        .form-group.invalid .error_box{
        	border-color: #f33a58;
        	color:  #f33a58;
        }
        
        .error_form{
        	display: flex;
        	flex-direction: column;
        }
        
        .form-message{
        	    text-align: center;
			    font-size: 1.6rem;
			    line-height: 1.8rem;
			    padding: 4px 0 0;
        }
    </style>
</head>
<body>
	<div class="container">
		<dec:body/>
	</div>
	<script src="<c:url value='/template/validator.js'/>" type="text/javascript"></script>
	<script>
		Validator({
			form: '#form_1',
			errorSelector:'.form-message',
			rules:[
				Validator.isUsername('#username', 'Vui lòng nhập tên'),
				Validator.isBirthday('#birthday', 'Vui lòng chọn ngày sinh'),
				Validator.isAccount('#account', 'Vui lòng nhập tên tài khoản'),
				Validator.isPassword('#password', 'Mật khẩu phải dài hơn 6 ký tự'),
				Validator.isRepassword('#repassword', function(){
					return document.querySelector('#form_1 #password').value;
				}, 'Mật khẩu nhập lại không chính xác'),
				Validator.isPhone('#phone', 'Số điện thoại không hợp lệ !'),
				Validator.isAdress('#address', 'Vui lòng điền địa chỉ !')
			]
		});
	</script>
</body>
</html>