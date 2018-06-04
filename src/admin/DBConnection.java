package admin;
import java.sql.*;

import javax.swing.JOptionPane;
public class DBConnection {
	public static Connection getConnection(String year) {
		try{
			String dbName="nitw"+year;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName+"?autoReconnect=true"
					+ "&useSSL=false","root","Prathyu@3062");
			return con;
		}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;

		}
	}

}
