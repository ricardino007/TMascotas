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

import com.TiendaMascotas.interfeceService.IProductoService;
import com.TiendaMascotas.model.ProductoModel;


@Controller
@RequestMapping
public class ProductoControlador {
	
	@Autowired
	private IProductoService serviceProducto;
	
	@GetMapping("/listarProducto")
	public String listarProducto(Model model)
	{
		List<ProductoModel> productos = serviceProducto.listarProducto();
		model.addAttribute("productos",serviceProducto.listarProducto());
		return "index";
	}
	
	@GetMapping("/newProducto")
	public String agregarProducto(Model model)
	{
		model.addAttribute("producto", new ProductoModel());
		return "formProducto";
	}
	
	@PostMapping("/saveProducto")
	public String saveProducto(@Validated ProductoModel prod, Model model)
	{
		serviceProducto.saveProducto(prod);
		return "redirect:/listarProducto";
	}
	
	@GetMapping("/editarProducto/{Codigo_Prod}")
	public String editarProducto(@PathVariable int Codigo_Prod, Model model)
	{
		Optional<ProductoModel> producto = serviceProducto.listarIdProducto(Codigo_Prod);
		model.addAttribute("producto",producto);
		return "formProducto";
	}
	
	@GetMapping("/eliminarProducto/{Codigo_Prod}")
	public String deleteProducto(@PathVariable int Codigo_Prod, Model model)
	{
		serviceProducto.deleteProducto(Codigo_Prod);
		return "redirect:/listarProducto";
	}

}