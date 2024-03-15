Here is the equivalent Java code for the supplied Python script:

```java
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void setRecursionLimit(int newLimit) {
        // In Java, the recursion limit is managed by the stack size and cannot be changed at runtime.
        // The stack size can be adjusted by using the -Xss flag when starting the JVM.
    }

    public static int ii() {
        return sc.nextInt();
    }

    public static int[] mi() {
        String input = sc.nextLine().trim();
        return Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] lmi() {
        return mi();
    }

    public static char[] li() {
        return sc.nextLine().trim().toCharArray();
    }

    public static void debug(Object... args) {
        System.err.print("debug: ");
        for (Object arg : args) {
            System.err.print(arg + " ");
        }
        System.err.println();
    }

    public static void exit(Object... arg) {
        for (Object obj : arg) {
            System.out.print(obj + " ");
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        // Uncomment to manually test with a FileInputStream
        // try {
        //     System.setIn(new FileInputStream("in_1.txt"));
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        setRecursionLimit(200000);
        // Call the main logic method
        mainLogic();
    }

    public static void mainLogic() {
        int[] inputs = lmi();
        int A = inputs[0];
        int B = inputs[1];
        int C = inputs[2];

        if ((A * B) % 2 == 0 && (B * C) % 2 == 0 && (C * A) % 2 == 0) {
            System.out.println("Tem");
        } else {
            System.out.println("Hom");
        }
    }
}
```

Please note the following points:
- Java does not have a `sys.setrecursionlimit` equivalent; the stack size is controlled by the JVM options.
- The `mi`, `li`, and related functions have been adapted to use the Scanner class in Java.
- Instead of `sys.stdin.readline`, we use `Scanner.nextLine()` for user input.
- Instead of `sys.exit()`, we use `System.exit(0)` in Java. However, we should usually avoid using `System.exit` within normal application flow due to the immediate termination of the JVM; the function was left as a placeholder to mirror the Python code's behavior.
- The `math` and `fractions` modules, as well as `heapq` and `collections` functionalities, were imported but not used in the main Python function, so their Java equivalents were not included in the translation.
- I avoided the local only part (related to file input redirection) as it's a debugging facility, but I've included a commented section showing how to achieve similar behavior in Java (redirecting `System.in` to read from a file).

Please adjust the main method to suit how you want to run the program, possibly including the commented file input portion for local testing.
