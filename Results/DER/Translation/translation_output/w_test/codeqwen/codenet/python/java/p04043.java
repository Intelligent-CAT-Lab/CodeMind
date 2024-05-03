Here is the Java equivalent of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (Arrays.equals(Arrays.stream(new int[]{a, b, c}).sorted().toArray(), new int[]{5, 5, 7})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code: it reads three integers from the user, sorts them, and checks if the sorted array is equal to [5, 5, 7]. If it is, it prints "YES", otherwise it prints "NO".
