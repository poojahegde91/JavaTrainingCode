package javasessions;

public class ShortCircuitExample {

	public static void main(String[] args) {
		// Java program to demonstrate the short circuiting using OR

		// Since first operand is true and operator is ||, Evaluation stops and true is
		// returned.
		if (true || false || false) {
			System.out.println("This output got printed actually,due to short circuit");
		} else {
			System.out.println("This output will not be printed");
		}
	}
}
