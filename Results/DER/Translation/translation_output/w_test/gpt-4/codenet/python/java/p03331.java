Here's the translated Java code that corresponds to the Python code you provided. It calculates the minimum sum of digits when a number `N` is split into two positive numbers whose sum is `N`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumOfDigits(i) + sumOfDigits(N - i));
        }

        System.out.println(ans);
    }

    private static int sumOfDigits(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        return total;
    }
}
```

To run this Java code, paste it into a file named `Main.java`, compile it with `javac Main.java`, and then run it with `java Main`. When prompted, you'd input the number (like 15 in your test case), and the program will output the result (which should be 6 in your test case).
