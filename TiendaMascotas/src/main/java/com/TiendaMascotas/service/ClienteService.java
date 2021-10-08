package com.TiendaMascotas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TiendaMascotas.interfaces.ICliente;
import com.TiendaMascotas.interfeceService.IClienteService;
import com.TiendaMascotas.model.ClienteModel;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private ICliente data;

	@Override
	public List<ClienteModel> listarCliente() {
		return (List<ClienteModel>)data.findAll();
	}

	@Override
	public Optional<ClienteModel> listarIdCliente(int cedula_Cli) 
	{
		return data.findById(cedula_Cli);
	}

	@Override
	public int saveCliente(ClienteModel c) {
		int res = 0;
		ClienteModel cliente=data.save(c);
		if(!cliente.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void deleteCliente(int cedula_Cli) {
		
		data.deleteById(cedula_Cli);
	}

}
