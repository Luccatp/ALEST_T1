class ComplexNumber{
  private double _re;
  private double _im;

    public ComplexNumber(double re, double im)
    {
        this._re = re;
        this._im = im;
    }
 
    public double getReal(){
       return _re;
    }

    public void setReal(double _re) {
      this._re = _re;
    } 

    public double getImaginary(){
        return _im;
    }

    public void setImaginary(double _im) {
      this._im =_im;
    }

    public int compareTo(ComplexNumber peek) {
        if (peek == null)
            return 1;
    
        if (this._re >= 0 && peek._re >= 0) {
            if (this.getReal() > peek.getReal())
                return 1;
            else if (this.getReal() < peek.getReal())
                return -1;
        } else if (this.getReal() < 0 && peek.getReal() < 0) {
            if (this.getReal() < peek.getReal())
                return 1;
            else if (this.getReal() > peek.getReal())
                return -1;
        } else if (this.getReal() > peek.getReal()) {
            return 1;
        } else if (this.getReal() < peek.getReal()) {
            return -1;
        }
        return 0;
    }
}
