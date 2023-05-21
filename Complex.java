public class Complex {
    int real;
    int imaginary;
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void showComplexNumber(){
        System.out.println(this.real+"+i"+this.imaginary);
    }

    public Complex addComplexNumbers(Complex a){
        return new Complex(this.real+ a.real,this.imaginary+a.imaginary);
    }

}
