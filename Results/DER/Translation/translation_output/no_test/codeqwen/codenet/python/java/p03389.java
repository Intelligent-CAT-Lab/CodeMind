Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int[] a = {A, B, C};
        Arrays.sort(a);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];

            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }

        s += Arrays.stream(a).sum() % 3;

        System.out.println(s);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, sorts them, and then calculates the sum of the differences between the maximum and the other two numbers, and the sum of the numbers modulo 3. The result is then printed to the console.
