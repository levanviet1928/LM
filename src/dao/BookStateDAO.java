package dao;

import model.BookState;

import java.util.List;

public class BookStateDAO implements DAO<BookState> {

	@Override
	public void add(BookState key) {

	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement BookStateDAO.edit
		throw new UnsupportedOperationException();
	}

	@Override
	public List<BookState> findByName(String name) {
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement BookStateDAO.remove
		throw new UnsupportedOperationException();
	}

	@Override
	public BookState findByID(String id) {
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public BookState getByID(String id) {
		// TODO - implement BookStateDAO.getByID
		throw new UnsupportedOperationException();
	}

	public List<BookState> getAll() {
		// TODO - implement BookStateDAO.getAll
		throw new UnsupportedOperationException();
	}

}