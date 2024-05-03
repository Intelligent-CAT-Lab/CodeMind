Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] parts = number.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = (b < 0) ? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, splits it into three parts, converts them to integers, and then performs the same operations as your Python code. The result is then printed to the console.
