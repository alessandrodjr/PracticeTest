package com.alessandro.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandro.loja.model.Venda;
import com.alessandro.loja.repository.VendaRepository;

@RestController
@RequestMapping("/vendas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VendaController {

	@Autowired
	private VendaRepository vendaRepository;

	@GetMapping
	public ResponseEntity<List<Venda>> getAll() {
		return ResponseEntity.ok(vendaRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Venda> post(@RequestBody Venda venda){
	return ResponseEntity.status(HttpStatus.CREATED).body(vendaRepository.save(venda));
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable long id) {
		vendaRepository.deleteById(id);
	}
}