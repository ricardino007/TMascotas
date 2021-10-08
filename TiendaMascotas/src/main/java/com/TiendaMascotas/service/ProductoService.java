package com.TiendaMascotas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TiendaMascotas.interfaces.IProducto;
import com.TiendaMascotas.interfeceService.IProductoService;
import com.TiendaMascotas.model.ProductoModel;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private IProducto data;

	@Override
	public List<ProductoModel> listarProducto() {
		return (List<ProductoModel>)data.findAll();
	}

	@Override
	public Optional<ProductoModel> listarIdProducto(int codigo_Prod) 
	{
		return data.findById(codigo_Prod);
	}

	@Override
	public int saveProducto(ProductoModel prod) {
		int res = 0;
		ProductoModel producto=data.save(prod);
		if(!producto.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void deleteProducto(int codigo_Prod) {
		
		data.deleteById(codigo_Prod);
	}

}
