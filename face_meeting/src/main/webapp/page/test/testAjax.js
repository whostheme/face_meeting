layui.use(['element', 'layer', 'jquery'], function () {
    var element = layui.element;
    var layer = layui.layer;
    var $ = layui.$;


    //根据cookie中得userId查询用户信息
    var userId = $.cookie("userId")
    console.log("userId是："+userId)
    var path = "http://localhost:8080/face_meeting"
    var url = path + "/meeting/getMyAttends.do";
    $.ajax({
        url: url,
        type: "post",
        traditional: true, //这使json格式的字符不会被转码
        data: JSON.stringify({
            "pId": userId
        }),
        contentType: 'application/json;charset=UTF-8', //这里的这行是关键
        dataType: "json",
        success: function (data) {
            console.log("pName是："+data.data.pName)
            console.log("data.data是："+JSON.stringify(data.data))
            $("#test1").html(JSON.stringify(data.data));
        },
        error: function () {
             alert("ajax请求失败");
        }
    });

});