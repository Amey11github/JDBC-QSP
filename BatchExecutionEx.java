package batchexec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecutionEx {
     public static void main(String[] args) {
		
    	 String url="jdbc:postgresql://localhost:5432/personcrud";
    	 String user="postgres";
    	 String pwd="root";
    	 
    	 try(Connection con=DriverManager.getConnection(url, user, pwd);)
    	 {
    		 Statement st=con.createStatement();
    		 
    		 String sqlInsert1="Insert into person values(957,'ajay',25)";
    		 st.addBatch(sqlInsert1);
    		 
    		 String sqlInsert2="Insert into person values(908,'vijay',25)";
    		 st.addBatch(sqlInsert1);
    		 
    		 String sqlInsert3="Insert into person values(909,'sujay',25)";
    		 st.addBatch(sqlInsert1);
    		 
    		 st.executeBatch();
    		 
    		 System.out.println("Batch Execution Done >>>>>>");
    		 
    		 
    	 }
    	 catch(SQLException e)
    	 {
    		 e.printStackTrace();
    	 }
	}
}
