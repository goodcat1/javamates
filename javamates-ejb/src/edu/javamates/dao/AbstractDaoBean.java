package edu.javamates.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDaoBean<T extends Serializable> implements
		AbstractDaoBeanLocal<T> {

	@PersistenceContext(unitName = "javamates-model")
	protected EntityManager entityManager;

	@Override
	public void create(T entity) {
		entityManager.persist(entity);

		entityManager.flush();
	}

	@Override
	public T update(T entity) {
		T updatedEntity = entityManager.merge(entity);

		entityManager.flush();

		return updatedEntity;
	}

	@Override
	public void delete(T entity) {
		entityManager.remove(entity);

		entityManager.flush();
	}

	@Override
	public void findById(Long id) {
		Class<T> entityClass = null;

		entityManager.find(entityClass, id);
	}

}
