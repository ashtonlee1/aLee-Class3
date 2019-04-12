public class Example {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "Pink");
        System.out.println(circle1.getColor());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println(circle1.getArea());
    }
}

class Circle {
    int radius;
    String color;
    public Circle(int n) {
        radius=n;
    }
    public Circle(String g) {
        color=g;
    }
    public Circle(int n, String g) {
        radius=n;
        color=g;/*Constructor class*/
    }
    public String toString() {
        return "radius: " + radius + " color: " + color;
    }
    public int getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String getColor() {
        return color;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
}
