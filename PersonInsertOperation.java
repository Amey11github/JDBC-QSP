package jdbccrud1110;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonInsertOperation {

	public static void main(String[] args) {
		try {
			 Class.forName("org.postgresql.Driver");
			 
			 String url="jdbc:postgresql://localhost:5432/personcrud";
			 String user="postgres";
			 String password="root";
			 
			 Connection conn=DriverManager.getConnection(url,user,password);
			 
			 Statement st=conn.createStatement();
			 
			 String sql="INSERT INTO person VALUES(105,'VIVEK',22)";
			 
			 st.execute(sql);
			 
			 conn.close();
			 
			 System.out.println("Data inserted...");
			 
			 
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
	}
}
