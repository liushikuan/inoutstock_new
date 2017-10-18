//商品相关js
// javascript 模块化(package.类.方法)

function initTest() {
    alert("你瞅啥");
}

function deleteGood(goodnum) {
    debugger;
    alert("瞅你咋滴");
    $.get("/good/" + goodnum, {}, function (result) {
        debugger;
        //在回调函数种执行交互流程
        if (result && result['success']) {
            var commonResult = result['data'];
            if (commonResult['code'] == "1") {//成功情况
                alert(commonResult['result']);
            } else {
                alert(commonResult['result']);
            }
        } else {
            console.log('result: ' + result);
        }
    });
}