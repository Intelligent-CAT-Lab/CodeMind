Certainly! The Python code you've provided reads an integer from the standard input and then prints the square of that number. Here is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(r * r);
        scanner.close();
    }
}
```

When you run the Java program and input `2`, it should output `4`, which matches your expected output.
