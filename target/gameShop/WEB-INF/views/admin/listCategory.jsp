<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery/2.0.0/jquery.min.js"></script>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/11/10
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>类别</title>
</head>

<style>
    div.basicFunction{
        margin: 50px 180px ;
    }
    table{
        margin: 20px auto;
    }
    th{
        width: 100px;
    }
    td{
        text-align: center;
    }
</style>

<script>
    function check(form) {
        if (form.categoryName.value==''){
            alert("类别名称不能为空!");
            form.categoryName.focus();
            return false;
        }
        return true;
    }
</script>
<body>

    <div class="container-fluid">
        <h2>类别展示</h2>

        <div class="basicFunction">新增分类</div>

        <form method="post" id="addForm" action="addCategory" onsubmit="return check(this)">
            <table class="addTable">
                <tr>
                    <td>类别名称</td>
                    <td><input  id="categoryName" name="categoryName" type="text" class="form-control"></td>
                </tr>
                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <input type="submit" class="btn btn-success" value="添加" />
                    </td>
                </tr>
            </table>
        </form>


        <table class="table tab-container">
            <thead>
                <tr class="success">
                    <th>ID</th>
                    <th>类别名称</th>
                    <th>创建时间</th>
                    <th>创建人</th>
                    <th>修改时间</th>
                    <th>修改人</th>
                    <th>删除标志</th>
                    <th>编辑</th>
                    <th>删除</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${categories}" var="category">
                    <tr>
                        <td>${category.id}</td>
                        <td>${category.categoryName}</td>
                        <td>${category.createTime}</td>
                        <td>${category.createUser}</td>
                        <td>${category.updateTime}</td>
                        <td>${category.updateUser}</td>
                        <td>${category.deleteFlag}</td>
                        <td><a href="editCategory?id=${category.id}">编辑</a></td>
                        <td><a href="deleteCategory?id=${category.id}">删除</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>


</html>
