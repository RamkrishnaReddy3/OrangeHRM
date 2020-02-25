package regulaexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	// The Regular expressions object used to look for and match all occurences of a search string pattern inside a target string.
	public static boolean regex(String pattern,String content) {
		// create a pattern object
		Pattern p=Pattern.compile(pattern);
		// create matcher object
		Matcher m=p.matcher(content);
		if(m.matches())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		//Alekya mail verification
		System.out.println(regex("[a-zA-Z0-9._]+@[a-zA-Z0-9]+[\\.][a-z]{2,3}", "rkreddy.p@outlook.com"));
		
		/*//verify matches two
		boolean res=regex("rkreddy", "rkreddy");
		System.out.println(res);
		
		//Verify Begening charecter must be Q
		//boolean res1=regex("^[Q/q]", "q");
		boolean res1=regex("^[Q/q][a-z,A-Z,0-9]{5,10}[T/t]$", "qaplanet");
		System.out.println(res1);
		
		//Verify last charecter must be t
		boolean res2=regex("[a-z]{2,10}[t/T]$", "plat");
		System.out.println(res2);
		
		//Verify field accept 5to25 alphabets
		boolean res3=regex("[a-z,A-Z]{5,25}", "abZde");
		System.out.println(res3);
		
		//Edit fields accepts 5 to 25 alphabets and first letter Q and lastletter must be t
		boolean res4=regex("^[q/Q][a-z,A-Z]{5,10}[T/t]$", "qaplanet");
		System.out.println(res4);
		
		//mobile number must be 10 digits
		boolean res5=regex("[0-9]{10}", "8309279376");
		System.out.println(res5);
		
		//mobile number must 10 digits 1st number Non Zero
		boolean res6=regex("^[8][0-9]{9}", "8309279376");
		System.out.println(res6);
		
		//mobile number must 10 digits 1st number 7/8/9
		boolean res7=regex("^[7/8/9][0-9]{9}", "8309279376");
		System.out.println(res7);*/
		
		//email must be email format
		//boolean res8=regex("^[a-zA-Z][a-zA-Z0-9\\.\\_]*@[a-zA-Z0-9]+[\\.][a-zA-Z]$","sr@qaplanet.in");
		
//		  boolean res8=regex("[a-z0-9.$]+@[a-z0-9]+[\\.][a-z]{2,3}","sr@qaplanet.in");
//		  System.out.println(res8);
		  
		//username contain one upper case alphabet and one chrecter and one digit
		  boolean res9=regex("[a-zA-Z0-9!@#$%^&*()_+]{5,25}","RkRe&&y3");
		  System.out.println(res9);
		
		//=============================================================================================
		//from tutorials point 
		//identify the nth position number matches with pattern
		//System.out.println(regex("..R","RKR"));
		//System.out.println(regex(".R","KR"));
		//System.out.println(regex("[abc]", "b"));
		//System.out.println(regex("[^abc]", "e"));
		//System.out.println(regex("[a-zA-Z]", "r"));
		//System.out.println(regex("[RK][A-Z]{6}", "RKREDDY"));
		//System.out.println(regex("[rkr]?", "r"));
		//System.out.println(regex("[rkr]+", "rkrkrkrk"));
		//System.out.println(regex("[rkr]*", "rrkkkrrrr"));
		//System.out.println(regex("\\d", "5"));
		//System.out.println(regex("\\D", "$"));
		//System.out.println(regex("^[R][A-Z]{5}[Y]$", "RKREDDY"));
		//System.out.println(regex("^hello$", "hello"));
		  
		  
	}

}



