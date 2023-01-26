package com.tns.jdbcprog;
import java.sql.Connection;
import java.sql.DriverManager;//import the packages
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			//establish the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root","Priya@2309");
		Statement st=conn.createstatement();//create the statement
		
		String str="select title,price,qty from books";
		System.out.println("he sql statement is"+ str+"\n");
		ResultSet rs=st.executeQuery(str);//execute the query
		
		System.out.println("the records are");
		int rowCount=0;
		while(rs.next()) {
			String title=rs.getString("title");
			double price=rs.getInt("price");
			int qty=rs.getInt("qty");
			System.out.println(title+" ,"+ price+ " ,"+qty);
			++rowCount;
		}
		
		

}
		catch(SQLException e) 
		{
	e.printStackTrace();
		}
}
}
