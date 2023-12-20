/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
