<%--
  Created by IntelliJ IDEA.
  User: iU LOVE
  Date: 8/12/2021
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/create" method="post">
    <table>
        <tr>
            <td><input type="text" name="name" placeholder="nhập tên"></td>
            <td><input type="text" name="date" placeholder="nhập ngày sinh"></td>
            <td><input type="text" name="address" placeholder="nhập địa chỉ"></td>
            <td><input type="number" name="phone" placeholder="nhập sđt"></td>
            <td><input type="text" name="gmail" placeholder="nhập gmail"></td>
            <td><input type="text" name="classRoom" placeholder="nhập lớp"></td>
        </tr>

        <tr>
            <td>
                <button type="submit">Create Học Viên</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
