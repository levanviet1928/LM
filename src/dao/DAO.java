package dao;

import java.util.List;

public interface DAO<T> {

	/**
	 * 
	 * @param key
	 */
	void add(T key);

	/**
	 * 
	 * @param id
	 */
	void edit(String id);

	/**
	 * 
	 * @param name
	 */
	List<T> findByName(String name);

	/**
	 * 
	 * @param id
	 */
	void remove(String id);

	/**
	 * 
	 * @param id
	 */
	T findByID(String id);

}