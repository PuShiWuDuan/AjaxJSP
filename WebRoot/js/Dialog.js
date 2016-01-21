$(document).ready(function() {
	var chose="";
	$('#dialog').click(function() {
		var data = [];
		$('input[name="Fruit"]:checked').each(function() {
		  // $('.col-md-8').text(this.value);
		   chose = this.value;
		   data.push({checkboxGroup:chose});
		});
		//alert(data);
		$.ajax({
			type:"POST",
			url : 'GetTestResultServlet',
			data :{chosed:chose},
			success : function(responseText) {
				//alert("ok");
				$('#row').html(responseText);
				$.parser.parse($("#row")); 
				//alert("ok");
			}
		});
	});
});
