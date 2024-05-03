Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        double MN = (double) M / N;
        ArrayList<Integer> divisor = makeDivisors(M);
        int maxGcd = 0;
        for (int d : divisor) {
            if ((d <= MN) && (d >= maxGcd)) {
                maxGcd = d;
            }
        }
        System.out.println(maxGcd);
    }

    public static ArrayList<Integer> makeDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the maximum GCD of the second integer divided by the first, and prints the result. The `makeDivisors` function is the same as your Python function, but it returns an `ArrayList<Integer>` instead of a list.
