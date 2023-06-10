<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="header">
	<div class="container">
		<!-- LOGO -->
		<a href="web-home" class="container__logo">
			<p class="container__logo-text">
				<span>JG3.Electronic</span>
			</p>
			<p class="container__logo-text">
				<span>JG3.Electronic</span>
			</p>
		</a>
		<!-- FORM SEARCH -->
		<div class="container__search">
			<form action="Search" class="search" method="post">
				<input class="search__input" type="text" name="search"
					placeholder="Nhập tên, mã sản phẩm"> <input
					name="post_type" type="hidden" value="product">
				<button class="search__icon" type="submit">
					<i class="fa-solid fa-magnifying-glass"></i>
				</button>
			</form>
		</div>
		<!-- ACTION -->
		<div class="container__action">
			<a href="dang-nhap" class="login_item"> <span
				class="login_item__icon"> <i class="fa-solid fa-user"></i>
			</span> <span class="login_item__text"> <%
					 HttpSession ss = request.getSession();
					 String name = ((String) ss.getAttribute("userloginsuccess"));
					 String key = name == null ? "Đăng nhập" : name;
					 %> <%=key%>	
			</span>
			</a>
			<c:if test= "${userloginsuccess != null}">
                	<a href="#" onclick="showMessLogOut()"class="login_item">
                    <span class="login_item__icon">
                        <i class="fa-solid fa-right-from-bracket"></i>
                    </span>
                    <span class="login_item__text">
                    	Đăng xuất
                    </span>
               		 </a>
                </c:if>
			 <a href="showCart" class="cart_item"> <span
				class="cart_item__icon"><i class="fa-solid fa-cart-shopping"></i></span>
				<span class="cart_item__text">Giỏ hàng</span> <span
				class="cart_item__count">${requestScope.size}</span>
			</a>
		</div>
	</div>
</div>