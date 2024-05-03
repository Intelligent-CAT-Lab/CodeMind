Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        System.out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the minimum and maximum values, and prints them out. The `Math.min` and `Math.max` functions are used to find the minimum and maximum values, respectively. The `Integer.parseInt` function is used to convert the string inputs to integers. The `Scanner` class is used to read the user's input.
