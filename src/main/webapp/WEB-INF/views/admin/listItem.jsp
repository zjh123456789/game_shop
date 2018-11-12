<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery/2.0.0/jquery.min.js"></script>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/11/12
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>商品</title>
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
        if (form.itemName.value==''){
            alert("商品名称不能为空!");
            form.itemName.focus();
            return false;
        }
        if (form.originalPrice.value==''){
            alert("原价不能为空!");
            form.originalPrice.focus();
            return false;
        }
        if (form.currentPrice.value==''){
            alert("现价不能为空!");
            form.currentPrice.focus();
            return false;
        }if (form.stock.value==''){
            alert("库存不能为空!");
            form.stock.focus();
            return false;
        }
        if (form.itemDescription.value==''){
            alert("商品描述不能为空!");
            form.itemDescription.focus();
            return false;
        }
        return true;
    }
</script>
<body>
<div class="container-fluid">
    <h2>商品展示</h2>

    <div class="basicFunction">新增商品</div>

    <form method="post" id="addForm" action="addItem" onsubmit="return check(this)">
        <table class="addTable">
            <tr>
                <td>商品类型</td>
                <td> <select name="categoryId" id="categoryId">
                        <option>-请选择类别-</option>
                        <c:forEach items="${categories}" var="category">
                            <option value="${category.id}">${category.categoryName}</option>
                        </c:forEach>
                     </select>
                </td>
            </tr>
            <tr>
                <td>商品名称</td>
                <td><input  id="itemName" name="itemName" type="text" class="form-control"></td>
            </tr>
            <tr>
                <td>原价</td>
                <td><input  id="originalPrice" name="originalPrice" type="text" class="form-control"></td>
            </tr>
            <tr>
                <td>现价</td>
                <td><input  id="currentPrice" name="currentPrice" type="text" class="form-control"></td>
            </tr>
            <tr>
                <td>库存</td>
                <td><input  id="stock" name="stock" type="text" class="form-control"></td>
            </tr>
            <tr>
                <td>商品描述</td>
                <td><textarea name="itemDescription" id="itemDescription" cols="22" rows="4"></textarea></td>
            </tr>
            <tr>
                <td>原始英雄ID</td>
                <td><input  id="originalHeroId" name="originalHeroId" type="text" class="form-control"></td>
            </tr>
            <tr class="submitTR">
                <td colspan="2" align="center">
                    <input type="submit" class="btn btn-success" value="添加" />
                    <input type="reset" name="button" id="button" value="重置" />
                </td>
            </tr>
        </table>
    </form>


    <table class="table tab-container">
        <thead>
        <tr class="success">
            <th>ID</th>
            <th>所属类别</th>
            <th>商品名称</th>
            <th>原价</th>
            <th>现价</th>
            <th>库存</th>
            <th>创建人</th>
            <th>创建时间</th>
            <th>修改人</th>
            <th>修改时间</th>
            <th>商品描述</th>
            <th>编辑</th>
            <th>下架商品</th>
            <th>图片管理</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${items}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.category.categoryName}</td>
                <td>${item.itemName}</td>
                <td>${item.originalPrice}</td>
                <td>${item.currentPrice}</td>
                <td>${item.stock}</td>
                <td>${item.createUser}</td>
                <td>${item.createTime}</td>
                <td>${item.updateUser}</td>
                <td>${item.updateTime}</td>
                <td>${item.itemDescription}</td>
                <td><a href="editItem?id=${item.id}">编辑</a></td>
                <td><a href="deleteItem?id=${item.id}">下架商品</a></td>
                <td><a href="/itemPicture/list?id=${item.id}">图片管理</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
