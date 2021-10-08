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

import com.TiendaMascotas.interfeceService.IProveedorService;
import com.TiendaMascotas.model.ProveedorModel;


@Controller
@RequestMapping
public class ProveedorControlador {
	
	@Autowired
	private IProveedorService serviceProveedor;
	
	@GetMapping("/listarProveedor")
	public String listarProveedor(Model model)
	{
		List<ProveedorModel> proveedores = serviceProveedor.listarProveedor();
		model.addAttribute("proveedores",serviceProveedor.listarProveedor());
		return "index";
	}
	
	@GetMapping("/newProveedor")
	public String agregarProveedor(Model model)
	{
		model.addAttribute("proveedor", new ProveedorModel());
		return "formProveedor";
	}
	
	@PostMapping("/saveProveedor")
	public String saveProveedor(@Validated ProveedorModel p, Model model)
	{
		serviceProveedor.saveProveedor(p);
		return "redirect:/listarProveedor";
	}
	
	@GetMapping("/editarProveedor/{NIT_Prov}")
	public String editarProveedor(@PathVariable int NIT_Prov, Model model)
	{
		Optional<ProveedorModel> proveedor = serviceProveedor.listarIdProveedor(NIT_Prov);
		model.addAttribute("proveedor",proveedor);
		return "formProveedor";
	}
	
	@GetMapping("/eliminarProveedor/{NIT_Prov}")
	public String deleteProveedor(@PathVariable int NIT_Prov, Model model)
	{
		serviceProveedor.deleteProveedor(NIT_Prov);
		return "redirect:/listarProveedor";
	}

}
