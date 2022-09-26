<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 20.09.2022
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
    <h2>Task 2 - Calculate max unit </h2>
        <form action="calculateServlet" method="post">
            <label>
                <input type="number" id="num_1" name="number_1">
            </label>
            <label>
                <input type="number" id="num_2" name="number_2">
            </label>
            <label>
                <input type="number" id="num_3" name="number_3">
            </label>
            <label>
                <input type="text" name="result" disabled value="${result}">
            </label>
            <button>
                Calculate
            </button>
        </form>
</body>
</html>
