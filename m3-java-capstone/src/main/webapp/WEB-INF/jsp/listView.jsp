<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<c:forEach var="park" items="${parks }" >
<c:out value="${park.parkName }" />
<c:out value="${park.toLowerCase(park.parkCode)}" />
<c:url var="imgurl" value="/img/parks/${park.toLowerCase(park.parkCode) }.jpg" />

<c:url var="parkDetailUrl" value="/detailView" >
<c:param name="parkCode" value="${park.parkCode }" />
</c:url>
<a href="${parkDetailUrl }"><img src="${ imgurl}" /></a>
</c:forEach>


    

<c:import url="/WEB-INF/jsp/common/footer.jsp" />

