<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>会员列表</title>
</head>
<body>
<table width="800" border="0" align="center">
<tr>
    <td>
        会员列表&nbsp;&nbsp;
        <input type="button" id="btnAdd" value="注册"
               onclick="add()">
    </td>
</tr>
<tr>
<td>
<table border="1" width="100%" cellpadding="10"
cellspacing="0">
<tr align="center">
    <td width="10%">序号</td>
    <td width="25%">会员名称</td>
    <td width="15%">会员类型</td>
    <td width="15%">会员级别</td>
    <td width="15%">联系电话</td>
    <td>操作</td>
</tr>
<c:forEach var="party" items="${partylist}"
           varStatus="varstatus">
    <tr align="center">
    <td>
    <c:out value="${varstatus.index+1}"/>
    </td>
    <td>${party.partyName}</td>
    <td>
    <c:if test="${party.partyType=='0'}">个⼈</c:if>
    <c:if test="${party.partyType=='1'}">机构</c:if>
    </td>
        <td>${party.partyLevel}</td>
        <td>${party.phone}</td>
        <td>
            <input type="button" id="btnEdit" value="修改"
                   onclick="edit(${party.partyId})">
            <input type="button" id="btnDel" value="删除"
                   onclick="del(${party.partyId})">
        </td>
    </tr>
</c:forEach>
</table>
</td>
</tr>
</table>
<script>
 function add() {
    window.location.href="${pageContext.request.contextPath}/topartyadd";
 }
 function edit(id) {
    window.location.href="${pageContext.request.contextPath}/topartyedit?partyId=" +id;
 }
 function del(id) {
    if(confirm("要删除该数据吗?")){
    window.location.href="${pageContext.request.contextPath}/partydelete?partyId="+ id;
    }
  }
</script>
</body>
</html>
