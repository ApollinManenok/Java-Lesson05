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
