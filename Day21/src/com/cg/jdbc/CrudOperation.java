package com.cg.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation {
	//create
	public static void addEmployee() throws SQLException {
	Connection con = DBUtil.getConnection();
	Statement stmt = con.createStatement();
	String sqlinsert = "INSERT into Employee(name,salary,bonus)" + "values('Pushpa D C',50000,500)";
	int status = stmt.executeUpdate(sqlinsert);
	if(status==1) {
		System.out.println("Entry is added");
	}

}
	
	//update
		public static void updateEmployee() throws SQLException {
			Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			String sqlupdate = "UPDATE Employee SET bonus=1000 where id=1";
			int status = stmt.executeUpdate(sqlupdate);
			if(status==1) {
				System.out.println("Update is sucessful");
			}
			
		}
		
		//delete
				public static void deleteEmployee() throws SQLException {
					Connection con = DBUtil.getConnection();
					Statement stmt = con.createStatement();
					String sqldelete = "DELETE from Employee  where id=1";
					int status = stmt.executeUpdate(sqldelete);
					if(status==1) {
						System.out.println("Delete is sucessful");
					}
					
				}
				
				
		//RetrivebyId
		
				public static void retrivebyId() throws SQLException {
					Connection con = DBUtil.getConnection();
					Statement stmt = con.createStatement();
					String sqlretrive = "SELECT * from Employee  where id=2";
					ResultSet rs = stmt.executeQuery(sqlretrive);
					if(rs.next()) {
						int id=rs.getInt("id");
						String name=rs.getString("name");
						int salary = rs.getInt("salary");
						int bonus = rs.getInt("bonus");
						System.out.println(id + " "+ name + " "+ salary + " "+ bonus);
						
					}
					
					else {
						System.out.println("No record found");
						
					}
					
				}
		
	
}

