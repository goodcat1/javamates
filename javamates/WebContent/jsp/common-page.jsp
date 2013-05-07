<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html>
<jsp:include page="common-page-head.jsp" />
<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="brand" href="#">Project name</a>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li>Claims</li>
						<li>Offers</li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<div class="row-fluid">
					<s:url var="ViewDefaultUrl" namespace="/" action="ListActiveClaims" />
					<sj:div id="main" onErrorTopics="errorState" dataType="html"
						requestType="POST" cssClass="f-form" href="%{ViewDefaultUrl}">
					</sj:div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>