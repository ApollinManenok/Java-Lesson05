package by.itacademy.lesson05.task1;

public class Rectangle extends Figure {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public String type() {
        return "Rectangle";
    }
}
