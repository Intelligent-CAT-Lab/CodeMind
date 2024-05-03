Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(inputs[0]);
        int y1 = Integer.parseInt(inputs[1]);
        int x2 = Integer.parseInt(inputs[2]);
        int y2 = Integer.parseInt(inputs[3]);

        int a = x2 - x1;
        int b = y2 - y1;

        System.out.println(x2 - b + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the differences between the x and y coordinates, and then prints out the new coordinates.
