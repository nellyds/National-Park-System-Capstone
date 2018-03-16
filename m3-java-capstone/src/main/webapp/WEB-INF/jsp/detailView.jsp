<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div class="park_detail">
	<div class="detail_image">
		<c:url var="imgurl"
			value="/img/parks/${park.toLowerCase(param.parkCode)}.jpg" />
		<img class="image_class_detail" src="${imgurl}" />
	</div>
	<div class="detail_container">
		<div>

			<div class="park_info">
				<h1 class="park_name">
					<c:out value="${park.parkName }" />
				</h1>
				<div class="underline_three"></div>
				<p>
					<c:out value="${park.acreage } acres" />
				</p>
				<p>
					<c:out value="${park.elevationInFeet }" />
				</p>
				<p>
					<c:out value="${park.numberOfCampSites }" />
				<p>
				<p>
					<c:out value="${park.yearFounded }" />
				<p>
				<p>
					<c:out value="${park.annualVisitorCount }" />
				</p>
				<div class="underline_three"></div>
				<p>
					<c:out value="${park.parkDescription }" />
				</p>

				<div class="underline_three"></div>
				<p class="quote">
					"<c:out value="${park.inspirationalQuote }" />"
				</p>
				<p class="quote_source">
					<c:out value="${park.quoteSource }" />
				</p>
			</div>

		</div>
	</div>
	<div class="flex-container_forecast">
		<c:forEach var="weather" items="${fiveDayForecast }">

			<div class="forecast">
				<div class="highlows">
					<div>
						<div>
							<div class="forecastHigh">
								<c:if test="${tempType ==false or tempType == null}">
									<h4><c:out value="high of ${weather.high }F"/></h4>
									<h4><c:out value="low of ${weather.low }F"/></h4>
									
								</c:if>
							</div>
							<div class="forecastLow">
								<c:if test="${tempType ==true }">

								<h4><c:out value="high of ${weather.highFtoC(weather.high) }C" /></h4>
								<h4><c:out value="low of ${weather.lowFtoC(weather.low)}C" /></h4>
									
								</c:if>
							</div>
						</div>
					</div>
					
					<div>
						
					</div>
					<c:out value="${weather.forecastMessage(weather.forecast)}"/>

				</div>
				<c:url var="imgurl"
					value="/img/weather/${weather.image(weather.forecast) }.png" />

				<img class="weather_image" src="${imgurl}" />


				<div>
					<c:out value="${weather.tempMessage(weather.low,weather.high) }" />
				</div>



			</div>
		</c:forEach>
	</div>
	<c:out value="${tempType}" />



	<c:url var="formAction" value="/detailView" />
	<div class="surveyForm">
		<form method="POST" action="${formAction }">
			<input type="hidden" name="parkCode" value="${param.parkCode}">
			<label for="isCelsius"> Choose a Temperature Type</label> <select
				name="isCelsius" id="isCelsius">
				<option value="select">Select</option>
				<option value="false">Farenheit</option>
				<option value="true">Celsius</option>
			</select> <input type="submit" value="Click to Submit Changed Temperature" />
		</form>
	</div>
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />