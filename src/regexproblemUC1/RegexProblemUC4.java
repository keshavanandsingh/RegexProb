package regexproblemUC1;


import java.util.regex.*; 
import java.util.*;

public class RegexProblemUC4
{
	public static boolean isValidMobileFormat(String number) 
	{ 
		String regex = "^[1-9]{9}[0-9]{1}\\s{1}[1-9]{1}[0-9]{9}$";
		Pattern p1 = Pattern.compile(regex); 
		Matcher m1 = p1.matcher(number); 
		return m1.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the mobile number: ");
		String number = s1.nextLine();
		System.out.println( 
				number + " IS CORRECT MOBILE NUMBER ??: "
			+ isValidMobileFormat(number)); 
	} 
}
