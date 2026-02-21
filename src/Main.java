import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue, secondValue;

        Calc calc = new Calc();
        System.out.println();

        System.out.print("Вкажіть перше число: ");
        firstValue = scanner.nextInt();

        System.out.print("Вкажіть перше число: ");
        secondValue = scanner.nextInt();

        calc.mathSum(firstValue, secondValue);
    }
}