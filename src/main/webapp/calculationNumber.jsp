<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 23.09.2022
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation number</title>
</head>
<body>
  <h2>Calculate "min" "max" "avg" </h2>
    <form action="calculationNumberServlet" method="post">
      <label>
        <input type="number" id="numb_1" name="num_1">
      </label>
      <label>
        <input type="number" id="numb_2" name="num_2">
      </label>
      <label>
        <input type="number" id="numb_3" name="num_3">
      </label>
      <label>
        <input type="text" name="result" disabled value="${result}">
      </label>
      <p>Choose</p>
        <input type="radio" name="choice" value="MAX" id="max">
      <label for="max">MAX</label>
        <input type="radio" name="choice" value="MIN" id="min">
      <label for="min">MIN</label>
        <input type="radio" name="choice" value="AVG" id="avg">
      <label for="avg">AVG</label>
      <br>
      <br>
      <button>
        Calculate
      </button>
    </form>

</body>
</html>
