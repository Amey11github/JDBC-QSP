package jdbccrud1110;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class PersonUpdateOperation {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/personcrud";
			String user="postgres";
			String pwd="root";
			
			Connection con=DriverManager.getConnection(url,user,pwd);
			
			Statement st=con.createStatement();
			
//			String sql="Update person set name='SURESH' where id=101";
			
			String sql1="update person set age=32 where name='RAMESH'";
			
			st.execute(sql1);
			
			System.out.println("Data updated");
			
			con.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			
		}
	}

}
