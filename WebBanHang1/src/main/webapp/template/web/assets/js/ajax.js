
    //   Ajax
    $(document).ready(function () {
    // Bắt sự kiện click vào button
    $("#toggle-info").click(function () {
        // Gửi yêu cầu HTTP đến server bằng Ajax
        $.ajax({
            type: "GET",
            url: "get_info.php",
            success: function (response) {
                // Nếu nhận được kết quả từ server, ẩn hoặc hiện thông tin
                //   if (response.status == "success") {
                //     $("#info").slideToggle();
                //   }
                $("#info").slideToggle();
                $("#toggle-info").hide();

            },
        });
    });
});