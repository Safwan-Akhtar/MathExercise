package Math.Exercise;

public class MathsExerciseCalculator {
	
	String division(double num1, double num2) {
		if (num1 < num2) {
		return "Division cannot be preformed";
		} else {
		return " " + (num1 / num2);
		}	
	}
	int subtract(int num1, int num2) {
		return num1 - num2;
	}
	int multiply(int num1, int num2) {
		return num1 * num2;
	}
}