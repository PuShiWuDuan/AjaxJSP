function adddiv(){
			
			$.getJSON("./data2.json",function(data){
							
							var a=document.getElementById("aa");
							var b=document.getElementById("bb");
							var c=document.getElementById("cc");
							
			
			
			var abc=document.getElementsByClassName("list-group-item");
			var row2 = document.createElement("a");
			row2.innerHTML="<a href='##' class='list-group-item'><div class='row'><div class='col-md-3' id='aa'>"+data.aa+"</div><div class='col-md-1' id='bb'>"+data.bb+"</div><div class='col-md-8' id='cc'>"+data.cc+"</div></div></a>"
			row.appendChild(row2);
			});
			
		}    
