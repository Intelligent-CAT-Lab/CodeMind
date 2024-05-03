Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        System.out.println((a-1)*(b-1));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, subtracts 1 from each, and then multiplies the results together. The `Scanner` class is used to read the input from the user, and the `split` method is used to split the input string into an array of strings, which are then converted to integers using the `Integer.parseInt` method. The result is then printed to the console using the `System.out.println` method.
