package regexproblemUC1;

import java.util.regex.*; 
import java.util.*;

public class RegexProblemUC8
{
	public static boolean isValidPassword(String pswd) 
	{ 
		String s = "(@#$%^&-+=)\\1+";
		//String regex = "^(?=.{8}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\]*[.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\][^.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\]*$).{8}$";
		String regex1= "^(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex1); 
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
