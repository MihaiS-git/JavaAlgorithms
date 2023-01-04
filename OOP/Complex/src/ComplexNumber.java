public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void add(ComplexNumber c1){
        this.real = this.real + c1.getReal();
        this.imaginary = this.imaginary + c1.getImaginary();
    }

    public void subtract(ComplexNumber c1){
        this.real = this.real - c1.getReal();
        this.imaginary = this.imaginary - c1.getImaginary();
    }


}
