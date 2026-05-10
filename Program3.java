class Shape {
    public int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int area() {
        return length * width;
    }
}

class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}

public class Program3 {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(8, 4);
        Shape square = new Square(5);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Square area: " + square.area());
    }
}