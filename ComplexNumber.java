class ComplexNumber{
    public ComplexNumber(double re, double im)
    {
        _re = re;
        _im = im;
    }
 
    private double _re;
    public double getReal(){
       return _re;
    }
    private double _im;
    public double getImaginary(){
        return _im;
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
