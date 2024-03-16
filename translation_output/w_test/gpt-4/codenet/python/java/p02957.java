Here is the equivalent Java code for the given Python script. In Java, you would typically use a `Scanner` to read the input from the user and your main method would be enclosed within a class.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2.0 * (A - B));
        if (x % 1 == 0) {
            System.out.println((int) x);
        } else {
            System.out.println("IMPOSSIBLE");
        }

        scanner.close();
    }
}
```

When you run this code and input `2 16`, it will output `9` as expected.
