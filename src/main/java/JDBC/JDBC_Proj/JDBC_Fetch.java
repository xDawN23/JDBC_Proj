package JDBC.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Fetch {
	
	public static void main (String [] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql:///emschool","root","andrelopez");
		
		Statement st = con.createStatement();
		
		String query = "SELECT * FROM persona";
		
		ResultSet rs = st.executeQuery(query); //We show the query with executQuery, for other we use execute only
		
		while(rs.next()) { System.out.println(rs.getString(1) + " " + rs.getString(2)); }
		
		con.close();
		
		
		
		
		
		
		
		
		
	}

}
