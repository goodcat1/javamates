<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<jsp:include page="common-page-head.jsp" />

<div id="claimsRegion">
	<h1>List of active claims</h1>

	<div id="gridRegion">
		<s:url var="gridDataUrl" namespace="/" action="ListActiveClaimsGrid" />
		<sjg:grid gridModel="claims" href="%{gridDataUrl}" shrinkToFit="true"
			autowidth="true">
			<sjg:gridColumn name="id" title="ID" />
			<sjg:gridColumn name="createDate" title="Creation date" />
			<sjg:gridColumn name="amount" title="Claim amount" />
			<sjg:gridColumn name="rate" title="Rate" />
			<sjg:gridColumn name="period" title="Payment months count" />
			<sjg:gridColumn name="state" title="State" />
			<sjg:gridColumn name="purpose" title="Purpose" />
			<sjg:gridColumn name="description" title="Description" />
		</sjg:grid>
	</div>
</div>