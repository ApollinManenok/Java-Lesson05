package by.itacademy.lesson05.task1;

public class Triangle extends Figure {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double perimeter = (a + b + c) / 2.0;
        return Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    }

    @Override
    public String type() {
        return "Triangle";
    }
}
