<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<table width="60%" border="0" align="center">
    <tr>
        <td align="left">
            图书列表&nbsp;&nbsp;&nbsp;
            <input type="button" name="btnadd"
                  value="添加" onclick="bookadd()">
        </td>
    </tr>
    <tr>
        <td>
            <table width="100%" border="1"
                cellpadding="5" cellspacing="0" align="center">
                <tr>
                    <td width="10%" align="center">序号</td>
                    <td width="35%" align="left">图书名称</td>
                    <td width="25%" align="left">出版社</td>
                     <td width="15%" align="right">价格</td>
                     <td width="15%" align="center">操作</td>
                </tr>
                <c:forEach var="book" items="${booklist}" varStatus="vstatus">
                    <tr>
                        <td align="center">${vstatus.index+1}</td>
                        <td>${book.name}</td>
                        <td>${book.publisher}</td>
                        <td align="right">${book.price}</td>
                        <td align="center">
                            <button onclick="bookedit(${book.id})">修改</button>
                            <button onclick="bookdelete(${book.id})">删除</button>
                            <!--
                            <input type="button" name="btnedit"
                                value="修改" onclick="bookedit(${book.id})">
                            <input type="button" name="btndelete"
                                   value="删除" onclick="bookdelete(${book.id})">
                                  -->
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
<script language="JavaScript">
     //添加图书
    function bookadd() {
<%--    document.location.replace("${pageContext.request.contextPath}/tobookadd");--%>
    window.location.href='${pageContext.request.contextPath}/tobookadd';
    }
    //修改图书信息
    function bookedit(id) {
<%--        window.location.replace("${pageContext.request.contextPath}/tobookedit?id=" + id);--%>
        window.location.href='${pageContext.request.contextPath}/tobookedit?id'+id;
    }
    //删除图书
    function bookdelete(id) {
    window.location.replace("${pageContext.request.contextPath}/bookdelete?id=" +id);
<%--    window.location.href--%>
<%--                        ='${pageContext.request.contextPath}/bookdelete?id='+id;--%>
    }
</script>
</body>
</html>
