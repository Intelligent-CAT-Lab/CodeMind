Here's the translated version of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.nextLine().toCharArray();

        int N = -1;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == '*') {
                N = i;
                break;
            }
        }

        int P = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] == '(') {
                P++;
            } else if (S[i] == ')') {
                P--;
            }
        }
        P = Math.abs(P);

        int Q = 0;
        for (int i = N + 1; i < S.length; i++) {
            if (S[i] == '(') {
                Q++;
            } else if (S[i] == ')') {
                Q--;
            }
        }
        Q = Math.abs(Q);

        System.out.println(Math.min(P, Q));
    }
}
```

A few things were changed and adapted to fit Java's syntax and best practices: 

- In Java, strings are indexed differently, so we used `toCharArray()` to convert the input string to a char array, which we can easily iterate over.
- To find the index of a character in a char array in Java, we loop through and check each character manually.
- Java does not have a direct one-liner to count occurrences of a character in a string or char array, so we manually check each character and manage the count for both `P` and `Q`.
- `Math.abs()` is used in Java to get the absolute value.
- We use `Math.min()` to find the minimum between the two calculated numbers.
- Finally, we use `System.out.println()` for printing the result to the console.
