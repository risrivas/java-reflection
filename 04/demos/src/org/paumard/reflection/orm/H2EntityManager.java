package org.paumard.reflection.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2EntityManager<T> extends AbstractEntityManager<T> {
	
	public Connection buildConnection() throws SQLException {
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:h2:D:\\pluralsight\\10_java-fundamentals-reflection-api-method-handles\\workspace-bis\\04_Creating-ORM\\db-files\\db-pluralsight", 
						"sa", "");
		return connection;
	}

}
