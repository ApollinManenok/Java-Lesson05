package by.itacademy.lesson05.task1;

public abstract class Figure {
    public abstract double area();

    public abstract String type();

    @Override
    public String toString() {
        return "Figure " + type();
    }
}
