package empcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpUpdateOperation {
   public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		
		String url="jdbc:postgresql://localhost:5432/empcrud";
		String user="postgres";
		String pwd="root";
		
		Connection con=DriverManager.getConnection(url, user, pwd);
		
		Statement st=con.createStatement();
		
		String sql="update emp set salary=60000 where name='VISHAL'";
		
		st.execute(sql);
		
		System.out.println("Data Updated ");
		
		con.close();
	}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
}
}
