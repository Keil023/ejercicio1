package com.ke.servicio;

import com.ke.entity.Cliente;

public class Servicio {

	//variable global
		private List<Cliente> listaPersonas = new ArrayList<>();
		
		
		public Cliente registrarCliente(Integer idCliente, 
				String nombre, Integer edad, Double altura) {
			
			Cliente cliente = new Cliente();
			cliente.setIdPersona(idCliente);
			cliente.setNombre(nombre);
			cliente.setEdad(edad);
			cliente.setAltura(altura);
			//cada vez que se registre a una persona, se agrega a la variable global
			listaClientes.add(cliente);
			
			return cliente;
		}
		
		public List<Cliente> listarClientes(){
			return listaClientes;
		}
		
	}
	
}
