Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class CompareInputs {
    public static void main(String[] args) {
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        String N = parts[0];
        String M = parts[1];

        if (N.compareTo(M) > 0) {
            System.out.println(">");
        } else if (N.equals(M)) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
        scanner.close();
    }
}
```

Note that the original Python code is comparing strings rather than numerical values, because `input()` returns string values, and `N,M` suggests that the user input two values separated by a space.

Considering that, the equivalent code in Java also compares the variables `N` and `M` as `String` objects. To compare the actual integer values, you would need to parse them into integers before comparing them using `Integer.parseInt()`. If you intend to compare integers in Java, please let me know, and I will provide the adjusted code.
