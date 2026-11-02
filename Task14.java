import java.util.Scanner;

abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("\nCircle:");
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());

        System.out.print("\nEnter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("\nRectangle:");
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());

        System.out.print("\nEnter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            Triangle triangle = new Triangle(a, b, c);

            System.out.println("\nTriangle:");
            System.out.printf("Area: %.2f%n", triangle.calculateArea());
            System.out.printf("Perimeter: %.2f%n", triangle.calculatePerimeter());

        } else {
            System.out.println("Invalid triangle sides!");
        }

        sc.close();
    }
}
