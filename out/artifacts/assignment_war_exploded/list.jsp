<%--
  Created by IntelliJ IDEA.
  User: Quoc Anh
  Date: 6/24/2020
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>List book</title>
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
<h1>List Book</h1>

<table>
    <tr>
        <th>Mã Sách</th>
        <th>Mã Loại</th>
        <th>Tên Sách</th>
        <th>Tóm Tắt</th>
        <th>Mã Tác Giả</th>
        <th>Mã NXB</th>
    </tr>

    <s:iterator value="sachs">
        <tr>
            <td><s:property value="maSach" /></td>
            <td><s:property value="maLoai" /></td>
            <td><s:property value="tenSach" /></td>
            <td><s:property value="tomtat" /></td>
            <td><s:property value="maTG" /></td>
            <td><s:property value="maNXB" /></td>
        </tr>
    </s:iterator>

</table>

</body>
</html>
