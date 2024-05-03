Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "2018" + input.substring(4);
        System.out.println(output);
    }
}
```

This Java program reads a line of input from the user, concatenates "2018" with the substring of the input starting from the 5th character (since indices in Java start at 0), and then prints the resulting string.
