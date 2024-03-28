Here's the equivalent Java code for the provided Python code:
```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int sum = a + b;
        System.out.println(sum >= 10 ? "error" : sum);
        scanner.close();
    }
}
```

This Java program will work similarly to the provided Python code. It reads a line of input, splits it into two parts, converts those parts to integers, adds them up, and prints either their sum or the word "error" if their sum is 10 or greater.
