Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);

        int[] arr = {n - 1, r - m * n};
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];

        int d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }

        int u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }

        System.out.println(a < 1 ? 0 : u / d);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, sorts them, and then calculates the factorials of the two smallest numbers. It then divides the larger factorial by the smaller one and prints the result.
