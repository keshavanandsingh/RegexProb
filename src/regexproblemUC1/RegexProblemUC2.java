package regexproblemUC1;

    import java.util.regex.*; 
    import java.util.*;
    class RegexProblemUC2
    { 

	public static boolean isValidLastName(String lname) 
	{ 

		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p1 = Pattern.compile(regex); 
		Matcher m1 = p1.matcher(lname); 
		return m1.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the last name: ");
		String lname = s1.nextLine();
		System.out.println( 
			lname + " can be a last name??: "
			+ isValidLastName(lname)); 
	} 
} 	       