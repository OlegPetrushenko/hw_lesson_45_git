package task_02;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);

        double area = rect.getArea();
        double perimeter = rect.getPerimeter();

        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}
