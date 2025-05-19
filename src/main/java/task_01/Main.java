package task_01;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 45;
        int b = 45;
        int result = calculator.add(a, b);

        System.out.println("Сумма: " + result);
    }
}
