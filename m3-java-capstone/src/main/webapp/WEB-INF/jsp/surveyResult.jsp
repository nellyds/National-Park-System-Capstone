<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="flex-container">
<table>
<c:forEach var="park" items="${parks }" >
<c:url var="parkDetailUrl" value="/detailView" >
<c:param name="parkCode" value="${park.parkCode }" />
</c:url>

<tr>
<td><a href="${parkDetailUrl }"><c:out value="${park.parkName }"/></a></td>

<td class="bar"style="width: ${park.amountOfSurveys }"></td>
<td><c:out value="${park.amountOfSurveys }"></c:out></td>
</tr>


</c:forEach>

</table>









</div>






</div>

    

<c:import url="/WEB-INF/jsp/common/footer.jsp" />

