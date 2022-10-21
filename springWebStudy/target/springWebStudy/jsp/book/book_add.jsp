<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<form name="frmbook" method="post">
<%--      action="${pageContext.request.contextPath}/bookadd">--%>
    <table width="60%" border="0" align="center">
        <tr>
            <td align="left">添加图书</td>
        </tr>
        <tr>
            <td>
                <table width="100%" border="1"
                       cellpadding="5" cellspacing="0" align="center">
                    <tr>
                        <td width="20" align="right">图书名称</td>
                        <td><input type="text" name="name" size="30"></td>
                    </tr>
                    <tr>
                        <td align="right">出版社</td>
                        <td><input type="text" name="publisher" size="30">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">图书价格</td>
                        <td><input type="text" name="price"></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>
                <%--<input type="submit" value="保存">&nbsp;&nbsp;--%>
                <button onclick="save()">保存</button>
                <button onclick="cancel()">取消</button>
            </td>
        </tr>
    </table>
</form>
<script>
    function save(){
        document.frmbook.action='${pageContext.request.contextPath}/bookadd';
        document.frmbook.submit();
    }
    function cancel(){
        window.location.href='${pageContext.request.contextPath}/booklist';
    }
</script>
</body>
</html>
