Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int n = 512;
        int pattern = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / factorial(i) / factorial(7);
            a[i] = val;
        }

        int cnt = 600 * 7;
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            int item = a[i];
            while (k >= item) {
                ans[i] += 'L';
                k -= item;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : ans) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the factorial of numbers from 7 to 512, and then calculates the remainder of the division of the input number by the factorial of each number. It then appends 'L' to the corresponding index in the answer array until the remainder is zero. Finally, it prints the answer array as a string.
