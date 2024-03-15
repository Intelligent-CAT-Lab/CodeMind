Certainly! Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int r = scanner.nextInt();
        int area = r * r;

        System.out.println(area);

        scanner.close();
    }
}
```

This Java code does the same thing as the provided Python code: it takes an integer input from the user and prints out the square of that number. Note that the `Scanner` class is used to read input from the user in Java, and it is important to close the scanner object after it is no longer needed to free up system resources.
