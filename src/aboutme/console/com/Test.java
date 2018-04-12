package aboutme.console.com;

public class Test {
	public static void main(String[] args) {
		// Step 1: Create pattern 
		String pattern = "ERR[^0-9,^0-9]{2}";
		// Step 2: 
		boolean result = LORENCE_CASE.CASE_2.matches(pattern);
		System.out.println("Result: "+result);
	}
	
	public static class LORENCE_CASE {
		public static String CASE_1 = "NGUYEN VAN VUONG";
		public static String CASE_2 = "ERR01";
	}
}
