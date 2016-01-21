$(document).ready(function() {
	$(".checkbox").children("div").hide();
	$(".TestExzample").click(function() {
		$(this).next("div").children("div").toggle();
	});
});
