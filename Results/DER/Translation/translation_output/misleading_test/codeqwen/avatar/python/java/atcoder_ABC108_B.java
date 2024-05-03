Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;

        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the differences between the second and first x-coordinates and the second and first y-coordinates, and then prints out the new coordinates.
