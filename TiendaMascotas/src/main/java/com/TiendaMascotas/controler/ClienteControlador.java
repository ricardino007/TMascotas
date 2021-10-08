package com.TiendaMascotas.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TiendaMascotas.interfeceService.IClienteService;
import com.TiendaMascotas.model.ClienteModel;


@Controller
@RequestMapping
public class ClienteControlador {
	
	@Autowired
	private IClienteService serviceCliente;
	
	@GetMapping("/listarCliente")
	public String listarCliente(Model model)
	{
		List<ClienteModel> clientes = serviceCliente.listarCliente();
		model.addAttribute("clientes",serviceCliente.listarCliente());
		return "index";
	}
	
	@GetMapping("/newCliente")
	public String agregarCliente(Model model)
	{
		model.addAttribute("cliente", new ClienteModel());
		return "formClientes";
	}
	
	@PostMapping("/saveCliente")
	public String saveCliente(@Validated ClienteModel c, Model model)
	{
		serviceCliente.saveCliente(c);
		return "redirect:/listarCliente";
	}
	
	@GetMapping("/editarCliente/{Cedula_Cli}")
	public String editarCliente(@PathVariable int Cedula_Cli, Model model)
	{
		Optional<ClienteModel> cliente = serviceCliente.listarIdCliente(Cedula_Cli);
		model.addAttribute("cliente",cliente);
		return "formClientes";
	}
	
	@GetMapping("/eliminarCliente/{Cedula_Cli}")
	public String deleteCliente(@PathVariable int Cedula_Cli, Model model)
	{
		serviceCliente.deleteCliente(Cedula_Cli);
		return "redirect:/listarCliente";
	}

}
