package empcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpInsertOperation {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/empcrud";
			String user="postgres";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url, user, pwd);
			
			Statement st=con.createStatement();
			
			String sql="insert into emp VALUES(1005,'YASH',22,70000)";  
			
			st.execute(sql);
			System.out.println("Data Inserted");
			
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
