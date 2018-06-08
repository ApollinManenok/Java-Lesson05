package by.itacademy.lesson05.task1;

public class Task1 {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 4, 5);
        System.out.println(triangle + " area: " + triangle.area());
        Figure circle = new Circle(4);
        System.out.println(circle + " area: " + circle.area());
        Figure rectangle = new Rectangle(6, 4);
        System.out.println(rectangle + " area: " + rectangle.area());
        Figure square = new Square(5);
        System.out.println(square + " area: " + square.area());
    }
}
