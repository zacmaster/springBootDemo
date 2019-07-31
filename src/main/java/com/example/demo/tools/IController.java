package com.example.demo.tools;


import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IController<T> {
	
	ResponseEntity<T> create(@RequestBody T t);
	
	ResponseEntity<Iterable<T>> findAll();
	
	ResponseEntity<T> findById(@PathVariable Long id);
	
	ResponseEntity<T> update(@PathVariable Long id, @Valid @RequestBody T t);
	
	ResponseEntity<T> delete(@PathVariable Long id);
}
