<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="WEB-INF/jsp/common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>新增商品</title>
    <%@include file="WEB-INF/jsp/common/head.jsp" %>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>商品列表</h2>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>编码</th>
                    <th>名称</th>
                    <th>男款或女款</th>
                    <th>待定1</th>
                    <th>待定2</th>
                    <th>待定3</th>
                </tr>
                </thead>
                <tbody>
                <%--<c:forEach items="${goodlist}" var="gl">
                    <tr>
                        <td onclick="initTest()">${gl.goodnum}</td>
                        <td>${gl.goodname}</td>
                        <td>
                            ${gl.maleorfemale}
                            &lt;%&ndash;<fmt:formatDate value="${sk.startTime}" pattern="yyyy-MM-dd HH:mm:ss" />&ndash;%&gt;
                        </td>
                        <td>${gl.attribute1}</td>
                        <td>${gl.attribute2}</td>
                        <td>${gl.attribute3}</td>
                    </tr>
                </c:forEach>--%>
                </tbody>
            </table>

        </div>
    </div>
</div>



<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<%--商品js--%>
<script src="resource/script/good.js"></script>

</body>
</html>