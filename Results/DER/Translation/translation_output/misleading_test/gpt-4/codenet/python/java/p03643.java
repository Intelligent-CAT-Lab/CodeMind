Here is the equivalent Java code for the provided Python script, which takes an input from the user and appends it to the string "ABC":

```java
import java.util.Scanner;

public class ABCAppender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("ABC" + s);
    }
}
```

For the test input of 100, you would need to run this Java program, input 100 when prompted, and the program should output `ABC100` accordingly.

Keep in mind that this Java code includes all necessary imports, and it's written inside a class with a `main` method, which is the entry point for execution in a Java application. When you run the program, make sure that the class name (`ABCAppender`) matches the name of your Java file (for example, `ABCAppender.java`).
