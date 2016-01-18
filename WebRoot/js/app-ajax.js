$(document).ready(function() {
	var chosed;
    var o=[];
	$('#btnShow').click(function() {
		var data = [];
		$('input[name="Fruit"]:checked').each(function() {
		  // $('.col-md-8').text(this.value);
		   chosed = this.value;
		   data.push({checkboxGroup:chosed});
		});
		//alert(data);
		$.ajax({
			type:"POST",
			url : 'GetUserServlet',
			data :{chosed:chosed},
			success : function(responseText) {
				var finishtime=new Date();
	           // timediff=finishtime.getTime()-inittime.getTime();
				$('#row').html(responseText);
				$.parser.parse($("#row")); 
			}
		});
	});
	$('#userName').blur(function() {
		$.ajax({
			type:"POST",
			url : 'GetUserServlet',
			data : {
				userName : $('#userName').val()
			},
			success : function(responseText) {
				$('#ajaxGetUserServletResponse').text(responseText);
			}
		});
	});
});
