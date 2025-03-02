package com.ke.test;

	import com.ke.entity.Cliente;
	import com.ke.servicio.Servicio;
	

	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Integer idCliente = 1;
			String nombre = "Caleb Morataya";
			Integer edad = 20;
			Double altura = 1.73;
			
			Servicio servicio = new Servicio();
			servicio.registrarPersona(idCliente, nombre, edad, altura);
			
			
			//recorrer la lista
			for(Cliente C : servicio.listarClientes()){
				System.out.println(p.getIdCliente());
				System.out.println(p.getNombre());
				System.out.println(p.getEdad());
				System.out.println(p.getAltura());
			}
			
			//System.out.println(servicio.listarClientes());

		}

	}
}
