<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang Chủ" /></title>
</head>
<body>
	<div id="content">

		<section class="h-100" style="background-color: #eee;">
			<div class="container h-100 py-5">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div
						style="font-size: 20px; margin-top: 20px; margin-left: 5px; text-transform: uppercase; font-weight: 700;">Giỏ
						hàng của bạn</div>
					<div class="col-10">
						<c:set var="o" value="${requestScope.cart}" />
						<c:forEach items="${o.items}" var="i">
							<div class="card rounded-3 mb-4">
								<div class="card-body p-4">
									<div
										class="row d-flex justify-content-between align-items-center">
										<div class="col-md-2 col-lg-2 col-xl-2">
											<img
												src="${i.product.image}"
												class="img-fluid rounded-3" alt="Cotton T-shirt">
										</div>
										<div class="col-md-3 col-lg-3 col-xl-3">
											<p class="lead fw-normal mb-2">${i.product.productName}</p>
											<p>
												<span class="text-muted">Giá </span>${i.price}
											</p>
										</div>
										<div class="col-md-3 col-lg-3 col-xl-2 d-flex">
											<button class="btn btn-link px-2"
												onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
												<a href="process?num=-1&id=${i.product.productID}"> <i
													class="fas fa-minus"></i></a>

											</button>

											<input id="form1" min="0" name="quantity"
												value="${i.quantity}" type="number"
												class="form-control form-control-sm" />

											<button class="btn btn-link px-2"
												onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
												<a href="process?num=1&id=${i.product.productID}"><i
													class="fas fa-plus"></i></a>
											</button>
										</div>
										<div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
											<h5 class="mb-0">Tổng Tiền: ${i.quantity*i.price}</h5>
										</div>
										<div>
											<form action="process" method="post">
												<input type="hidden" name="ID"
													value="${i.product.productID }" />
												<button class="col-md-1 col-lg-1 col-xl-1 text-end btn-del">
													<i class="fas fa-trash fa-lg"></i>
												</button>
											</form>
										</div>
									</div>
								</div>
							</div>
                
						</c:forEach>

                              <span>Tổng thành tiền:</span> <strong>${o.totalMoney }</strong>


						<form action="checkout" method="post">

							<div class="card " style="margin-bottom: 20px;">
								<div class="card-body">
									<button class="btn btn-warning btn-block btn-lg">Mua
										hàng</button>
								</div>
							</div>
						</form>

					</div>
				</div>
			</div>
		</section>

	</div>
	<!-- End Content -->


</body>
</html>