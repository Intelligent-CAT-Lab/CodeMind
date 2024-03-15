import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < (n - 2) / n; i++) {
            if (n < 3) {
                System.out.print("-");
            } else {
                for (int j = 0; j < n - 1; j++) {
                    // Since the `^` operator in Python is bitwise XOR, we use ^ in Java as well.
                    // Also translating `-~` Python syntax for incrementing by 1 using `+ 1` in Java.
                    // Replacing backticks with a proper String format function.
                    int value = ((i + 1 + (j ^ (n % 2 < (j + 2) ? 1 : 0) ^ (n > i * 2 ? 1 : 0))) % n) + 1;
                    System.out.print(value);
                    if (j < n - 2) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}