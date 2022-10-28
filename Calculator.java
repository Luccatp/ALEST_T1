public abstract class Calculator {

	public static double[] add(double[] num1, double[] num2) {
		double addReal = num1[0] + num2[0];
		double addImaginary = num1[1] + num2[1];

		double[] newNumber = { addReal, addImaginary };
		return newNumber;
	}

	public static double[] subtract(double[] num1, double[] num2) {
		double realSubtraction = num1[0] - num2[0];
		double imaginarySubtraction = num1[1] - num2[1];

		double[] newNumber = { realSubtraction, imaginarySubtraction };
		return newNumber;
	}

	public static double[] division(double[] num1, double[] num2) {
		double denominator = num2[0] * num2[0] + num2[1] * num2[1];

		double realNumber = num1[0] * num2[0] + num1[1] * num2[1];
		double imaginaryNumber = ((num2[0] * num1[1])
				- (num1[0] * num2[1]));

		double realDivision = realNumber / denominator;
		double imaginaryDivision = imaginaryNumber / denominator;

		double[] newNumber = { realDivision, imaginaryDivision };
		return newNumber;
	}

	public static double[] multiply(double[] num1, double[] num2) {
		double realMultiplication = (num1[0] * num2[0]) - (num1[1] * num2[1]);
		double imaginaryMultiplication = (num1[0] * num2[1]) + (num2[0] * num1[1]);

		double[] newNumber = { realMultiplication, imaginaryMultiplication };
		return newNumber;
	}

}