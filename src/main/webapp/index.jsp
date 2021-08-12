<%--
  Created by IntelliJ IDEA.
  User: iU LOVE
  Date: 8/12/2021
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="/create">create</a>
  <table>
    <c:forEach items="${list}" var="c" varStatus="loop">
      <tr>
        <td>${c.name}</td>
        <td>${c.date}</td>
        <td>${c.address}</td>
        <td>${c.phone}</td>
        <td>${c.gmail}</td>
        <td>${c.classRoom}</td>
        <td><a href="/edit?index=${loop.index}">edit</a></td>
        <td><a href="/delete?index=${loop.index}">delete</a></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
