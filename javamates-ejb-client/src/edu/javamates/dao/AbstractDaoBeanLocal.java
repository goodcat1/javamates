package edu.javamates.dao;

import java.io.Serializable;

public interface AbstractDaoBeanLocal<T extends Serializable> extends
		TestableBeanLocal {
	void create(T entity);

	T update(T entity);

	void delete(T entity);

	T findById(Long id);
}
