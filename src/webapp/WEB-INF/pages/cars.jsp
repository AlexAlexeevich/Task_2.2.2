<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 07.06.2020
  Time: 3:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=windows-1251"
         pageEncoding="windows-1251" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<body>

<table cellspacing="1" border="5" cellpadding="7">

    <tr>
        <th><h3><spring:message code="modelCar"/></h3></th>
        <th><h3><spring:message code="color"/></h3></th>
        <th><h3><spring:message code="numberCar"/></h3></th>
        <th><h3><spring:message code="year"/></h3></th>
    </tr>
    <c:forEach items="${carsFromList}" var="car">
        <tr>
            <td>${car.modelCar}</td>
            <td>${car.color}</td>
            <td>${car.numberCar}</td>
            <td>${car.year}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
