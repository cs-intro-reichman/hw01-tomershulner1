/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int lower_limit = Integer.parseInt(args[0]);
		int higher_limit = Integer.parseInt(args[1]);
		
		int a = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit);
		int b = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit);
		int c = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit);
		
		int minimal = Math.min(Math.min(a, b), c);
		
		System.out.println(a + " \r\n" + b + "\r\n" + c);
		System.out.println("The minimal generated number was " + minimal);	
	}
}
