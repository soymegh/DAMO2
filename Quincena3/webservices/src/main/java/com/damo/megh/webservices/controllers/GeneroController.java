package com.damo.megh.webservices.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damo.megh.webservices.models.Genero;
import com.damo.megh.webservices.services.GeneroService;

@RestController
@RequestMapping(path = "/genero")
public class GeneroController {

	@Autowired
	GeneroService genS;

	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return genS.MostarRegistro();
	}

	@PostMapping("/agregar")
	public String agregarGen(@RequestBody Genero gen) {
		String msg="Error al guardar registro.....";
		int b = genS.GuardarRegistro(gen);
		if(b==1)msg="Guardado Exitosamente ....";
		return msg;
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarGen(@RequestBody Genero gen, @PathVariable int id, Model model) {
		String msg = "ERROR AL ACTUALIZAR EL REGISTRO....";
		int b = genS.EditarRegistro(gen);
		if(b==1)msg= "Actualizado Correctamente !";
		return msg;
	} 
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarGen(@PathVariable int id, Model model){
		String msg = "Error al eliminar el registro ...";
		int b = genS.EliminarRegistro(id);
		if(b==1)msg = "SE ELIMINO CORRECTAMENTE !";
		return msg;
	}	
}

