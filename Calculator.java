public abstract class Calculator {

	public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
		int addReal = num1.getReal() + num2.getReal();
		int addImaginary = num1.getImaginary() + num2.getImaginary();

		return new ComplexNumber(addReal, addImaginary);
	}

	public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
		int realSubtraction = num1.getReal() - num2.getReal();
		int imaginarySubtraction = num1.getImaginary() - num2.getImaginary();

		return new ComplexNumber(realSubtraction, imaginarySubtraction);
	}

	public static ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
		int denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();

		int realNumber = num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary();
		int imaginaryNumber = (num2.getReal() * num1.getImaginary())
				- (num1.getReal() * num2.getImaginary());

		if (denominator == 0) {
			denominator = 1;
		}

		int realDivision = realNumber / denominator;
		int imaginaryDivision = imaginaryNumber / denominator;

		return new ComplexNumber(realDivision, imaginaryDivision);
	}

	public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
		int realMultiplication = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());
		int imaginaryMultiplication = (num1.getReal() * num2.getImaginary()) + (num2.getReal() * num1.getImaginary());

		return new ComplexNumber(realMultiplication, imaginaryMultiplication);
	}

	public static ComplexNumber inv(ComplexNumber num) {
		int denominator = num.getReal() * num.getReal() + num.getImaginary() * num.getImaginary();
		if (denominator == 0) {
			denominator = 1;
		}
		int newReal = num.getReal() / denominator;
		int newImaginary = num.getImaginary() / denominator;

		return new ComplexNumber(newReal, newImaginary);
	}

	public static ComplexNumber chs(ComplexNumber num) {
		int newReal = -num.getReal();
		int newImaginary = -num.getImaginary();

		return new ComplexNumber(newReal, newImaginary);
	}

	public static ComplexNumber conj(ComplexNumber num) {
		int newImaginary = -num.getImaginary();

		return new ComplexNumber(num.getReal(), newImaginary);
	}

	public static int abs(ComplexNumber num) {
		return (int) Math.sqrt(num.getReal() * num.getReal() + num.getImaginary() * num.getImaginary());
	}

}