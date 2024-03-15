To translate the provided Python code to Java, you need to consider that Java is statically typed, and doesn't support the concise array-based conditional expression in the same way Python does. Also, Java requires explicit type declarations and importing of classes needed for taking input and parsing it.

Here is the equivalent Java code:

```java
import java.util.Scanner;

public class SumOrError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int sum = a + b;
        
        if (sum >= 10) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }
        
        scanner.close();
    }
}
```

In this Java version, I am using the `Scanner` class from `java.util` to read user input and the `split` method to separate the input based on a space. I then parse these inputs to `int` variables and proceed with the condition check to either print the sum or "error" based on the provided logic. Java does not have the convenient syntax of Python for in-line conditional expressions that return different types, so an `if-else` construct is used here.
