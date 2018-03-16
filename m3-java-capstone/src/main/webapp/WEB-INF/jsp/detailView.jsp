<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div class="park_detail">
<c:url var="imgurl" value="/img/parks/${park.toLowerCase(param.parkCode)}.jpg" />
<img src="${imgurl}" />

<c:out value="${park.parkName }" />
<c:out value= "${park.acreage } acres" />
<c:out value="${park.elevationInFeet }" />
<c:out value="${park.numberOfCampSites }" />
<c:out value="${park.yearFounded }" />
<c:out value="${park.annualVisitorCount }" />
<c:out value="${park.inspirationalQuote }" />
<c:out value="${park.quoteSource }"/>

<h2><c:out value="${param.parkCode }" /></h2>
</div>
<div class="flex-container_forecast" >
<c:forEach var="weather" items="${fiveDayForecast }">
	
	<div class="forecast">
		<div class="highlows">
			<div>
				<c:if test="${tempType ==false}">
				<c:out value="${weather.high }F     ${weather.low }F" />
				</c:if>
				<c:if test="${tempType ==true }">

				<c:out value="${weather.highFtoC(weather.high) }C    ${weather.lowFtoC(weather.low)}C" />
				</c:if>
			</div>
			<div>
				<c:out value="high     low" />
				<c:out value="${weather.forecastMessage(weather.forecast)}"/>
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
</div>
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