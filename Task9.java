import java.lang.Math;

public class Task9 {

    public static int add(int a, int b) {
        return Math.addExact(a,b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a,b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a,b);
    }

    public static float divide(int a, int b) {
        return (float) Math.floorDiv(a,b);
    }
    public static void main(String[] args) {

        int num1 = 200;
        int num2 = 100;

        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        float quotient = divide(num1, num2);

        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

    }
}
