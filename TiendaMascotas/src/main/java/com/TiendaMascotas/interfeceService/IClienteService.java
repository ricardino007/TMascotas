package com.TiendaMascotas.interfeceService;

import java.util.List;
import java.util.Optional;

import com.TiendaMascotas.model.ClienteModel;

public interface IClienteService {

	public List<ClienteModel> listarCliente();
	public Optional<ClienteModel>listarIdCliente(int id_Cli);
	public int saveCliente(ClienteModel c);
	public void deleteCliente(int id_Cli);
}
