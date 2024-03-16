Here's how the provided Python code can be translated into Java. Note that in Java, you will need to import the `Scanner` class for reading input from the user.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input will be in the format "H H" without quotes
        String a = scanner.next();
        String b = scanner.next();

        // Closing the scanner as good practice since we don't need it anymore
        scanner.close();

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
```

To compile and run this Java program, you can either use a Java IDE like IntelliJ IDEA or Eclipse, or you can compile and run it from the command line using the `javac` and `java` commands, respectively, if you have the JDK installed.

For the given test input "H H", the expected output would indeed be "H" as the Java program mirrors the logic of the Python script.
