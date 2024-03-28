Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class ReplaceComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(" , ", " â– ");
        System.out.println(output);
        scanner.close();
    }
}
```

This Java code snippet performs the same functionality as the Python code: it reads a line of text from the standard input, replaces instances of " , " with " â– ", and then prints the resulting string to the standard output.
