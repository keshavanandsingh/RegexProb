package regexproblemUC1;

import java.util.regex.*; 
import java.util.*;

public class RegexProblemUC6
{
	public static boolean isValidPassword(String pswd) 
	{ 
		String regex = "^(?=.*[A-Z])[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(pswd); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid password: ");
		String pswd = sc.nextLine();
		if(isValidPassword(pswd)){
			System.out.println("Password accepted");
		}else{
			System.out.println("Password rejected, retry again");
		}
	} 
}
