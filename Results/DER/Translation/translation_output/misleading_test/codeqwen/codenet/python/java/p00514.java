Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        int[] arr = {n - 1, r - m * n};
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];

        int d = 1;
        for (int i = 1; i <= a; i++) {
            d *= i;
        }

        int u = 1;
        for (int i = b + 1; i <= a + b; i++) {
            u *= i;
        }

        System.out.println(a < 1 ? 0 : u / d);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, sorts them, and then calculates the factorials of the two smallest numbers. It then divides the larger factorial by the smaller one and prints the result. If the smallest number is less than one, it prints zero.
