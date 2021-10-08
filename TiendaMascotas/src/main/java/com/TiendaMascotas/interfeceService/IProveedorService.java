package com.TiendaMascotas.interfeceService;

import java.util.List;
import java.util.Optional;

import com.TiendaMascotas.model.ProveedorModel;

public interface IProveedorService {

	public List<ProveedorModel> listarProveedor();
	public Optional<ProveedorModel>listarIdProveedor(int id_Prov);
	public int saveProveedor(ProveedorModel p);
	public void deleteProveedor(int id_Prov);
}
