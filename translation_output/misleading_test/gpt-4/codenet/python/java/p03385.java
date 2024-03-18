Here is the translated code in Java. Keep in mind that Java is a statically-typed language and uses different methods to read input from the user. In this case, I'm using a `Scanner` to read the string input, and I'm utilizing the `contains` method for string comparison:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.contains("a") && S.contains("b") && S.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

To execute this Java program, compile it using a Java compiler and run the resulting class file. During execution, when prompted, input your test case (e.g., "bac") and the program will provide the expected output ("Yes" in this case, if the input contains 'a', 'b', and 'c').
