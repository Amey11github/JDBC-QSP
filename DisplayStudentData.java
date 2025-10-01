package studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStudentData {
    public static void main(String[] args) {
		try {
			String url="jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
			Connection con=DriverManager.getConnection(url);
			
			String sql="select * from student";
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				String school=rs.getString("schoolname");
				String address=rs.getString("address");
				
				System.out.println("ID : "+id+" | NAME : "+name+" | AGE : "+age+" | SCHOOL : "+school+" | ADDRESS : "+address);
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
