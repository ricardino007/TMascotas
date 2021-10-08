package com.TiendaMascotas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TiendaMascotas.model.ProductoModel;


@Repository
public interface IProducto extends CrudRepository<ProductoModel, Integer> {

}