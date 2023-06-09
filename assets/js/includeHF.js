
class inHeader extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
            <div id="header">
                <div class="container">
                 <!-- LOGO --> 
                    <a href="../../index.html" class="container__logo">
                        <p class="container__logo-text"><span>JG3.Electronic</span></p>
                        <p class="container__logo-text"><span>JG3.Electronic</span></p>

                    </a>
                 <!-- FORM SEARCH --> 
                    <div class="container__search">
                        <form action="#" class="search" method="get">
                            <input class="search__input" type="text"  placeholder="Nhập tên, mã sản phẩm">
                            <input name="post_type"  type="hidden" value="product">
                            <button class="search__icon">
                                <i class="fa-solid fa-magnifying-glass"></i>
                            </button>
                        </form>
                    </div>
                <!-- ACTION --> 
                    <div class="container__action">
                        <a href="/pages/userUI/login.html" class="login_item">
                            <span class="login_item__icon">
                                <i class="fa-solid fa-user"></i>
                            </span>
                            <span class="login_item__text">
                                Đăng nhập 
                                </span>                         
                        </a>

                        <a href="/pages/userUI/shoppingCart.html" class="cart_item">
                            <span class="cart_item__icon"><i class="fa-solid fa-cart-shopping"></i></span>
                            <span class="cart_item__text">Giỏ hàng</span>
                            <span class="cart_item__count">0</span>

                        </a>
                    </div>
                </div>
            </div>
        `
    }
}

// define inHeader (include-Header)
customElements.define('include-header', inHeader)

class inFooter extends HTMLElement{
    connectedCallback(){
        this.innerHTML = `
            <div id="footer">
            <div class="top-footer">
                <div class="service-footer">
                    <div class="row service-padd">
                        <div class=" col-lg-3 col-12">
                            <i class="bi bi-truck"></i>
                            <div class="info">
                                <b>Chính sách giao hàng</b>
                                <span>Nhận hàng tại nhà mùa dịch</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-12">
                            <i class="bi bi-arrow-repeat"></i>
                            <div class="info">
                                <b>Đổi trả dễ dàng</b>
                                <span>1 đổi 1 trong vòng 7 ngày</span>
                            </div>
                        </div>
                        <div class="col-lg-3 col-12">
                            <i class="fa-solid fa-credit-card"></i>
                            <div class="info">
                                <b>Thanh toán tiện lợi</b>
                                <spann>Trả tiền mặt, CK, trả góp 0%</spann>
                            </div>
                        </div>
                        <div class="col-lg-3 col-12">
                            <i class="fa-solid fa-comments"></i>
                            <div class="info">
                                <b>Hỗ trợ nhiệt tình</b>
                                <span>Tư vấn, giải đáp mọi thắc mắc</span>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="rest-footer">
                <div class="row content-footer ">
                    <div class="col-3">
                        <div class="title">Thông tin liên hệ </div>
                        <div class="showroom">
                            <div class="item mt-16">
                                <p class="name">Showroom Đà Nẵng</p>
                                <p class="address">Địa chỉ: 40A Hàm Nghi, Q. Thanh Khê, TP Đà Nẵng</p>
                                <div class="telephone">Hotline: <b>079 565 1818 - (0236) 3835566</b></div>
                            </div>
                            <div class="item mt-16">
                                <p class="name">Showroom Cần Thơ</p>
                                <p class="address">Địa chỉ: 291B/9 Nguyễn Văn Cừ ND - P.An Khánh - Q. Ninh Kiều - Tp.   Cần Thơ</p>
                                <div class="telephone">Hotline: <b>(0236) 3835566</b></div>
                            </div>
                        </div>
                        <div class="social-link">
                            <a href="#"><i class="fa-brands fa-facebook"></i></a>
                            <a href="#"><i class="fa-brands fa-instagram"></i></a>
                            <a href="#"><i class="fa-solid fa-envelope"></i></a>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="title">Hỗ trợ khách hàng</div>
                        <div class="policy mt-16 ">
                            <ul class="menu-policy">
                                <li>Chính sách chung</li>
                                <li>Chính sách bảo hành</li>
                                <li>Chính sách thanh toán</li>
                                <li>Chính sách đổi trả và nhập lại</li>
                                <li>Chính sách vận chuyển và giao nhận</li>
                                <li>Chính sách bảo mật thông tin</li>
                                <li>Chính sách xử lý khiếu nại</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="title">Thông tin khuyến mãi</div> 
                        <div class="policy mt-16">
                            <ul class="menu-info">
                                <li>Tổng hợp khuyến mãi </li>
                                <li>Hướng Dẫn Trả Góp tại <b>JG3.Electronic</b> - Trả Góp 0% Với Thẻ Tín Dụng</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="title">Tổng đài hỗ trợ</div>
                        <div class="policy">
                            <div class="item mt-16">
                                <p class="group">Kinh Doanh</p>
                                <p class="tel">0236 383 55 66</p>
                            </div>
                            <div class="item mt-16">
                                <p class="group">Kỹ thuật bảo hành</p>
                                <p class="tel">0236 383 55 68</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        `
    }
}

// define inFooter (include-Footer)
customElements.define('include-footer',inFooter)