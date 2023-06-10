<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Sidebar menu-->
<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
<aside class="app-sidebar">
	<div class="app-sidebar__user">
		<img class="app-sidebar__user-avatar"
			src="<c:url value='/template/admin/images/avatarJG3.png'/>" alt="User Image">
		<div>
			<p class="app-sidebar__user-name">JG3.Electronic</p>
		</div>
	</div>
	<ul class="app-menu">
<!-- 		<li><a class="app-menu__item active"
			href="../../pages/AdminView/index.html"><i
				class="app-menu__icon fa fa-dashboard"></i><span
				class="app-menu__label">Dashboard</span></a></li> -->
		<li><a class="app-menu__item"
			href="admin-product"><i
				class="app-menu__icon fa fa-laptop"></i><span
				class="app-menu__label">Quản Lí Linh Kiện</span></a>
		<li><a class="app-menu__item"
			href="admin-user"><i
				class="app-menu__icon fa fa-pie-chart"></i><span
				class="app-menu__label">Quản Lí Khách Hàng</span></a></li>
		 <li><a class="app-menu__item"
			href="admin-order"><i
				class="app-menu__icon fa fa-pie-chart"></i><span
				class="app-menu__label">Quản Lí Đơn Hàng </span></a></li>
	</ul>
</aside>