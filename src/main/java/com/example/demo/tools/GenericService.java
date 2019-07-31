package com.example.demo.tools;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericService<T> implements IGenericService<T> {
	@Autowired
	private IRepository<T> repository;
	
	
	
	@Override
	public Iterable<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<T> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public T save(T t) {
		return repository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
