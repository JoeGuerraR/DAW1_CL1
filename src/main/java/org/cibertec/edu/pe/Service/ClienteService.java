package org.cibertec.edu.pe.Service;

import java.util.List;

import org.cibertec.edu.pe.interfaces.iCliente;
import org.cibertec.edu.pe.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private iCliente data;
	
	public List<Cliente> Listado() {
		return (List<Cliente>)data.findAll();
	}

}
