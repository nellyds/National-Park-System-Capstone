<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="flex-container">
<c:forEach var="park" items="${parks }" >

<c:url var="imgurl" value="/img/parks/${park.toLowerCase(park.parkCode) }.jpg" />

<c:url var="parkDetailUrl" value="/detailView" >
<c:param name="parkCode" value="${park.parkCode }" />
</c:url>
<div class="park">
<div class="image_container">
<a href="${parkDetailUrl }"><img class="park_view" src="${ imgurl}" /></a>
</div>
<div class="park_text">
<h1 class=""><c:out value="${park.parkName }"/></h1>
<div class="underline"></div>
<h2><c:out value="${park.state }"/></h2>
<div class="underline_two"></div>
<h4><c:out value="${park.parkDescription }"/></h4>

</div>




</div>
</c:forEach>
</div>

    

<c:import url="/WEB-INF/jsp/common/footer.jsp" />

