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

This Java code does the same thing as your Python code. It reads a line of input from the user, splits it into two parts, converts those parts into integers, and then subtracts the second integer from the first. The result is then printed to the console.
