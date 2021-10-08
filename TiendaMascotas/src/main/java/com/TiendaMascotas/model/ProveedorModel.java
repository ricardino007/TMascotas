package com.TiendaMascotas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Proveedores")
public class ProveedorModel {
	
	@Id
	private int NIT_Prov;
	private String Nombre_Prov;
	private String Ciudad_Prov;
	private String Direccion_Prov;
	private String Telefono_Prov;
	
	public ProveedorModel()
	{
		
	}

	public ProveedorModel(int nit_Prov, String nombre_Prov, String ciudad_Prov, String direccion_Prov, String telefono_Prov) {
		super();
		NIT_Prov = nit_Prov;
		Nombre_Prov = nombre_Prov;
		Ciudad_Prov = ciudad_Prov;
		Direccion_Prov = direccion_Prov;
		Telefono_Prov = telefono_Prov;
	}

	public int getNIT_Prov() {
		return NIT_Prov;
	}

	public void setNIT_Prov(int nit_Prov) {
		NIT_Prov = nit_Prov;
	}

	public String getNombre_Prov() {
		return Nombre_Prov;
	}

	public void setNombre_Prov(String nombre_Prov) {
		Nombre_Prov = nombre_Prov;
	}

	public String getCiudad_Prov() {
		return Ciudad_Prov;
	}

	public void setCiudad_Prov(String ciudad_Prov) {
		Ciudad_Prov = ciudad_Prov;
	}

	public String getDireccion_Prov() {
		return Direccion_Prov;
	}

	public void setDireccion_Prov(String direccion_Prov) {
		Direccion_Prov = direccion_Prov;
	}

	public String getTelefono_Prov() {
		return Telefono_Prov;
	}

	public void setTelefono_Prov(String telefono_Prov) {
		Telefono_Prov = telefono_Prov;
	}
	
	
	
	

}