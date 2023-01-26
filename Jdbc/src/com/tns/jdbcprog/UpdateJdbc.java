package com.tns.jdbcprog;
import java.sql.Connection;
import java.sql.DriverManager;//import the packages
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//step 1:Allocate a database connection object
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root","Priya@2309");
	//step 2:Allocate a Statement object in the Connection
	Statement stmt=conn.createstatement();//create the statement
}
	}
{
	//Step 3:execute a SQL UPDATE via executeUpdate()
	String strUpdate = "update books set price=price 1.07, qty, qty+1 where id=2";
	System.out.println("The SQL statements is: "+ strUpdate + "\n");
	int countUpdated = stmt.executeUpdate(strUpdate);
	System.out.println(countUpdated+"records affected.\n");
	ResultSet rset=stmt.executeQuery(strSelect);
	while(rset.next()) {
		System.out.println(rset.getInt("id")+", "+ rset.getString("title") + ", "+ rset.getDouble("price") + ", " + rset.getInt("qty"));
	}
}catch(SQLException ex) {
	ex.printStackTrace();
	
}
	}//Close conn and stmt
