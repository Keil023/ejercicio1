package com.ke.entity;

//contructor
	public class Cliente {

	//Propiedades
		private Integer idCliente;
		private String nombre; 
		private String apellidos;
		private Integer edad;
		private double altura;
		private double peso;
		private String genero;
		private String tez;
		private String estadoCivil;
		private String nit;
		
		//encapsulamiento Getter/Setter
		
		public Integer getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(Integer idCliente) {
			this.idCliente = idCliente;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public Integer getEdad() {
			return edad;
		}
		public void setEdad(Integer edad) {
			this.edad = edad;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getTez() {
			return tez;
		}
		public void setTez(String tez) {
			this.tez = tez;
		}
		public String getEstadoCivil() {
			return estadoCivil;
		}
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		public String getNit() {
			return nit;
		}
		public void setNit(String nit) {
			this.nit = nit;
		}
	
			
		
}
