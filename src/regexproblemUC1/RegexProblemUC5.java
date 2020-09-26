package regexproblemUC1;

import java.util.regex.*; 
import java.util.*;

public class RegexProblemUC5 
{
	public static boolean isValidPassword(String pswd) 
	{ 
		String regex = "^[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(pswd); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String pswd = sc.nextLine();
		if(isValidPassword(pswd)){
			System.out.println("PASSWORD ACCEPTED");
		}else{
			System.out.println("Password rejected, retry again");
		}
	} 
}
