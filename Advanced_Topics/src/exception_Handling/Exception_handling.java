package exception_Handling;

public class Exception_handling {

	public static void main(String[] args) {
		//===============================================
		//Airthematic exceptions
		try {
		int x=50/0;
		}catch (Exception x) {
			System.out.println(x);
		}
		int A=10;
		int b=20;
		System.out.println(A+b);
		
		//===============================================
		//Array list Exception
		int[] a=new int[3];
		try {
			a[0]=10;
			a[1]=20;
			a[2]=30;
			a[3]=40;
			a[4]=50;
		}
		catch (Exception e)
		{System.out.println(e);}
		System.out.println(a.length);
		
		//===============================================
		
		
		
		
		
		
		
	
		
	}
}
