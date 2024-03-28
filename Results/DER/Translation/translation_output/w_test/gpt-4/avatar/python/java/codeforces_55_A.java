Below is the Java translation of the provided Python code. The code checks whether the input number is a power of two and prints "YES" if it is, or "NO" otherwise.

```java
import java.util.Scanner;

public class PowerOfTwoChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n % 2 == 0) {
            n /= 2;
        }

        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

To use this program, you can provide an input when prompted, and it will print "YES" if the input is a power of two, and "NO" otherwise. If you test with input `512`, the program will print "YES".
