Here is the equivalent Java code for the provided Python script. This code reads an integer from the console and prints out the result of multiplying that number by 32.

```java
import java.util.Scanner;

public class MultiplyByThirtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num * 32);

        scanner.close();
    }
}
```

To run this Java program, you would compile it using `javac` and run the resulting class file. For example, if you save the program as `MultiplyByThirtyTwo.java`, you would do the following in the terminal:

```sh
javac MultiplyByThirtyTwo.java
java MultiplyByThirtyTwo
```

When you run the program, input `4`, and the expected output will be `128`, as in the Python code sample provided.
