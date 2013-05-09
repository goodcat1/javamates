<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html>
<jsp:include page="common-page-head.jsp" />

<script type="text/javascript">
	$(function() {
		common.ajaxClick("NewClaimMenuItem",
				"<s:url namespace="/" action="PrepareRequestForClaim"/>",
				"main", "errorState", "indicatorMain");
		common.ajaxClick("ListMyClaimsMenuItem",
				"<s:url namespace="/" action="ListActiveClaims"/>", "main",
				"errorState", "indicatorMain");
	});
</script>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="brand" href="#">Javamates</a>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Claims</li>
						<li id="NewClaimMenuItem"><a href="javascript:void(0)">New
								claim</a></li>
						<li id="ListMyClaimsMenuItem"><a href="javascript:void(0)">My
								claims</a></li>
						<li class="nav-header">Offers</li>
						<li id="CreateNewOfferMenuItem">New offer</li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<div class="row-fluid">
					<s:url var="ViewDefaultUrl" namespace="/" action="index" />
					<sj:div id="main" onErrorTopics="errorState" dataType="html"
						requestType="POST" href="%{ViewDefaultUrl}">
					</sj:div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>