package jdbccrud1110;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDeleteOperation {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/personcrud";
			String user="postgres";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url,user,pwd);
			
			Statement st=con.createStatement();
			
			String sql="delete from person where id=105";
			
			st.execute(sql);
			System.out.println("Data Deleted");
			con.close();
		  }
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
