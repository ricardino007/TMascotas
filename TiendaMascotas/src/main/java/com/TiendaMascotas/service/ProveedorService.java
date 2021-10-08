package com.TiendaMascotas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TiendaMascotas.interfaces.IProveedor;
import com.TiendaMascotas.interfeceService.IProveedorService;
import com.TiendaMascotas.model.ProveedorModel;

@Service
public class ProveedorService implements IProveedorService{
	
	@Autowired
	private IProveedor data;

	@Override
	public List<ProveedorModel> listarProveedor() {
		return (List<ProveedorModel>)data.findAll();
	}

	@Override
	public Optional<ProveedorModel> listarIdProveedor(int nit_Prov) 
	{
		return data.findById(nit_Prov);
	}

	@Override
	public int saveProveedor(ProveedorModel p) {
		int res = 0;
		ProveedorModel proveedor=data.save(p);
		if(!proveedor.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void deleteProveedor(int nit_Prov) {
		
		data.deleteById(nit_Prov);
	}

}