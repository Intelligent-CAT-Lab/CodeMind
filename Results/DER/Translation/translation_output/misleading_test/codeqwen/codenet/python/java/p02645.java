Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, 3).replace("a", ">").replace("z", "<"));
    }
}
```

This Java code reads a line of input from the user, then uses the `substring` method to get the first three characters of the input. It then uses the `replace` method to replace the character 'a' with '>' and the character 'z' with '<'. Finally, it prints out the modified string.
