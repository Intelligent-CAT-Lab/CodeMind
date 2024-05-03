Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.println("1" + "0".repeat(i) + "1");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, and then prints out the appropriate output based on the value of the integer. The `repeat` method is used to repeat a string a certain number of times, which is a feature of Java 11 and later. If you're using an earlier version of Java, you can replace `"0".repeat(i)` with `new String(new char[i]).replace("\0", "0")`.
