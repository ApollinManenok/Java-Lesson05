public abstract class Figure {
    public abstract double area();

    public abstract String type();

    @Override
    public String toString() {
        return "Figure " + type();
    }
}
