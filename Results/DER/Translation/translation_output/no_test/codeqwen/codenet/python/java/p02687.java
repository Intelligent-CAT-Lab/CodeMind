Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
        scanner.close();
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `equals` method is used to compare the input string with "ARC". If the input is "ARC", it prints "ABC", otherwise it prints "ARC". Finally, we close the scanner to release the resources.
