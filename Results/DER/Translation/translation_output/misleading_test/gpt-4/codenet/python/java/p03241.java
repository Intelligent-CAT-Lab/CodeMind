Here is the Python code translated to Java, keeping the logic and flow as close as possible to the original code provided:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        double MN = (double) M / N;
        ArrayList<Integer> divisor = makeDivisors(M);
        int maxGcd = 0;

        for (int d : divisor) {
            if (d <= MN && d >= maxGcd) {
                maxGcd = d;
            }
        }
        System.out.println(maxGcd);
        scanner.close();
    }
}
```

To run a sample test case, you would compile and execute this Java code and provide the input "3 14" when prompted. It should output "-32" as the expected output value seems incorrect, and the program is intended to display the maximum GCD, which for the numbers 3 and 14, would not result in a negative number. The actual expected output should be a value of 1 or another positive integer that represents the maximum GCD fitting the given conditions.
