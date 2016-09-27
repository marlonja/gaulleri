$(document).ready(function(){
	
    $('#emailBtn').click(function(){
        var firstAdd = $('input[name=email]').val();
        
        if(firstAdd.length > 50){
        	alert("Your email can't be longer than 50 characters");
        
        }else{             
        	 console.log("trying to post");
        	 
             $.post("doit", {"email": firstAdd})
             .done(function(data){
            	 console.log(data + "Ok")
            	 console.log(data)
            	 if(data == "true"){
            		 window.location.href = 'HTML/responsExist.html';
            		console.log("sdasdasdasdasdasdasdasdasd")
            	 }else{
            		 window.location.href = 'HTML/responseDontExist.html';
            		 console.log("hasdasd")
            	 }
             	console.log("gött")
             }).fail(function(){
             	console.log("fail");
	        });
        }
 
    });  
})
