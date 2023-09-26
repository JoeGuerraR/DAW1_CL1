package org.cibertec.edu.pe.controller;

import java.util.List;


import org.cibertec.edu.pe.interfaces.IClienteServices;
import org.cibertec.edu.pe.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ClienteController {

	@Autowired
	private IClienteServices servicio;
	
	// Método para Listar
	@GetMapping("/listar")		// http://localhost:8080/listar
	public String Listar(Model m) {
		List<Cliente> lista = servicio.Listado();
		m.addAttribute("datos", lista);
		return "listar";		// listar.html
	}
	

	// Método para Agregar
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("Cliente", new Cliente());
		return "form";			// form.html
	}
	
	// Método para Guardar
		@GetMapping("/salvar")
		public String salvar(Cliente c, Model m) {
			servicio.Grabar(c);
			return "redirect:/listar";
	}
}
