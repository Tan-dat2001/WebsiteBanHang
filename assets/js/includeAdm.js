class headerAdm extends HTMLElement{
    connectedCallback(){
        this.innerHTML = `
        <header class="app-header"><a class="app-header__logo" href="../../pages/AdminView/index.html">Admin</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        <li class="app-search">
          <input class="app-search__input" type="search" placeholder="Search">
          <button class="app-search__button"><i class="fa fa-search"></i></button>
        </li>
    
       
        <!-- User Menu-->
        <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-item" href="page-user.html"><i class="fa fa-cog fa-lg"></i> Settings</a></li>
            <li><a class="dropdown-item" href="page-user.html"><i class="fa fa-user fa-lg"></i> Profile</a></li>
            <li><a class="dropdown-item" href="./login.html"><i class="fa fa-sign-out fa-lg"></i> Logout</a></li>
          </ul>
        </li>
      </ul>
    </header>


    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
      <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="../../assets/image/avatarJG3.png" alt="User Image">
        <div>
          <p class="app-sidebar__user-name">JG3.Electronic</p>
        </div>
      </div>
      <ul class="app-menu">
        <li><a class="app-menu__item active" href="../../pages/AdminView/index.html"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>
        <li><a class="app-menu__item" href="../../pages/AdminView/linhkien.html" ><i class="app-menu__icon fa fa-laptop"></i><span class="app-menu__label">Quản Lí Linh Kiện</span></a>
        <li><a class="app-menu__item" href="../../pages/AdminView/formdanhmuc.html"><i class="app-menu__icon fa fa-pie-chart"></i><span class="app-menu__label">Quản Lí Danh mục </span></a></li>
        <li><a class="app-menu__item" href="../../pages/AdminView/nguoiDung.html"><i class="app-menu__icon fa fa-pie-chart"></i><span class="app-menu__label">Quản Lí Khách Hàng</span></a></li>
        <li><a class="app-menu__item" href="../../pages/AdminView/donHang.html"><i class="app-menu__icon fa fa-pie-chart"></i><span class="app-menu__label">Quản Lí Đơn Hàng </span></a></li>
      </ul>
    </aside>
          
        
          
        
        `
    }
}

customElements.define('include-admin',headerAdm)