class ComplexNumber {
	private int _re;
	private int _im;

	public ComplexNumber(int re, int im) {
		this._re = re;
		this._im = im;
	}

	public int getReal() {
		return _re;
	}

	public void setReal(int _re) {
		this._re = _re;
	}

	public int getImaginary() {
		return _im;
	}

	public void setImaginary(int _im) {
		this._im = _im;
	}

	public String toString() {
		return _re + " " + _im + "i";
	}
}
