package exception_Handling;

public class Naveen_Automation {

	public static void main(String[] args) throws ArithmeticException{
		Naveen_Automation obj=new Naveen_Automation();
		obj.add();
		obj.sum();
		try {
			int a=10/0;
		}//catch (Exception e) 
		finally {			
		}{
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}	
		System.out.println("Reddy");
		}
		public void sum() {
		System.out.println(25+25);
		try {
			throw new Exception("Rkexception");
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		add();	
		}
		public void add() {
			int b=10;
			int c=b+15;
			System.out.println(c);
		}

}