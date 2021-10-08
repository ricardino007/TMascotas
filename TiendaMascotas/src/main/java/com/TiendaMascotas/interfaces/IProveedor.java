package com.TiendaMascotas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TiendaMascotas.model.ProveedorModel;


@Repository
public interface IProveedor extends CrudRepository<ProveedorModel, Integer> {

}
