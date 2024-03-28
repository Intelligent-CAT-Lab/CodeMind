Here's the code for the given Python functionality translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        if (S.equals("hi") || S.equals("hihi") || S.equals("hihihi") || S.equals("hihihihi") || S.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

To execute and see the result for the test input "hihi", you would run the `Main` class and provide "hihi" to the standard input. The expected output will be "Yes".

Please note, Java requires a class to hold the main method, I've named it `Main` here, but it can be any valid Java identifier. Java also is strongly typed, so variable declarations must include their type, as seen with the `String S`. Input is handled using a `Scanner` object that reads from `System.in`.
