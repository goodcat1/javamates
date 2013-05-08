var common = function() {
	var module = {};

	module.log = function(params) {
		if (console) {
			console.log(params);
		}
	};

	module.ajaxClick = function(id, href, targets, onerr) {
		var options = {};
		options.jqueryaction = "anchor";
		options.id = id;
		options.onerr = onerr;
		options.targets = targets;
		options.requesttype = "POST";
		options.href = href;
		$.struts2_jquery.bind($('#' + id), options);
	};

	module.showInfoDialog = function(message, caption, buttons) {
		var dialogDiv = $('<div id="infoMessage" title="' + caption + '">'
				+ message + '</div>');

		var buttonsObj = null;

		if (buttons) {
			buttonsObj = buttons;
		} else {
			buttons = {
				Ok : function() {
					$(this).dialog("close");
				}
			};
		}

		dialogDiv.dialog({
			modal : true,
			buttons : buttonsObj
		});
	};

	return module;
}();