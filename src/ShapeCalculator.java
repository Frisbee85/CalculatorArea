import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj dane do utworzenia prostokąta:");
        System.out.println("podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("podaj długość boku B:");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj dane do utworzenia koła:");
        System.out.println("podaj długość promienia :");
        double r = sc.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData() {
        System.out.println("Podaj dane do utworzenia trójkąta:");
        System.out.println("podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("podaj długość boku B:");
        double b = sc.nextDouble();
        System.out.println("podaj długość boku C:");
        double c = sc.nextDouble();
        System.out.println("podaj wysokość h:");
        double h = sc.nextDouble();

        return new Triangle(a, b, c, h);
    }

    public Shape ceateShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}

