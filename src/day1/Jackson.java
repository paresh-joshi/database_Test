package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jackson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "Expleo12345");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from CustomerInfo where Location ='Asia';");
while(rs.next()) {

System.out.println(rs.getString(1));
	

}

	}

}
