<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${jakarta.servlet.jsp.PageContext}/template/web/assets/js/ajax.js"></script>
</head>

<body>

<div class="detail-product">
                    <div class="intro-detail">
                        <!-- LEFT DETAIL -->
                        <div class="left-intro-detail">
                            <img src="${detail.image}" alt="">
                        </div>
                        <!--MIDDLE DETAIL  -->
                        <div class="mid-intro-detail">
                            <h1 class="title">${listProduct.productName}</h1>
                            <div class="des-price">
                                <div class="price-item">
                                    <span class="label">Giá thị trường:</span>
                                    <span class="price" style="text-decoration: none;font-size: 36px;color: black;">${detail.productPrice}VNĐ</span>
                                </div>
                                <div class="price-item">
                                    <span class="label">Tên sản phẩm:</span>
                                    <span class="price highlight-price">${detail.productName}</span>
                                </div>
                            </div>
                            <form action="" class="cart" method="get">

                                <!-- <input type="hidden" name="custom_price" value=""> -->
                                <div class="quantity">
                                    <input type='button' value="-" onclick="button2()" />
                                    <span id="output-area"></span>
                                    <input type='button' value="+" onclick="button1()" />
                                </div>

                                <button class="btn-buy" type="submit" name="buy" value="amount">Mua ngay</button>
                                <button class="btn-add" type="submit" name="add_to_cart" value="amount"> Thêm vào giỏ hàng</button>
                            </form>
                        </div>
                        <!-- RIGHT DETAIL -->
                        <div class="right-intro-detail">
                            <div class="desc-right-intro-detail">
                                <div class="title">Chính sách bán hàng</div>
                                <ul class="list-content">
                                    <li>Nhà Bán lẻ Uy tín tại Việt Nam</li>
                                    <li>Sản phẩm Chính hãng 100%</li>
                                    <li>Bảo hành theo Tiêu chuẩn NSX</li>
                                    <li>Chính sách Đặc biệt cho Khối DN</li>
                                    <li>Chính sách Đặc biệt cho Game-Net</li>
                                    <li>Tư vấn miễn phí các giải pháp CNTT</li>
                                </ul>
                            </div>
                            <div class="desc-right-intro-detail">
                                <div class="title">Giao nhận - thanh toán</div>
                                <ul class="list-content">
                                    <li>Giao hàng toàn quốc</li>
                                    <li>Miễn phí bán kính 20km</li>
                                    <li>Thanh toán linh động</li>
                                    <li>Trả Góp lãi suất thấp</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="desc-detail">
                        <div class="intro-product">
                            Giới thiệu sản phẩm
                        </div>
                        <div class="product-description">
                        	<h1>${detail.describe}</h1>
                             <h2 class="title-description">
                                (TITLE) Đánh giá Card màn hình MSI RTX 2060 VENTUS XS OCV1 , giá tốt, chất lượng
                            </h2>
                            <p>
                                <strong>
                                    Giới thiệu card màn hình MSI GeForce RTX 2060 6GB GDDR6 VENTUS XS OCV1 (6GB GDDR6, 192-bit, DVI+HDMI+DP, 1×8-pin)
                                </strong>
                            </p>
                            <p>
                                MSI GeForce RTX 2060 6GB GDDR6 VENTUS XS OCV1 là mẫu card đồ họa tầm trung mới mất của MSI, sử dụng bộ xử lý đồ họa RTX 2060 với khả năng xử lý tương đương với GTX 1070Ti và hỗ trợ tính năng RTX, DLSS mới nhất giúp đem lại trải nghiệm chơi game tốt nhất, kèm theo thiết kế tản nhiệt độc quyền tới từ MSI, đem lại sự hoạt động ổn định và êm ái.
                                <br>
                                Lưu ý: phiên bản RTX 2060 này đã được ép xung sẵn để có được hiệu năng chơi game tốt hơn.
                            </p>

                                <h3>Thiết kế (TITLE) </h3>
                                <p>MSI GeForce RTX 2060 6GB GDDR6 VENTUS XS OCV1 đem lại thiết kế hoàn toàn mới với tông màu đen và trắng rất dễ phối màu với nhiều cách kết hợp khác nhau.
                                Kèm theo là tấm “back plate” kim loại lớn vừa tăng tính thẩm mĩ vừa hạn chế việc cong bo mạch khi mà khối lượng tản nhiệt ngày càng lớn.
                            
                                </p>
                                <h3>Tản nhiệt (TITLE)
                                </h3>
                                <p>
                                Sử dụng thiết kế quạt TORX FAN 2.0 độc quyền của MSI với trục bi kép cộng thêm phần cánh quạt được chia làm 2 loại, 1 loại được thiết kế để giúp tăng tốc không khí đi qua quạt, 1 loại được thiết kế để ép không khí xuống lớp tản nhiệt phía dưới, đem lại cho MSI GeForce RTX 2060 6GB GDDR6 VENTUS XS OCV1 hiệu năng làm mát và độ ồn tối ưu nhất.
                                </p>

                        </div>
                    </div>
</div>
</body>
</html>