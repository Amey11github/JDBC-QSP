package preparedstatementex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {
   public static void main(String[] args) {
	try {
		String url="jdbc:postgresql://localhost:5432/developer?user=postgres&password=root";
		Connection con=DriverManager.getConnection(url);
		
		String sql="insert into dev values(?,?,?,?,?)";
		
		PreparedStatement st=con.prepareStatement(sql);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many data you want to insert : ");
		int count=sc.nextInt();
		
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter data for "+i);
			System.out.println("Enter id : ");
			int id=sc.nextInt();sc.nextLine();
			System.out.println("Enter name : ");
			String name=sc.nextLine();
			System.out.println("Enter age : ");
			int age=sc.nextInt();
			System.out.println("Enter salary : ");
			double salary=sc.nextDouble();sc.nextLine();
			System.out.println("Enter designation : ");
			String designation=sc.nextLine();
			
			st.setInt(1,id);
			st.setString(2, name);
			st.setInt(3, age);
			st.setDouble(4, salary);
			st.setString(5, designation);
			
			st.execute();
			
			System.out.println(i+" data inserted");
		}
		
		con.close();
		
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	
}
}
