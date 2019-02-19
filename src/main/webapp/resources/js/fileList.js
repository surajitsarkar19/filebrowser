function openFile(path){
	alert("ggggggggg")
}

$(function(){
	$(".grid-item").dblclick(function(e){
		var path = $(this).find("#filePath").val()
		console.log(path)
		redirect(path)
	})
	
	$( ".grid-item" ).contextmenu(function(e) {
		e.preventDefault();
	  	alert( "Handler for .contextmenu() called." );
	});
});