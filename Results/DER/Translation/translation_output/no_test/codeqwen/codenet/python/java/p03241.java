Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(divisors);
        return divisors;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers N and M from the standard input, calculates the maximum GCD of M and N, and prints it. The `makeDivisors` function finds all divisors of a given number and returns them in a sorted ArrayList.
