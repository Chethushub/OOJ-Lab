import java.util.*;


interface Polygon {
    void getPerimeter();
}

abstract class Area {
    public abstract void getArea();
}

class Square extends Area implements Polygon {
    private double side;

    
    public Square() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        this.side = in.nextDouble();
    }

   
    public void getPerimeter() {
        double perimeter = 4 * side;
        System.out.println("The Perimeter of the Square: " + perimeter);
    }

   
   
    public void getArea() {
        double area = side * side;
        System.out.println("The Area of the Square: " + area);
    }
}

class Rectangle extends Area implements Polygon {
    private double length, breadth;

    public Rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the rectangle: ");
        this.length = in.nextDouble();
        this.breadth = in.nextDouble();
    }

    public void getPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("The Perimeter of the Rectangle: " + perimeter);
    }

    
    public void getArea() {
        double area = length * breadth;
        System.out.println("The Area of the Rectangle: " + area);
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        square.getPerimeter();
        square.getArea();

        rectangle.getPerimeter();
        rectangle.getArea();
    }
}
