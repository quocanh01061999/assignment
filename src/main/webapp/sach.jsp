<%--
  Created by IntelliJ IDEA.
  User: Quoc Anh
  Date: 6/24/2020
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sach</title>
</head>
<body>

<s:form action="sach" method="POST">
    <s:textfield name="maSach" label="Mã Sách"/>
    <s:textfield name="maLoai" label="Mã Loại"/>
    <s:textfield name="tenSach" label="Tên Sách"/>
    <s:textfield name="tomtat" label="Tóm tắt"/>
    <s:textfield name="maTG" label="Mã Tác Giả"/>
    <s:textfield name="maNXB" label="Mã NXB"/>
    <s:submit value="Save" />
</s:form>

</body>
</html>
