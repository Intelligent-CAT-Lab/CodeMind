Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] L = new int[a + b + c];
        Arrays.fill(L, 0, a, 0);
        Arrays.fill(L, a, a + b, 1);
        Arrays.fill(L, a + b, a + b + c, 2);

        while (L.length > 1) {
            L[0] += L[L.length - 1];
            L = Arrays.copyOfRange(L, 0, L.length - 1);
            Arrays.sort(L);
        }

        StringBuilder result = new StringBuilder();
        for (int i : L) {
            result.append((char) ('a' + i));
        }

        System.out.println(result.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, creates an array `L` with the appropriate values, and then enters a loop that continues until `L` has only one element. In each iteration of the loop, it adds the last element of `L` to the first element, removes the last element from `L`, sorts `L`, and then repeats the process. Finally, it converts the array `L` to a string and prints it.
