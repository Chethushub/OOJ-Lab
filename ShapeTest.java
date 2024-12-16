 abstract class Shape {
    int a = 10, b = 20;

     abstract void printArea();
}

 class Rectangle extends Shape {
     void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

 class Triangle extends Shape {
     void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

 class Circle extends Shape {
     void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();

        r.printArea();
        t.printArea();
        c.printArea();
    }
}