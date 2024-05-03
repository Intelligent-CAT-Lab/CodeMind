Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            System.out.println((n > 1) ? "11" + s + s : "");
            return;
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1) {
                for (int m = (int) Math.pow(10, -n + 1); m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((sumDigits(h + mStr) * 2 + c) % 3 == 0) {
                        String t = h + mStr.repeat(n - 1);
                        int a = Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
                        if (isPrime(a)) {
                            System.out.println(a);
                            return;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (isPrime(a)) {
                    System.out.println(a);
                    return;
                }
            }
        }
    }

    private static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i
