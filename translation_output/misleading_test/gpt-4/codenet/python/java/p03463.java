Here is the equivalent Java code for the provided Python code. The Java program takes three space-separated integers from the standard input, just like in the Python code example, and prints "Alice" if the absolute difference between the second and third integer is even, and "Borys" otherwise.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
        
        scanner.close();
    }
}
```

Please note, Java requires more boilerplate code than Python for this task, due to its statically-typed nature and the need for class definitions and method declarations. When you execute this Java code, you will need to provide the input in the same way as expected in the Python code.
