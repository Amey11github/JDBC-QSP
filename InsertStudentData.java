package studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudentData {
	public static void main(String[] args) {
		try {
			String url="jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
			Connection con=DriverManager.getConnection(url);
			
			Scanner sc=new Scanner(System.in);
			
			String sql="insert into student values(?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);

			
			System.out.println("How much data you want to insert : ");
			int cnt=sc.nextInt();
			
			for(int i=1;i<=cnt;i++)
			{
				System.out.println("Enter id  : ");
				int id=sc.nextInt();sc.nextLine();
				System.out.println("Enter name : ");
				String name=sc.nextLine();
				System.out.println("Enter age : ");
				int age=sc.nextInt();sc.nextLine();
				System.out.println("Enter school name : ");
				String schoolname=sc.nextLine();
				System.out.println("Enter address : ");
				String address=sc.nextLine();
				
				st.setInt(1,id);
				st.setString(2, name);
				st.setInt(3, age);
				st.setString(4, schoolname);
				st.setString(5, address);
				
				st.execute();
				
				System.out.println(i+" Data Inserted");
				
			}
			
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
