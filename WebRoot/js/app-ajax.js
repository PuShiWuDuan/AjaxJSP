$(document).ready(function() {
	var chose="";
	var div=[];
   
	$('#btnShow').click(function() {
		$("div.checkbox").each(function(){
			var value = $(this).attr("value");
			if(value!=0)div.push(value);
		});
		$("div.checkbox").find(div).hide();
		var data = [];
		$('input[name="Fruit"]:checked').each(function() {
		  // $('.col-md-8').text(this.value);
		   chose = this.value;
		   alert(chose);
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
