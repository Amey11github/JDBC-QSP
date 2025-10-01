package studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudentData {
	public static void main(String[] args) {
		try {
			String url="jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
			Connection con=DriverManager.getConnection(url);
			
			String sql="delete from student where name=?";
			System.out.println("Enter name to delete data : ");
			String name=new java.util.Scanner(System.in).nextLine();
			
			PreparedStatement st=con.prepareStatement(sql);
			
			st.setString(1, name);
			
			st.execute();
			
			System.out.println("Data deleted");
			
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
