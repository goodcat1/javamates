package edu.javamates.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.javamates.AbstractTestableBean;

public abstract class AbstractDaoBean<T extends Serializable> extends
		AbstractTestableBean implements AbstractDaoBeanLocal<T> {

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
	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

		return entityManager.find(entityClass, id);
	}

}
