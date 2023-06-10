<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang Chủ"/></title>
</head>
<body>
 <div id="content">
            <section class="h-100" style="background-color: #eee;">
                <div class="container h-100 py-5">
                  <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-10">
                      <div class=" heading-content" style="font-size: 24px ; font-weight: 600; margin-top: 16px; text-transform: uppercase;"  >Đơn hàng</div>
                      <div class="d-flex justify-content-between align-items-center mb-4">
                        <!-- <h3 class="fw-normal mb-0 text-black">Shopping Cart</h3> -->
                      </div>
              
                      <div class="card rounded-3 mb-4">
                        <div class="card-body p-4">
                          <div class="row d-flex justify-content-between align-items-center">
                            <div class="col-md-2 col-lg-2 col-xl-2">
                              <img
                                src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-shopping-carts/img1.webp"
                                class="img-fluid rounded-3" alt="Cotton T-shirt">
                            </div>
                            <div class="col-md-3 col-lg-3 col-xl-3">
                              <p class="lead fw-normal mb-2">Basic T-shirt</p>
                            <!--   <p><span class="text-muted">Size: </span>M <span class="text-muted">Color: </span>Grey</p> -->
                            </div>
                            <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                              
              
                              <input id="form1" min="0" name="quantity" value="2" type="text" readonly
                                class="form-control form-control-sm" style="text-align: center; width: 60px;"/>
              

                            </div>
                            <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                              <h5 class="mb-0">$499.00</h5>
                            </div>
                            
                          </div>
                        </div>
                      </div>
              
                    

              
                      <div class="card " style="margin-bottom: 20px ; flex-direction: row;     justify-content: center;
                      align-items: center; ">
                        <div class="card-body" style="display: flex; width: 30%; text-transform: uppercase ; font-weight: 700; font-size: 24px;">
                          Tổng tiền: 
                        </div>
                        <div class="total-money" style="display: flex; text-align: center; justify-content: center; width: 70%; font-size: 20px; ">2.000.000 đ</div>
                      </div>
              
                    </div>
                  </div>
                </div>
              </section>
            
        </div>
</body>
</html>