<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />


	<c:forEach var="weather" items="${fiveDayForecast }" >
	<c:out value="${weather.forecast }" />
		<div class="forecast" >
			<div class="highlows">
			<div><c:out value="${weather.high }     ${weather.low }"/></div>
			<div><c:out value="high     low" /></div>
				
			</div>
			<div>
			
		
			</div>
		
		
		
		</div>
</c:forEach>

<c:url var="formAction" value="/detailView" />
<form method ="GET" action="${formAction }">

</form>

<button></button>



    

<c:import url="/WEB-INF/jsp/common/footer.jsp" />