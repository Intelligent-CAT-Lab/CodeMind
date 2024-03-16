Here is the equivalent Java code that performs the same operations as the given Python code. It first takes the single line of input, splits it into two numbers, then computes the maximum of `(a - b)`, `(a + b)`, and `(a * b)` and prints the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int maxResult = Math.max(Math.max(a - b, a + b), a * b);
        System.out.println(maxResult);
    }
}
```

To run the Java program, you need to save it to a file named `Main.java`, compile it using `javac Main.java`, and then run it with `java Main`. When prompted, enter the test input `-13 3`, and it will print the expected output `-10`.
