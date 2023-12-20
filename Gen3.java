/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class Gen3 {
	public static void main(String[] args) {
		int lower_limit = Integer.parseInt(args[0]);
		int higher_limit = Integer.parseInt(args[1]);
		
		int a = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit + 1);
		int b = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit + 1);
		int c = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit + 1);
		
		int minimal = Math.min(Math.min(a, b), c);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("The minimal generated number was " + minimal);	
	}
}
