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

import com.alessandro.loja.model.ItemVenda;
import com.alessandro.loja.repository.ItemVendaRepository;

@RestController
@RequestMapping("/itensVenda")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemVendaController {

	@Autowired
	private ItemVendaRepository itemVendaRepository;

	@GetMapping
	public ResponseEntity<List<ItemVenda>> getAll() {
		return ResponseEntity.ok(itemVendaRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<ItemVenda> post(@RequestBody ItemVenda itemVenda){
	return ResponseEntity.status(HttpStatus.CREATED).body(itemVendaRepository.save(itemVenda));
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable long id) {
		itemVendaRepository.deleteById(id);
	}
}