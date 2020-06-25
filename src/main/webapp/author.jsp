<%--
  Created by IntelliJ IDEA.
  User: Quoc Anh
  Date: 6/25/2020
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Tac gia</title>
</head>
<body>

<s:form action="author" method="POST">
    <s:textfield name="tentacgia" label="Tên Tác Giả"/>
    <s:textfield name="diachi" label="Địa Chỉ"/>
    <s:textfield name="SDT" label="SĐT"/>
    <s:textfield name="email" label="Email"/>
    <s:submit value="Save" />
</s:form>

</body>
</html>
