package edu.javamates.dao;

import java.io.Serializable;

public interface AbstractDaoBeanLocal<T extends Serializable> {
	void create(T entity);

	T update(T entity);

	void delete(T entity);

	void findById(Long id);
}
