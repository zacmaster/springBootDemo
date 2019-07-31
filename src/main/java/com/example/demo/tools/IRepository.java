package com.example.demo.tools;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface IRepository<T> extends CrudRepository<T, Long>{

}
