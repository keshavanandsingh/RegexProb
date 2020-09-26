package regexproblemUC1;

import java.util.regex.*; 
import java.util.*;

public class RegexproblemUC3
{
	public static boolean isValidEmail(String email) 
	{ 
		String regex = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
		Pattern p1 = Pattern.compile(regex); 
		Matcher m1 = p1.matcher(email); 
		return m1.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the email id: ");
		String email = s1.nextLine();
		System.out.println( 
				email + " can be correct email??: "
			+ isValidEmail(email)); 
	} 
}
