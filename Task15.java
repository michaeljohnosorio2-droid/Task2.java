public class Task15 {
    static void main(String[] args) {
        Circle myCircle = new Circle("Red", 5.0);
        Rectangle myRectangle = new Rectangle("Blue", 10.0, 4.0);

        System.out.println("--- Circle Info ---");
        System.out.println("Area: " + String.format("%.2f", myCircle.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", myCircle.calculatePerimeter()));

        System.out.println("\n--- Rectangle Info ---");
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}

interface Shape{
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape{
   protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

 class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0,0);

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Rectangle extends AbstractShape {

    public Rectangle(String color,double length, double width) {
        super(color, length, width);

    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}