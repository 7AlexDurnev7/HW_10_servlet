<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 25.09.2022
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h2>Calculator</h2>
        <form action="calculatorServlet" method="post">
            <input type="number" name="number_1" value="${number_1}">
                <select name="operation">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="/">/</option>
                    <option value="*">*</option>
                    <option value="%">%</option>
                    <option value="^">^</option>
                </select>
            <input type="number" name="number_2" value="${number_2}">
        <input type="text" name="result" disabled value="${result}">
    <button>
        Calculate
    </button>
        </form>
</body>
</html>
