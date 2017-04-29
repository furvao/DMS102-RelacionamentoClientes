/*
 * GenericDAO.java
 *
 * Created on 2 de Dezembro de 2006, 03:50
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.com.inatel.pos.dm102.model.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class GenericDAO<T, ID extends Serializable> {
	private String driverClass;
	private String dbURL;
	private String dbName;
	private String user;
	private String passwd;

	protected Connection con = null;
	protected PreparedStatement ps;
	protected ResultSet rs;

	/** Creates a new instance of GenericDAO */
	public GenericDAO() {
		this.driverClass = "org.postgresql.Driver";
		this.dbURL = "jdbc:postgresql:";
		this.dbName = "DM102";
		this.user = "postgres";
		this.passwd = "master";
	}

	public GenericDAO(String dataBase, String dbName, String user, String passwd) {

		if (dataBase.equalsIgnoreCase("postgresql")) {
			driverClass = "org.postgresql.Driver";
			dbURL = "jdbc:postgresql:";
		} else if (dataBase.equalsIgnoreCase("mysql")) {
			driverClass = "org.gjt.mm.mysql.Driver";
			dbURL = "jdbc:mysql:";
		} else if (dataBase.equalsIgnoreCase("jdbcodbc")) {
			driverClass = "sun.jdbc.odbc.JdbcOdbcDriver";
			dbURL = "jdbc:odbc:";
		}

		this.dbName = dbName;
		this.user = user;
		this.passwd = passwd;
	}

	private void getConnection() throws Exception {
		if (con != null)
			return;

		try {
			Class.forName(driverClass); // "org.postgresql.Driver"
			String url = dbURL + dbName; // "jdbc:postgresql:" + "postgres"
			con = DriverManager.getConnection(url, user, passwd);
		} catch (ClassNotFoundException ex) {
			throw new Exception("SQL exception in getConnection", ex);
		} catch (SQLException ex) {
			throw new Exception("SQL exception in getConnection", ex);
		}
	}

	public void closeConnection() throws Exception {
		try {
			if (con != null) {
				con.close();
			}
			con = null;
		} catch (SQLException ex) {
			throw new Exception("SQL exception in closeConnection", ex);
		}
	}

	public void getPreparedStatement(String query) throws Exception {
		try {
			getConnection();
			ps = con.prepareStatement(query);
		} catch (SQLException ex) {
			throw new Exception("SQL exception in getPreparedStatement", ex);
		}
	}

	public void closePreparedStatement() throws Exception {
		try {
			ps.close();
			closeConnection();
		} catch (SQLException ex) {
			throw new Exception("SQL exception in closePreparedStatement", ex);
		}
	}
}
