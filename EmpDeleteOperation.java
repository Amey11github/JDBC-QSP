package empcrud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpDeleteOperation {
	public static void main(String[] args) {
		try{
           Class.forName("org.postgresql.Driver");
           
           String url="jdbc:postgresql://localhost:5432/empcrud";
           String user="postgres";
           String pwd="root";
           
           Connection con=DriverManager.getConnection(url, user, pwd);
           
           Statement st=con.createStatement();
           
           String sql="delete from emp where salary<25000";
           
           st.execute(sql);
           
           System.out.println("Data Deleted");
           
           con.close();
           
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
