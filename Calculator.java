public abstract class Calculator {

	public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
		double addReal = num1.getReal() + num2.getReal();
		double addImaginary = num1.getImaginary() + num2.getImaginary();

		ComplexNumber newNumber = new ComplexNumber(addReal, addImaginary);
		return newNumber;
	}

	public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
		double realSubtraction = num1.getReal() - num2.getReal();
		double imaginarySubtraction = num1.getImaginary() - num2.getImaginary();

		ComplexNumber newNumber = new ComplexNumber(realSubtraction, imaginarySubtraction);
		return newNumber;
	}

	public static ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
		double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();

		double realNumber = num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary();
		double imaginaryNumber = ((num2.getReal() * num1.getImaginary())
				- (num1.getReal() * num2.getImaginary()));

		double realDivision = realNumber / denominator;
		double imaginaryDivision = imaginaryNumber / denominator;

		ComplexNumber newNumber = new ComplexNumber(realDivision, imaginaryDivision);
		return newNumber;
	}

	public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
		double realMultiplication = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());
		double imaginaryMultiplication = (num1.getReal() * num2.getImaginary()) + (num2.getReal() * num1.getImaginary());

		ComplexNumber newNumber = new ComplexNumber(realMultiplication, imaginaryMultiplication);
		return newNumber;
	}

}