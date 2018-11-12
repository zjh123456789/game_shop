<%--
  Created by IntelliJ IDEA.
  User: 朱景辉
  Date: 2018/11/12
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑商品</title>
</head>
<body>
    <div class="panel-heading">编辑商品</div>
    <div class="panel-body">
        <form method="post" id="editForm" action="updateItem">
            <table class="editTable">
                <tr>
                    <td>商品名称</td>
                    <td><input  id="categoryName" name="categoryName" value="${item.itemName}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>原价</td>
                    <td><input  id="originalPrice" name="originalPrice" value="${item.originalPrice}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>现价</td>
                    <td><input  id="currentPrice" name="currentPrice" value="${item.currentPrice}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>库存</td>
                    <td><input  id="stock" name="stock" value="${item.stock}" type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td>商品描述</td>
                    <td><textarea name="itemDescription" id="itemDescription" cols="22" rows="4">${item.itemDescription}</textarea></td>
                </tr>
                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <input type="hidden" name="id" value="${item.id}">
                        <button type="submit" class="btn btn-success">提 交</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
