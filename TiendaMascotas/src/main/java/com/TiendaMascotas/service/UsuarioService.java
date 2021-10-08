package com.TiendaMascotas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TiendaMascotas.interfaces.IUsuario;
import com.TiendaMascotas.interfeceService.IusuarioService;
import com.TiendaMascotas.model.UsuarioModel;

@Service
public class UsuarioService implements IusuarioService{
	
	@Autowired
	private IUsuario data;

	@Override
	public List<UsuarioModel> listarUsuario() {
		return (List<UsuarioModel>)data.findAll();
	}

	@Override
	public Optional<UsuarioModel> listarIdUsuario(int cedula) 
	{
		return data.findById(cedula);
	}

	@Override
	public int saveUsuario(UsuarioModel u) {
		int res = 0;
		UsuarioModel usuario=data.save(u);
		if(!usuario.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void deleteUsuario(int cedula) {
		
		data.deleteById(cedula);
	}

}
