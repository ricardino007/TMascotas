package com.TiendaMascotas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Usuarios")
public class UsuarioModel {
	
	@Id
	private int Cedula;
	private String Nombre;
	private String Correo;
	private String Usuario;
	private String Clave;
	
	public UsuarioModel()
	{
		
	}

	public UsuarioModel(int cedula_Usu, String nombre_Usu, String correo_Usu, String usuario_Usu, String clave_Usu) {
		super();
		Cedula = cedula_Usu;
		Nombre = nombre_Usu;
		Correo = correo_Usu;
		Usuario = usuario_Usu;
		Clave = clave_Usu;
	}

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula_Usu) {
		Cedula = cedula_Usu;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre_Usu) {
		Nombre = nombre_Usu;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo_Usu) {
		Correo = correo_Usu;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario_Usu) {
		Usuario = usuario_Usu;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave_Usu) {
		Clave = clave_Usu;
	}
	
	
	
	

}
