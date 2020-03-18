public class Circle implements Shape {

    private double r;


    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculatorArea() {
        return Math.round(Shape.PI * r * r);
    }

    @Override
    public double calculatorPerimeter() {
        return Math.round(2 * Shape.PI * r);
    }

    @Override
    public String toString() {
        String result = "koło :";
        result +=", promiń:"+r;
        result +=", pole:"+ calculatorArea();
        result +=", obwód:"+ calculatorPerimeter();
        return result;
    }
}
