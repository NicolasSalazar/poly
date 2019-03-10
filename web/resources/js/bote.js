function sweet(){
	var usuario =document.getElementById ("onzas").value;
	
	if (usuario !=undefined || usuario !="") {

		swal("Enhora buena","Se ha enviado exitosamente su solicitud","success");

	}else {
		swal("Ops!","no se pudo","error");
	}