/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int first_limit = Integer.parseInt(args[0]);
		int second_limit = Integer.parseInt(args[1]);
		int range
		int lower_limit;
		
		if (first_limit < second_limit) {
			range = second_limit - first_limit;
			lower_limit = first_limit;
		}
		else {
			range = first_limit - second_limit;
			higher_limit = second_limit;
		}
		
		int a = (int)((Math.random() * range) + lower_limit);
		int b = (int)((Math.random() * range) + lower_limit);
		int c = (int)((Math.random() * range) + lower_limit);
		
		int minimal = Math.min(Math.min(a, b), c);
		
		System.out.println(a + "\n" + b + "\n" + c);
		System.out.println("The minimal generated number was " + minimal);	
	}
}
