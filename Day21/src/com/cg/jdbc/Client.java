package com.cg.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {

	public static void main(String[] args) throws SQLException {
	Connection con = DBUtil.getConnection();
		if(con !=null) {
			System.out.println("JDBC:Connection is established");
			
		}
		CrudOperation.addEmployee();
		CrudOperation.retrivebyId();
	}

}