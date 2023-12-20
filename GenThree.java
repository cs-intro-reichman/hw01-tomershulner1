/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// Finding the lower and higher limit 
		int higher_limit = Math.max(a, b);
		int lower_limit = Math.min(a, b);
		
		int range = higher_limit - lower_limit;
		
		int first = (int)((Math.random() * range) + lower_limit);
		int second = (int)((Math.random() * range) + lower_limit);
		int third = (int)((Math.random() * range) + lower_limit);
		
		int minimal = Math.min(Math.min(a, b), c);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("The minimal generated number was " + minimal);	
	}
}
