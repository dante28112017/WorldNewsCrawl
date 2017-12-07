package com.world.crawl.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectSQLite {

	public static Connection OpenSQLite(String connectString) {
		Connection connection = null;

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection(connectString);

			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
