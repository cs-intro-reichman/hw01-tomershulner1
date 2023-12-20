/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int first_limit = Integer.parseInt(args[0]);
		int second_limit = Integer.parseInt(args[1]);
		int higher_limit;
		int lower_limit;
		
		if (first_limit < second_limit) {
			higher_limit = second_limit;
			lower_limit = first_limit;
		}
		else {
			higher_limit = first_limit;
			lower_limit = second_limit;
		}
		
		int a = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit);
		int b = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit);
		int c = (int) ((Math.random() * (higher_limit - lower_limit)) + lower_limit);
		
		int minimal = Math.min(Math.min(a, b), c);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("The minimal generated number was " + minimal);	
	}
}
