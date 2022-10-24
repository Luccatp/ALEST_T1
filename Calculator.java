public abstract class Calculator {
	public static double[] add(double[] num1, double[] num2) {
		double somaParteReal = num1[0] + num2[0];
		double somaParteImaginaria = num1[1] + num2[1];
    double[] newNumber = { somaParteReal, somaParteImaginaria };
		return newNumber;
	}

	public static double[] subtract(double[] a, double[] b) {
		double subtracaoParteReal = a.getParteReal() - b.getParteReal();
		double subtracaoParteImaginaria = a.getParteImaginaria() - b.getParteImaginaria();
    double[] newNumber = { somaParteReal, somaParteImaginaria };
		return newNumber;
	}

  public static double[] division(double[] a, double[] b) {
    double denominador = (quadrado(b.getParteReal()) + quadrado(b.getParteImaginaria()));
    handleDenominadorZero(denominador);
    double numeradorReal = ((a.getParteReal() * b.getParteReal())
        + (a.getParteImaginaria() * b.getParteImaginaria()));
    double numeradorImaginario = ((b.getParteReal() * a.getParteImaginaria())
        - (a.getParteReal() * b.getParteImaginaria()));
    double divisaoParteReal = numeradorReal / denominador;
    double divisaoParteImaginaria = numeradorImaginario / denominador;
    double[] newNumber = { somaParteReal, somaParteImaginaria };
    return newNumber;
  }

	public static double[] multiply(double[] a, double[] b) {
		double multiplicacaoParteReal = (a.getParteReal() * b.getParteReal())
				- (a.getParteImaginaria() * b.getParteImaginaria());
		double multiplicacaoParteImaginaria = ((a.getParteReal() * b.getParteImaginaria())
				+ (b.getParteReal() * a.getParteImaginaria()));
        
    double[] newNumber = { somaParteReal, somaParteImaginaria };
    return newNumber;
	}

	public static double[] inverse(double[] n) {
		double[] novo = new double[](n);
		double denominador = quadrado(novo.getParteReal()) + quadrado(novo.getParteImaginaria());
		handleDenominadorZero(denominador);
		double parteReal = novo.getParteReal() / denominador;
		double parteImaginaria = -novo.getParteImaginaria() / denominador;
		novo.setParteReal(parteReal);
		novo.setParteImaginaria(parteImaginaria);
		double[] newNumber = { somaParteReal, somaParteImaginaria };
		return newNumber;
	}

	public static double[] change(double[] n) {
		double[] novo = new double[](n);
		if (novo.getParteReal() != 0)
			novo.setParteReal(-novo.getParteReal());
		if (novo.getParteImaginaria() != 0)
			novo.setParteImaginaria(-novo.getParteImaginaria());
      double[] newNumber = { somaParteReal, somaParteImaginaria };
      return newNumber;
	}

	public static double[] conjugado(double[] n) {
		double[] newNumber = { somaParteReal, somaParteImaginaria };
		return newNumber;
	}

	public static double absolute(double[] n) {
		double[] newNumber = { somaParteReal, somaParteImaginaria };
		return newNumber;
	}
}