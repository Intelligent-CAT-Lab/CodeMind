Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "20" + input.substring(4);
        System.out.println(output);
    }
}
```

This Java program reads a line of input from the user, extracts the substring starting from the 5th character (since indices in Java start at 0), and concatenates it with "20" to form the output. The output is then printed to the console.
