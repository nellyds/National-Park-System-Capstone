<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:forEach var="survey" items="${surveys }">
<c:out value="${survey.parkCode }" />
</c:forEach>

    

<c:import url="/WEB-INF/jsp/common/footer.jsp" />