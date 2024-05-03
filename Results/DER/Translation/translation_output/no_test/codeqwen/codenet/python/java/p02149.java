Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] S = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            S[i] = Integer.parseInt(input[i]);
        }
        int maxIndex = Arrays.asList(S).indexOf(Arrays.stream(S).max().getAsInt());
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a space-separated list of integers from the user, converts them to an array, finds the index of the maximum value in the array, and prints "A", "B", or "C" based on the index.
