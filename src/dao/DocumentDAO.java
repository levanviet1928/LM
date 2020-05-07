package dao;

import model.Document;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DocumentDAO implements DAO<Document> {
	public boolean isIDValid(String id, String tableName) {
		String sql = "SELECT ID FROM " + tableName + " WHERE ID = ?";
		Connection conn = DBConnection.getInstance().getConnection();
		try {
			PreparedStatement prepare = conn.prepareStatement(sql);
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
			if (result.next()) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean isNameValid(String name) {
		String sql = "SELECT docName FROM dbo.Document WHERE docName = ?";
		Connection conn = DBConnection.getInstance().getConnection();
		try {
			PreparedStatement prepare = conn.prepareStatement(sql);
			prepare.setString(1, name);
			ResultSet result = prepare.executeQuery();
			if (result.next()) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	/**
	 * 
	 * @param doc
	 */
	public void add(Document doc) {
		Connection connection = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM dbo.Document";
		try {
			PreparedStatement result = connection.prepareStatement(sql);
			ResultSet resultSet = result.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("docID"));
				System.out.println(resultSet.getString("docName"));
				System.out.println(resultSet.getString("author"));
				System.out.println(resultSet.getInt("publishYear"));
				System.out.println(resultSet.getInt("quantity"));
			}
		} catch (SQLException e) {
			System.out.println("không có dữ liệu");
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement DocumentDAO.remove
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement DocumentDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public List<Document> findByName(String name) {
		// TODO - implement DocumentDAO.findByName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param author
	 */
	public List<Document> findByAuthor(String author) {
		// TODO - implement DocumentDAO.findByAuthor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public Document findByID(String id) {
		// TODO - implement DocumentDAO.findByID
		throw new UnsupportedOperationException();
	}

}