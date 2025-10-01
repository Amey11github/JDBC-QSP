package developercrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeveloperUpdateOperation {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/developer";
			String user="postgres";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url, user, pwd);
			
			Statement st=con.createStatement();
			
			String sql="update dev set salary=100000 where name='Amey'";
			
			st.execute(sql);
			
			System.out.println("Data Updated");
			
			con.close();
			}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
