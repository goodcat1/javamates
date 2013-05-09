<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<head>
<meta charset="utf-8">
<title>Javamates</title>
<s:url var="appCtx" value="/" />
<sj:head debug="false" compressed="true" jqueryui="true" locale="ru"
	jquerytheme="start" loadFromGoogle="false" loadAtOnce="true" />

<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">

<script type="text/javascript" src="<s:url value="/js/json2.js"/>"></script>
<script type="text/javascript"
	src="<s:url value="/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<s:url value="/js/common.js"/>"></script>

<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
</head>