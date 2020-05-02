package dao;

import model.Book;
import model.Document;

import java.util.List;

public class BookDAO extends DocumentDAO {

	/**
	 * 
	 * @param book
	 */
	public void add(Book book) {
		// TODO - implement BookDAO.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement BookDAO.remove
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement BookDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	@Override
	public List<Document> findByName(String name) {
		return super.findByName(name);
	}

	@Override
	public List<Document> findByAuthor(String author) {
		return super.findByAuthor(author);
	}

	/**
	 * 
	 * @param year
	 */
	public List<Book> findByYear(int year) {
		// TODO - implement BookDAO.findByYear
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 */
	public List<Book> findByType(String type) {
		// TODO - implement BookDAO.findByType
		throw new UnsupportedOperationException();
	}

}