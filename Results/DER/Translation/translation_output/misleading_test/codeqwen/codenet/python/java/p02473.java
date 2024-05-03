Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        System.out.println(num1 - num2);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, subtracts the second integer from the first, and prints the result. The `Scanner` class is used to read input from the user, and the `split` method is used to split the input string into an array of strings. The `Integer.parseInt` method is used to convert the strings in the array to integers.
