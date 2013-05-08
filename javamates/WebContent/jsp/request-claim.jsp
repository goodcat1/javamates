<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<div id="newClaimRegion">
	<h1>Create claim</h1>
	<hr />

	<s:form id="newClaimForm">
		<table>
			<s:textfield id="amount" name="claim.amount" value="%{claim.amount}"
				label="Claim amount, $" />
			<s:textfield id="period" name="claim.period" value="%{claim.period}"
				label="Claim period, months" />
			<s:textfield id="rate" name="claim.rate" value="%{claim.rate}"
				label="Claim rate, %" />
			<s:textfield id="purpose" name="claim.purpose"
				value="%{claim.purpose}" label="Claim purpose" />
			<s:textarea id="description" name="claim.description"
				value="%{claim.description}" cols="40" rows="10"
				label="Claim desciption" />
		</table>
	</s:form>

	<div id="newClaimFormButtons">
		<s:url var="CreateNewRequestUrl" namespace="/"
			action="CreateNewRequest" />
		<s:url var="exitUrl" namespace="/" action="index" />
		<sj:a id="newClaimButton" button="true" cssClass="btn"
			formIds="newClaimForm" href="%{CreateNewRequestUrl}"
			requestType="POST" dataType="json"
			onSuccessTopics="CreateNewRequestSuccessTopic">Create claim</sj:a>
		<sj:a id="cancelButton" button="true" cssClass="btn" href="%{exitUrl}"
			requestType="POST" targets="main">Cancel</sj:a>
	</div>
</div>

<script type="text/javascript">
	$(function() {
		$('#newClaimButton')
				.subscribe(
						'CreateNewRequestSuccessTopic',
						function(event, element) {
							var result = $
									.parseJSON(event.originalEvent.request.responseText);

							if (result.status === 'success') {
								common.showInfoDialog(result.message,
										'Success', {
											Ok : function() {
												$(this).dialog("close");
												$('#cancelButton').click();
											}
										});
							} else {
								common.showInfoDialog(result.message, 'Error');
							}
						});
	});

	
</script>