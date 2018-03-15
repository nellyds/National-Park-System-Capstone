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
			<c:url var="imgurl" value="/img/weather/${weather.image(weather.forecast) }.png" />
			
			<img src="${imgurl}" />				
			</div>
			<div>
			
		
			</div>
		
		
		
		</div>
</c:forEach>

<c:url var="formAction" value="/detailView" />

<form method ="POST" action="${formAction }">
<input type="hidden" name="param.parkCode" value="${param.parkCode}">

<input type="submit" value="Click to Change temp type"/>
</form>

<button></button>
<c:out value="${tempPreference.celsius}"/>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />