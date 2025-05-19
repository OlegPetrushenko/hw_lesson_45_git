package task_01;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 4;
        int b = 7;
        int result = calculator.add(a, b);

        System.out.println("Сумма: " + result);
    }
}
