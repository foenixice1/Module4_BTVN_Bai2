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
<form method="post">
    <table>
        <tr>
            <td><input type="text" name="name" value="${hocVien.name}" ></td>
            <td><input type="text" name="date" value="${hocVien.date}" ></td>
            <td><input type="text" name="address" value="${hocVien.address}" ></td>
            <td><input type="number" name="phone" value="${hocVien.phone}" ></td>
            <td><input type="text" name="gmail" value="${hocVien.gmail}" ></td>
            <td><input type="text" name="classRoom" value="${hocVien.classRoom}" ></td>

        </tr>
        <tr>
            <td>
                <button type="submit">Edit Nhan viên</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
