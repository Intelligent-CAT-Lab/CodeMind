Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int w = Integer.parseInt(parts[0]);
        int h = Integer.parseInt(parts[1]);
        String c = parts[2];

        System.out.println("+" + "-".repeat(w - 2) + "+");

        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }

        System.out.println("+" + "-".repeat(w - 2) + "+");
        scanner.close();
    }
}
```

Make sure to note the following adjustments:

1. Java requires a class declaration (in this case, `Main`) and the main method as the program entry point.
2. `Scanner` is used for input handling in Java.
3. The `repeat(n)` method for Strings in Java can be used in place of the Python string multiplication operation `* n` (This method is available since Java 11, so ensure your Java version is up-to-date).
4. Java uses explicit type conversion, so `Integer.parseInt()` is used to convert a `String` to an `int`.
