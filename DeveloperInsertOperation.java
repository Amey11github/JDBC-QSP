package developercrud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeveloperInsertOperation {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/developer";
			String user="postgres";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url, user, pwd);
			
			Statement st=con.createStatement();
			
			String query="Insert into dev values(1002,'Vishal',23,90000,'web developer'),"+"(1003,'Vivek',23,70000,'sql developer')";
			
			st.execute(query);
			System.out.println("Data Inserted");
			
			con.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
