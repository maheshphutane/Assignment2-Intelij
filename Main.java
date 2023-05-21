public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,4);
        Complex c2 = new Complex(2,9);

        Complex c3 = c1.addComplexNumbers(c2);
        c3.showComplexNumber();
    }
}
