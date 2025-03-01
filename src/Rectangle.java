public class Rectangle implements Shape {

    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculatorArea() {
        return a * b;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        String result = "prostokąt :";
        result += " bok A:" + a;
        result += ", bok B:" + b;
        result += ", pole:" + calculatorArea();
        result += ", obwód:" + calculatorPerimeter();
        return result;
    }
}
