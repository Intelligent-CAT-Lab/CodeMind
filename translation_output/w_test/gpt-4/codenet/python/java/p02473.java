Here's the translated Java code for the Python snippet provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
    }
}
```

In Java, you would typically use a `Scanner` object to read input from the standard input stream (console), split the input into an array using the `split` method, and then parse the integer values before calculating and printing the result.
