import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape shape = null;

        boolean readCompete = false;

        while (!readCompete) {
            try {
                printOptions();
                shape = shapeCalculator.ceateShape();
                readCompete= true;
            } catch (NoSuchElementException e){
                System.out.println("nie ma takiej opcji!");
            }finally {
                shapeCalculator.clearBuffer();
            }
        }
        System.out.println(shape);
        shapeCalculator.closeScanner();
    }

    private static void printOptions() {
        System.out.println("Wybierz figurę, dla której obliczyć pole i obwód");
        System.out.println(Shape.RECTANGLE + "-prostokąt");
        System.out.println(Shape.CIRCLE + "-koło");
        System.out.println(Shape.TRIANGLE + "-trójkoąt");
    }
}