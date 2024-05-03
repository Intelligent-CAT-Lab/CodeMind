Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```

This Java code reads a line of input from the user, replaces all commas with spaces, and then prints the output. The `Scanner` class is used to read input from the user, and the `replace` method is used to replace all commas with spaces. The `System.out.println` method is used to print the output.
