<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/17
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<script src="/js/jquery/2.0.0/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/bootstrap/3.3.6/bootstrap.css">

<script>
    $(function(){
        function checkEmpty(id, name){
            var value = $("#"+id).val();
            if(value.length==0){
                alert(name+ "不能为空");
                $("#"+id)[0].focus();
                return false;
            }
            return true;
        }

        $(".addFormSingle").submit(function(){
            if(checkEmpty("filepathSingle","图片文件")){
                $("#filepathSingle").value("");
                return true;
            }
            return false;
        });
        $(".addFormDetail").submit(function(){
            if(checkEmpty("filepathDetail","图片文件"))
                return true;
            return false;
        });
    });
    $(function(){
        $("a").click(function(){
            var deleteLink = $(this).attr("deleteLink");
            console.log(deleteLink);
            if("true"==deleteLink){
                var confirmdelete = confirm("确认要删除");
                if(confirmdelete)
                    return true;
                return false;

            }
        });
    })
</script>

<div class="workingArea">
    <ul class="breadcrumb">
        <li class="active">${item.category.categoryName}</li>
        <li class="active">${item.itemName}</li>
    </ul>

    <table class="addPictureTable" align="center">
        <tr>
            <td class="addPictureTableTD">
                <div>
                    <div class="panel panel-warning addPictureDiv">
                        <div class="panel-heading">新增商品图片</div>
                        <div class="panel-body">
                            <form method="post" class="addFormSingle" action="addItemPicture" enctype="multipart/form-data">
                                <table class="addTable">
                                    <tr>
                                        <td>尺寸400X400</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input id="filepathSingle" type="file" name="image" />
                                        </td>
                                    </tr>
                                    <tr class="submitTR">
                                        <td align="center">
                                            <input type="hidden" name="itemId" value="${item.id}" />
                                            <button type="submit" class="btn btn-success">提 交</button>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </div>
                    </div>


                    <table class="table table-bordered table-hover  table-condensed">
                        <thead>
                        <tr class="success">
                            <th>ID</th>
                            <th>产品图片</th>
                            <th>删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${itemPictures}" var="itemPicture">
                            <tr>
                                <td>${itemPicture.id}</td>
                                <td>
                                    <a href="/images/item/${itemPicture.id}.jpg"><img height="50px" src="/images/item/${itemPicture.id}.jpg"></a>
                                </td>
                                <td><a deleteLink="true" href="deleteItemPicture?id=${itemPicture.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
    </table>
</div>
