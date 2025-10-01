package developercrud;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeveloperDeleteOperation {
  public static void main(String[] args) {
	 
	try {
		
		
		String url="jdbc:postgresql://localhost:5432/developer";
		String user="postgres";
		String pwd="root";
		
		Connection con=DriverManager.getConnection(url,user,pwd);
		
		Statement st=con.createStatement();
		
		String sql="delete from dev where name ='Amey'";
		
		st.execute(sql);
		
		System.out.println("Data deleted");
		
		con.close();
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}
