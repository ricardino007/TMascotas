package com.TiendaMascotas.interfeceService;

import java.util.List;
import java.util.Optional;

import com.TiendaMascotas.model.ProductoModel;

public interface IProductoService {

	public List<ProductoModel> listarProducto();
	public Optional<ProductoModel>listarIdProducto(int id_Prod);
	public int saveProducto(ProductoModel prod);
	public void deleteProducto(int id_Prod);
}
