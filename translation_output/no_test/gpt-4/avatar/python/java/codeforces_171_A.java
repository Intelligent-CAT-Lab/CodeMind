Here's a translation of your Python code into Java, assuming you want to read from the standard input (console):

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        String a = parts[0];
        StringBuilder b = new StringBuilder(parts[1]);
        b.reverse(); // reverse the string
        
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b.toString());
        
        System.out.println(aInt + bInt);
        
        scanner.close();
    }
}
```

The code reads a line from the standard input, splits it by whitespace, and then reverses the second part before summing the integer values of the two parts. Please note that in Java we need to explicitly convert the `StringBuilder` back to a `String` before we can parse it as an integer.
