package org.emp.repository;
import java.sql.*;

public class DBConfig {
	
	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	public DBConfig() {
	 try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspp","root","sa1234");

	        if (this.conn != null) {
	            System.out.println("Database is connected......");
	        } else {
	            System.out.println("Something problem is occurred......");
	        }
	    } catch (Exception ex) {
	        System.out.println(ex.getMessage());
	    }
	}
}