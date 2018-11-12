<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/11/12
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑类别</title>
</head>
<body>

    <div class="panel-heading">编辑分类</div>
    <div class="panel-body">
        <form method="post" id="editForm" action="updateCategory">
            <table class="editTable">
                <tr>
                    <td>分类名称</td>
                    <td><input  id="categoryName" name="categoryName" value="${category.categoryName}" type="text" class="form-control"></td>
                </tr>
                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <input type="hidden" name="id" value="${category.id}">
                        <button type="submit" class="btn btn-success">提 交</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
