package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.Film;

public interface FilmDao {

	public void save(Connection conn, Film film) throws SQLException;

	public void update(Connection conn, Long id, Film film) throws SQLException;

	public void insert(Connection conn, Film film) throws SQLException;

	public void delete(Connection conn, int film_id) throws SQLException;

	public ResultSet get(Connection conn, Film film) throws SQLException;

	public ResultSet get(Connection conn) throws SQLException;
}
