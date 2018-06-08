package by.itacademy.lesson05.task1;

public class Square extends Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public String type() {
        return "Square";
    }
}
