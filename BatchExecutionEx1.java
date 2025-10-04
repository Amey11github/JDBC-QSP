package batchexec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecutionEx1 {
  public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/personcrud";
	String user="postgres";
	String pwd="root";
	
	try(Connection con=DriverManager.getConnection(url,user,pwd))
	{
		Statement st=con.createStatement();
		String sqlInsert1="Insert into person values(801,'Hemant',23)";
		st.addBatch(sqlInsert1);
		
		String sqlInsert2="Insert into person values(802,'viraj',22)";
		st.addBatch(sqlInsert2);
		
		String sqlInsert3="Insert into person values(803,'dinesh',24)";
		st.addBatch(sqlInsert3);
		
		String sqlUpdate="update person set name='siraj' where id=802";
		st.addBatch(sqlUpdate);
		
		
		st.executeBatch();
		System.out.println("Execution of batch done  >>>>>>>>>>>>");
		
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}
