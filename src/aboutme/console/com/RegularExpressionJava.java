package aboutme.console.com;

public class RegularExpressionJava {
	public static void main(String[] args) {
		// Step 1: Create pattern 
		// String pattern = "ERR[0-9]{2}:\\s[DNLU].*";
		String pattern = "ERR[0-9]{2}:\\s.*";
		// Step 2: 
		boolean result = LORENCE_CASE.CASE_5.matches(pattern);
		System.out.println("Result: "+result);
	}
	
	public static class LORENCE_CASE {
		public static String CASE_1 = "ERR01: Database connection failed";
		public static String CASE_2 = "ERR02: Login incorrect";
		public static String CASE_3 = "ERR11: No incoming faxes available";
		public static String CASE_4 = "ERR08: Unknown operation specified or bad POST <POST contents>";
		public static String CASE_5 = "NGUYEN VAN VUONG";
	}
}
