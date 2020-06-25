<%--
  Created by IntelliJ IDEA.
  User: Quoc Anh
  Date: 6/24/2020
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>List Author</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1>List Author</h1>

<table>
    <tr>
        <th>Mã Tác Giả</th>
        <th>Tên Tác Giả</th>
        <th>Địa Chỉ</th>
        <th>SĐT</th>
        <th>Email</th>
    </tr>

    <s:iterator value="authors">
        <tr>
            <td><s:property value="maTG" /></td>
            <td><s:property value="tentacgia" /></td>
            <td><s:property value="diachi" /></td>
            <td><s:property value="SDT" /></td>
            <td><s:property value="email" /></td>
        </tr>
    </s:iterator>

</table>

</body>
</html>

