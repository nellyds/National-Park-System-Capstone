<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>National Park System</title>
    <c:url value="/CSS/style.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
    <c:url var="font" value="https://fonts.googleapis.com/css?family=IBM+Plex+Mono|Nunito|Rammetto+One" />
    <link href="${font}" rel="stylesheet">
   <c:url var="jqs" value="https://code.jquery.com/jquery-3.2.1.slim.min.js" />
    <c:url var="jq" value="ps://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" />
	<c:url var="boot" value="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" />

<script src="${boot }"></script>
<link href="${boot }" rel="/stylesheet">
<script src="${jqs}"></script>
<script src="${jq }"></script>
</head>
<style>
body{
background-image: url(https://images.freecreatives.com/wp-content/uploads/2015/03/Huge-Backgrounds-2-1024x683.jpg);
background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;

}
</style>
<body>
<div class="Header">
<h1 class="title">National Park Service</h1>
<h4><c:url var="homeUrl" value="listView" /> 
<ul class="header_nav">
			<c:url var="listViewUrl" value="/" />
			<li><a href="${listViewUrl}">Home</a></li>
			<c:url var="surveyInputUrl" value="/surveyInput" />
			<li><a href="${surveyInputUrl}">Survey</a></li>
			
		</ul>




</div>