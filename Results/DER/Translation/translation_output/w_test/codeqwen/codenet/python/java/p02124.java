Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = input / 100;
        String output = "ai1333" + "3".repeat(number);
        System.out.println(output);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the number of '3's needed by dividing the input by 100, and then concatenates the string "ai1333" with that number of '3's. The `repeat` method is used to repeat the string a certain number of times.
