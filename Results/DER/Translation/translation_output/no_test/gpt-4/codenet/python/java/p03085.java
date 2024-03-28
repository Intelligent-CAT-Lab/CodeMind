Here's the equivalent Java code for your provided Python script:

```java
import java.util.Scanner;

public class DNAComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base (A, C, G, or T): ");
        String b = scanner.nextLine();

        if ("A".equals(b)) {
            System.out.println("T");
        } else if ("C".equals(b)) {
            System.out.println("G");
        } else if ("G".equals(b)) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }

        scanner.close();
    }
}
```

A couple of things to note in this translation:
1. Java is strongly typed, so you need to declare the type of each variable.
2. Java code is organized into classes and methods.
3. Since `input()` in Python is equivalent to `Scanner.nextLine()` in Java, I used a `Scanner` object to read the input from the user.
4. We compare strings using the `.equals()` method in Java rather than `==`.
5. System.out.println() is the Java equivalent to the Python `print()` function.
6. It's good practice to close the `Scanner` after you're done with it to release the underlying resources immediately.
7. In Java, the `main()` method must be within a class and is the entry point of any standalone Java application.
