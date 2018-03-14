<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />


<c:forEach var="weather" items="${fiveDayForecast }" >
<c:out value="${weather.low }" />
</c:forEach>

<c:url var="formAction" value="/detailView" />
<form method ="GET" action="${formAction }">

</form>

<%-- <c:url var="formAction" value="/result" />
	<form method="GET" action="${formAction}">
	
		
		
		<div class="formInputGroup">
			<label for="message">Choose an Image</label>
				<select name="image" id="image">
				<c:forEach var="image" items="${images }">
					<option value="${image.image_id }" ><c:out value="image  ${image.image_id }"/></option>
				</c:forEach>
				</select	>
		</div>
		<div class="formInputGroup">
			<label for="message">Choose a message: </label> 
				<select name="message" id="messages">
				<c:forEach var="message" items="${messages }">
					<option value="${message.message_id }" ><c:out value="message ${message.message_id }"/></option>
				</c:forEach>
				</select>
		</div>
		<div class="formInputGroup">
			<label for="receiver">For whom: </label> 
			<input type="text" name="receiver" id="receiver" />
		</div>
		<div class="formInputGroup">
			<label for="sender">Sent from: </label> 
			<input type="text" name="sender" id="sender" />
		</div>
		<input class="formSubmitButton" type="submit" value="Make That Card!" />
	</form> --%>



    

<c:import url="/WEB-INF/jsp/common/footer.jsp" />