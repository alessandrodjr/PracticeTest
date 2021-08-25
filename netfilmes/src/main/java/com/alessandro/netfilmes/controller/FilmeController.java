package com.alessandro.netfilmes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandro.netfilmes.model.Filme;
import com.alessandro.netfilmes.repository.FilmeRepository;


@RestController
@RequestMapping("/filmes") 
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class FilmeController {
	
		
	@Autowired 
	private FilmeRepository filmeRepository;
	
	
	@GetMapping("/total")
	public String respTotal() {
		int getFilme = filmeRepository.findAll().size();
		return "Temos " + getFilme + " em nosso catálogo.";
	}
	
	@GetMapping
	public ResponseEntity<List<Filme>> getAll (){
		return ResponseEntity.ok(filmeRepository.findAll());
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Filme> getById(@PathVariable long id) {
		return filmeRepository.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Filme>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(filmeRepository.findAllByTituloContainingIgnoreCase(titulo));
	}

	
	
	@PostMapping
	public ResponseEntity<Filme> postPostagem (@RequestBody Filme filme){
		return ResponseEntity.status(HttpStatus.CREATED).body(filmeRepository.save(filme));
	}
	
	
	
	@PutMapping
	public ResponseEntity<Filme> putPostagem (@RequestBody Filme filme){
		return ResponseEntity.status(HttpStatus.OK).body(filmeRepository.save(filme));
	}
			
	
	
	@DeleteMapping("/{id}")
	public void deletePostagem(@PathVariable long id) {
		filmeRepository.deleteById(id);
	}	

}