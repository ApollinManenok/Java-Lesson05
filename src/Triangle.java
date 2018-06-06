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
        return (a + b + c) / 2.0;
    }

    @Override
    public String type() {
        return "Triangle";
    }
}
