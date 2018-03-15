<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<c:url var="imgurl" value="/img/parks/${park.toLowerCase(param.parkCode)}.jpg" />
<img src="${imgurl}" />
<h2><c:out value="${param.parkCode }" /></h2>

<c:forEach var="weather" items="${fiveDayForecast }">
	
	<div class="forecast">
		<div class="highlows">
			<div>
				<c:if test="${tempType ==false}">
				<c:out value="${weather.high }F     ${weather.low }F" />
				</c:if>
				<c:if test="${tempType ==true }">
				<c:out value="${weather.high }C    ${weather.low }C" />
				</c:if>
			</div>
			<div>
				<c:out value="high     low" />
			</div>
			</div>
			<c:url var="imgurl"
				value="/img/weather/${weather.image(weather.forecast) }.png" />

			<img class="weather_image" src="${imgurl}" />
			
		
		<div>
		<c:out value="${weather.forecast }" />
		</div>



	</div>
</c:forEach>

	<c:out value="${tempType}" />



<c:url var="formAction" value="/detailView" />

<form method="POST" action="${formAction }">
	<input type="hidden" name="parkCode" value="${param.parkCode}">
	<label for="isCelsius"> Choose a Temperature Type</label> 
	<select name="isCelsius" id="isCelsius">
		<option value="select">Select</option>
		<option value="false">Farenheit</option>
		<option value="true">Celsius</option>
	</select> <input type="submit" value="Click to Submit Changed Temperature" />
</form>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />