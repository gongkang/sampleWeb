/**
 * Created by gongkang on 2017/7/14.
 */

$(function() {
    initBtn();
})

function initBtn() {
    $('#btn').click(function() {
        $.ajax({
            type: "post",
            url: "/test/json",
            data:{name: '龚康',age: 111},
            success: function (data) {
                if (data.success) {
                    alert(data.data.name);
                }
            }
        });
    })

    $('#btn2').click(function() {
        $.ajax({
            type: "get",
            url: "/test/string",
            data:{name: '龚康'},
            success: function (data) {
                if (data.success) {
                    alert(data.data);
                }
            }
        });
    })

}