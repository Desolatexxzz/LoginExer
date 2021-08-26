<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/8/21
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
        .box{
            float: right;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>
    <div class="box"><button type="button" class="btn btn-warning update">修改</button></div>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <tbody>
        <c:if test="${not empty list}">
            <c:forEach items="${list}" var="li" step="1">
                 <tr>
                    <td>${li.uid}</td>
                    <td>${li.uname}</td>
                    <td>${li.ugender}</td>
                    <td>${li.uage}</td>
                    <td>${li.uaddress}</td>
                    <td>${li.uqq}</td>
                    <td>${li.uemail}</td>
                    <td><a class="btn btn-default btn-sm delete" href="javascript:;">删除</a></td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="add.jsp">添加联系人</a></td>
        </tr>
    </table>
</div>
<script>
   var de = document.querySelectorAll(".delete");
   for (var i = 0; i < de.length;i++){
       de[i].onclick = function () {
            var tr = this.parentNode.parentNode;
            var uidNode = tr.firstElementChild;
            var uid = uidNode.innerHTML;
            //使用虚拟表单提交来将js中的值传个Java
           var temp = document.createElement("form");
           temp.action = "${pageContext.request.contextPath }/delete";//提交的地址
           temp.method = "post";//也可指定为get
           temp.style.display = "none";
           var opt = document.createElement("input");
           opt.name = "uuid";
           opt.value = uid;
           temp.appendChild(opt);
           document.body.appendChild(temp);
           temp.submit();
       }
   }
    var btn = document.querySelector(".update");
   btn.onclick=function () {
       location.href = "update.jsp";
   }
</script>
</body>
</html>
