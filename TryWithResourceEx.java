package closestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TryWithResourceEx {
     public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/personcrud";
		String user="postgres";
		String pwd="root";
		
		try( Connection con=DriverManager.getConnection(url, user, pwd);
				Scanner sc=new Scanner(System.in);)
		{
			String sql="INSERT INTO person VALUES(?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			
			System.out.println("Enter id : ");
			int id=sc.nextInt();sc.nextLine();
			System.out.println("Enter name : ");
			String name=sc.nextLine();
			System.out.println("Enter age : ");
			int age=sc.nextInt();
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3, age);
			
			st.execute();
			System.out.println("Data inserted....");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
