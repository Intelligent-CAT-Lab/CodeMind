Certainly! Below is the translated Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a < 1200 ? "ABC" : "ARC");
        scanner.close();
    }
}
```

In this Java code, we import the `Scanner` class from `java.util` for taking input from the user. We then instantiate a `Scanner` object to read an integer from the standard input (just like `input()` in Python). After comparing the integer value with 1200, we print "ABC" if it is less than 1200, or "ARC" otherwise. Finally, we close the scanner to avoid resource leaks.
