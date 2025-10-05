package resultsetdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetEx2 {
	
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/personcrud";
		String user="postgres";
		String pwd="root";
		try(Connection con=DriverManager.getConnection(url,user,pwd);)
		{
			Statement st=con.createStatement();
			
			String sql="select * from person where age > 25 and name='SURYAKUMAR'";
			
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				
				System.out.println(" ID : "+id+" | NAME : "+name+" | AGE : "+age);
				
			}
			System.out.println("SQL Statement executed");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
