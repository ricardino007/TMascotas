package com.TiendaMascotas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Productos")
public class ProductoModel {
	
	@Id
	private int Codigo_Prod;
	private String Nombre_Prod;
	private String NIT_Prov_Prod;
	private Double Precio_Compra;
	private Double IVA_Prod;
	private Double Precio_Vta;
	
	public ProductoModel()
	{
		
	}

	public ProductoModel(int codigo_Prod, String nombre_Prod, String nit_Prov_Prod, Double precio_Compra, Double iva_Prod, Double precio_Vta) {
		super();
		Codigo_Prod = codigo_Prod;
		Nombre_Prod = nombre_Prod;
		NIT_Prov_Prod = nit_Prov_Prod;
		Precio_Compra = precio_Compra;
		IVA_Prod = iva_Prod;
		Precio_Vta= precio_Vta;
	}

	public int getCodigo_Prod() {
		return Codigo_Prod;
	}

	public void setCodigo_Prod(int codigo_Prod) {
		Codigo_Prod = codigo_Prod;
	}

	public String getNombre_Prod() {
		return Nombre_Prod;
	}

	public void setNombre_Prod(String nombre_Prod) {
		Nombre_Prod = nombre_Prod;
	}

	public String getNIT_Prov_Prod() {
		return NIT_Prov_Prod;
	}

	public void setNIT_Prov_Prod(String nIT_Prov_Prod) {
		NIT_Prov_Prod = nIT_Prov_Prod;
	}

	public Double getPrecio_Compra() {
		return Precio_Compra;
	}

	public void setPrecio_Compra(Double precio_Compra) {
		Precio_Compra = precio_Compra;
	}

	public Double getIVA_Prod() {
		return IVA_Prod;
	}

	public void setIVA_Prod(Double iVA_Prod) {
		IVA_Prod = iVA_Prod;
	}

	public Double getPrecio_Vta() {
		return Precio_Vta;
	}

	public void setPrecio_Vta(Double precio_Vta) {
		Precio_Vta = precio_Vta;
	}
}
	