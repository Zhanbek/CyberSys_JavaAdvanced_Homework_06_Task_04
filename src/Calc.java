import annotations.Math;

public class Calc {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        System.out.println();
        System.out.printf("%d + %d = %d",  num1, num2, num1 + num2);
        System.out.println();
    }
}
