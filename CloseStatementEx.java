package closestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseStatementEx {
	public static void main(String[] args) {
		Connection con=null;
		try {
			String url="jdbc:postgresql://localhost:5432/personcrud?user=postgres&password=roots";
			con=DriverManager.getConnection(url);
			
			Statement st=con.createStatement();
			String sql="insert into person values(106,'SHIVAM',25)";
			st.execute(sql);
			
			System.out.println("Query executed");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
