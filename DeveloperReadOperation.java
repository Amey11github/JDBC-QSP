package developercrud;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeveloperReadOperation {
	public static void main(String[] args) {
		 
			try {
				
				
				String url="jdbc:postgresql://localhost:5432/developer";
				String user="postgres";
				String pwd="root";
				
				Connection con=DriverManager.getConnection(url,user,pwd);
				
				Statement st=con.createStatement();
				
				String sql="select id,name,salary,designation from dev";
				
			    ResultSet rs=st.executeQuery(sql);
				
				while(rs.next())
				{
					int id=rs.getInt("id");
					String name=rs.getString("name");
					double salary=rs.getDouble("salary");
					String designation=rs.getString("designation");
					
					System.out.println("ID : "+id+" NAME : "+name+" SALARY : "+salary+" DESIGNATION : "+designation);
				}
				
				rs.close();
				con.close();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
	}

}
