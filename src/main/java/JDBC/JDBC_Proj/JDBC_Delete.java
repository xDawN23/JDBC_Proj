package JDBC.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {
	
	public static void main (String [] args) throws Exception{
		
		Connection con = DriverManager.getConnection("jdbc:mysql:///emschool","root","andrelopez");
		
		Statement st = con.createStatement();
		
		String query = "DELETE FROM persona WHERE nombre LIKE 'El baboso'";
		
		st.execute(query);
		
		con.close();
		
		System.out.println("The record was deleted successfully");
		
	}

}
