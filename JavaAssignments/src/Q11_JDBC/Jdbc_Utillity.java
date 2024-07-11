package Q11_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_Utillity {
	
		static String jdbcUrl="jdbc:mysql:///127.0.0.1:3306//spring_jpa";
		static String user="root";
		static String password="root";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver Loaded Manually");
		
	}
	
	public static Connection getJdbcConnection() throws Exception {
			return DriverManager.getConnection(jdbcUrl,user,password);
	}

}
