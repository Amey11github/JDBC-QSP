package closestatement;

class Employee implements AutoCloseable
{
	@Override
	public void close()
	{
		System.out.println("Resources about to close.....");
	}
}


public class EmployeeTryWithResourseEx {
     public static void main(String[] args) {
    	 
    	 try(Employee e=new Employee();)
    	 {
    		 
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
		
	}
}
