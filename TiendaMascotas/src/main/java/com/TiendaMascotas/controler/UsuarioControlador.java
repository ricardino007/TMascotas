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

import com.TiendaMascotas.interfeceService.IusuarioService;
import com.TiendaMascotas.model.UsuarioModel;


@Controller
@RequestMapping
public class UsuarioControlador {
	
	@Autowired
	private IusuarioService serviceUsuario;
	
	@GetMapping("/listarUsuario")
	public String listarUsuario(Model model)
	{
		List<UsuarioModel> usuarios=serviceUsuario.listarUsuario();
		model.addAttribute("usuarios",serviceUsuario.listarUsuario());
		return "index";
	}
	
	@GetMapping("/newUsuario")
	public String agregarUsuario(Model model)
	{
		model.addAttribute("usuario", new UsuarioModel());
		return "formUsuario";
	}
	
	@PostMapping("/saveUsuario")
	public String saveUsuario(@Validated UsuarioModel u, Model model)
	{
		serviceUsuario.saveUsuario(u);
		return "redirect:/listarUsuario";
	}
	
	@GetMapping("/editarUsuario/{Cedula_Usu}")
	public String editarUsuario(@PathVariable int Cedula_Usu, Model model)
	{
		Optional<UsuarioModel> usuario = serviceUsuario.listarIdUsuario(Cedula_Usu);
		model.addAttribute("usuario",usuario);
		return "formUsuario";
	}
	
	@GetMapping("/eliminarUsuario/{Cedula_Usu}")
	public String deleteUsuario(@PathVariable int Cedula_Usu, Model model)
	{
		serviceUsuario.deleteUsuario(Cedula_Usu);
		return "redirect:/listarUsuario";
	}

}
