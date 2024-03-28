import java.util.Scanner;

public class p04029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) * n / 2);
    }
}



Next, we use the `System.out.println()` method to print the result of the calculation. We use the `int` keyword to convert the result to an integer, since the `println()` method takes a `String` argument.