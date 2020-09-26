package regexproblemUC1;


	    import java.util.regex.*; 
	    import java.util.*;
	    public class RegexProblemUC1  { 

		public static boolean isValidFirstName(String fname) 
		{ 

			String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
			Pattern ptrn = Pattern.compile(regex); 
			Matcher match = ptrn.matcher(fname); 
			return match.matches(); 
		} 

		public static void main(String args[]) 
		{ 
			Scanner you = new Scanner(System.in);
			System.out.print("Enter the first name: ");
			String fname = you.nextLine();
			System.out.println( 
				fname + " can be a first name??: "
				+ isValidFirstName(fname)); 
		} 
}
