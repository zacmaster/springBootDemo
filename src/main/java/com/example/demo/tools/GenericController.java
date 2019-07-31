package com.example.demo.tools;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



public abstract class GenericController<T> implements IController<T>{
	@Autowired
	private GenericService<T> service;
	
	@PostMapping
	public ResponseEntity<T> create(@RequestBody T t){
		return ResponseEntity.ok(service.save(t));
	}
	
	@GetMapping
	public ResponseEntity<Iterable<T>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<T> findById(@PathVariable Long id){
		Optional<T> stock =  service.findById(id);
		if(!stock.isPresent()) {
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(stock.get());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<T> update(@PathVariable Long id, @Valid @RequestBody T bote){
		if(!service.findById(id).isPresent()) {
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(service.save(bote));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<T> delete(@PathVariable Long id){
		if(!service.findById(id).isPresent()) {
			ResponseEntity.badRequest().build();
		}
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
