public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatorArea() {
        return a * height / 2;
    }

    @Override
    public double calculatorPerimeter() {
        return a * b * c;
    }

    @Override
    public String toString() {
        String result = "prostokąt :";
        result +=", bok A:"+a;
        result +=", bok B:"+b;
        result +=", bok C:"+c;
        result +=", wysokość na bok A:"+ height;
        result +=", pole:"+ calculatorArea();
        result +=", obwód:"+ calculatorPerimeter();
        return result;
    }
}
