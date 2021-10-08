package com.TiendaMascotas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TiendaMascotas.model.ClienteModel;


@Repository
public interface ICliente extends CrudRepository<ClienteModel, Integer> {

}
