function eliminarUsuario(Cedula_Usu)
{
	swal({
			title: "Esta seguro de Eliminar el registro?",
			text: "Una vez eliminado el registro no puede ser recuperado!",
			icon: "warning",
			buttons: true,
			dangerMode: true,
		})
			.then((OK) => {
				if (OK) {
					$.ajax({
						url:"/eliminarUsuario/"+Cedula_Usu,
						success: function(res){
							console.log(res);
					}
				});
				swal("Poof! el Registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if(ok){
						location.href="/listarUsuario";
					}
				});
			} else {
				swal("Su registro NO se ha eliminado!");
			}
		});
}


function eliminarCliente(Cedula_Cli)
{
	swal({
			title: "Esta seguro de Eliminar el registro?",
			text: "Una vez eliminado el registro no puede ser recuperado!",
			icon: "warning",
			buttons: true,
			dangerMode: true,
		})
			.then((OK) => {
				if (OK) {
					$.ajax({
						url:"/eliminarCliente/"+Cedula_Cli,
						success: function(res){
							console.log(res);
					}
				});
				swal("Poof! el Registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if(ok){
						location.href="/listarCliente";
					}
				});
			} else {
				swal("Su registro NO se ha eliminado!");
			}
		});
}


function eliminarProveedor(NIT_Prov)
{
	swal({
			title: "Esta seguro de Eliminar el registro?",
			text: "Una vez eliminado el registro no puede ser recuperado!",
			icon: "warning",
			buttons: true,
			dangerMode: true,
		})
			.then((OK) => {
				if (OK) {
					$.ajax({
						url:"/eliminarProveedor/"+NIT_Prov,
						success: function(res){
							console.log(res);
					}
				});
				swal("Poof! el Registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if(ok){
						location.href="/listarProveedor";
					}
				});
			} else {
				swal("Su registro NO se ha eliminado!");
			}
		});
}


function eliminarProducto(Codigo_Prod)
{
	swal({
			title: "Esta seguro de Eliminar el registro?",
			text: "Una vez eliminado el registro no puede ser recuperado!",
			icon: "warning",
			buttons: true,
			dangerMode: true,
		})
			.then((OK) => {
				if (OK) {
					$.ajax({
						url:"/eliminarProducto/"+Codigo_Prod,
						success: function(res){
							console.log(res);
					}
				});
				swal("Poof! el Registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if(ok){
						location.href="/listarProducto";
					}
				});
			} else {
				swal("Su registro NO se ha eliminado!");
			}
		});
}