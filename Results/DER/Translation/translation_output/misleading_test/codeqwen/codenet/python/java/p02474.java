Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a * b);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, multiplies them, and prints the result. The `Scanner` class is used to read input from the user, and the `split` method is used to split the input string into an array of strings. The `Integer.parseInt` method is used to convert the strings in the array to integers.
