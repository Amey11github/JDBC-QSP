package studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudentData {
	static Connection con;
	static Scanner sc=new Scanner(System.in);
	static {
		try {
			String url="jdbc:postgresql://localhost:5432/studentcrud?user=postgres&password=root";
			con=DriverManager.getConnection(url);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
    	
    	
    	int ch=0;
    	do {
              System.out.println("1.update age");
              System.out.println("2.update school name");
              System.out.println("3.update address");
              System.out.println("4.exit..");
              System.out.println("Enter your choice : ");
              ch=sc.nextInt();
              
              switch(ch)
              {
              case 1:updateAge();break;
              case 2:updateSchool();break;
              case 3:updateAddress();break;
              default:System.out.println("Enter proper choice ......");
              }
    		
    	}while(ch!=4);
	}
    
    public static void updateAge()
    {
    	try {
    		String sql="update student set age=? where name=?";
        	
        	PreparedStatement st=con.prepareStatement(sql);
        	
        	System.out.println("Enter name : ");
        	sc.nextLine();
        	String name=sc.nextLine();
        	System.out.println("Enter age : ");
        	int age=sc.nextInt();sc.nextLine();
        	
        	st.setInt(1,age);
        	st.setString(2, name);
        	
        	st.execute();
        	System.out.println("Data updated");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public static void updateSchool()
    {
    	try {
    		String sql="update student set schoolname=? where name=?";
        	
        	PreparedStatement st=con.prepareStatement(sql);
        	
        	System.out.println("Enter name : ");
        	sc.nextLine();
        	String name=sc.nextLine();
        	System.out.println("Enter school name : ");
        	String school=sc.nextLine();
        	
        	st.setString(1,school);
        	st.setString(2, name);
        	
        	st.execute();
        	System.out.println("Data updated");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    
    public static void updateAddress()
    {
    	try {
    		String sql="update student set address=? where name=?";
        	
        	PreparedStatement st=con.prepareStatement(sql);
        	
        	System.out.println("Enter name : ");
        	sc.nextLine();
        	String name=sc.nextLine();
        	System.out.println("Enter address : ");
        	String address=sc.nextLine();
        	
        	st.setString(1,address);
        	st.setString(2, name);
        	
        	st.execute();
        	System.out.println("Data updated");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
}
