package JDBC.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {
	
	public static void main (String [] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql:///emschool","root","andrelopez");
		
		Statement st = con.createStatement();
		
		String query = "INSERT INTO persona (codigo, nombre, apellido, telefono, correo, genero, contrasena, tipo_sangre, cargo, estatus)"
				+ "VALUES ('1025', 'Luis Jaime', 'Fernández Domínguez', '3781234567', 'correojaime@correo.com', 'M', 'jaime', 'O+', 'alumno', 'activo')";
		
		st.execute(query);
		
		System.out.println("The record was inserted successfully");
		
		
		
	}

}
