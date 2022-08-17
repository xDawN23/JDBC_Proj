package JDBC.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Update {
	
	public static void main (String [] args) throws SQLException {
		

		Connection con = DriverManager.getConnection("jdbc:mysql:///emschool","root","andrelopez");
		
		Statement st = con.createStatement();
		
		String query = "UPDATE persona SET nombre = 'El baboso' WHERE nombre LIKE 'Luis Jaime'";
		
		st.execute(query);
		
		con.close();
		
		System.out.println("The record was updated successfully");
		
		
	}

}
