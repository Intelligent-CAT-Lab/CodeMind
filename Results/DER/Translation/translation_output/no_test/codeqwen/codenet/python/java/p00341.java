Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Arrays.fill(a, 0);
        Scanner scanner = new Scanner(System.in);
        String[] b = scanner.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            a[Integer.parseInt(b[i]) - 1] += 1;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}
```

This Java code does the same thing as your Python code. It initializes an array `a` with 100 zeros, reads a string of space-separated integers from the user, increments the corresponding index in `a` by 1, counts the number of indices in `a` that are greater than 0 and are divisible by 4, and then prints "yes" if the count is 3, otherwise it prints "no".
