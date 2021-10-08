package com.TiendaMascotas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TiendaMascotas.model.UsuarioModel;

@Repository
public interface IUsuario extends CrudRepository<UsuarioModel, Integer> {

}
