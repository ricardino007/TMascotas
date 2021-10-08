package com.TiendaMascotas.interfeceService;

import java.util.List;
import java.util.Optional;

import com.TiendaMascotas.model.UsuarioModel;

public interface IusuarioService {

	public List<UsuarioModel> listarUsuario();
	public Optional<UsuarioModel>listarIdUsuario(int id);
	public int saveUsuario(UsuarioModel u);
	public void deleteUsuario(int id);
}
