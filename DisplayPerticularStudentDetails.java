package studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayPerticularStudentDetails {
    public static void main(String[] args) 
    {
    	try {
    		String url="jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
    		Connection con=DriverManager.getConnection(url);
    		
    		String sql="select * from student where name=?";
    		PreparedStatement st=con.prepareStatement(sql);
    		System.out.println("Enter name : ");
    		String name=new java.util.Scanner(System.in).nextLine();
    		
    		st.setString(1, name);
    		ResultSet rs=st.executeQuery();
    		
    		while(rs.next())
    		{
    			int id=rs.getInt("id");
    			String name1=rs.getString("name");
    			int age=rs.getInt("age");
    			String school=rs.getString("schoolname");
    			String address=rs.getString("address");
    			
    			System.out.println("ID : "+id+" | NAME : "+name1+" | AGE : "+age+" | SCHOOL : "+school+" | ADDRESS : "+address);
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

