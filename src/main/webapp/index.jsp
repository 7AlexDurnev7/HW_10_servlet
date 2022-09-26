<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quota</title>
    <link rel="stylesheet" href="./templates/css/commons.css">
</head>
<body>
    <h2>Homework "Servlets"</h2>

    <ul>
       <li><a href="${pageContext.request.contextPath}/quota-servlet">Put to get quota</a></li>
    <br>
<%--            <form action="quota-servlet" method="get" style="margin: 10px">--%>
<%--                <button>--%>
<%--                    Put to get quota--%>
<%--                </button>--%>
<%--            </form>--%>

        <li><a href="${pageContext.request.contextPath}/calculate.jsp">Put to calculate</a></li>

<%--            <form action="calculateServlet" method="post" style="margin: 12px">--%>
<%--              <button>--%>
<%--                   Put to calculate--%>
<%--               </button>--%>
<%--            </form>--%>
        <br>
        <li><a href="${pageContext.request.contextPath}/calculationNumber.jsp">Put to calculation numbers</a></li>
        <br>
        <li><a href="${pageContext.request.contextPath}/calculator.jsp">Put to calculate</a></li>
    </ul>
<jsp:include page="templates/footer.jsp"/>
</body>
</html>