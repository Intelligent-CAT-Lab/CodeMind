Here's the translated Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int[] l = new int[S.length() + 1];
        l[1] = 1;

        if (S.length() > 1) {
            if (S.charAt(0) == S.charAt(1)) {
                l[2] = 1;
            } else {
                l[2] = 2;
            }
        }

        for (int i = 3; i <= S.length(); i++) {
            if (S.charAt(i - 1) != S.charAt(i - 2)) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = l[i - 3] + 2;
            }
        }

        System.out.println(l[S.length()]);
    }
}
```

The Python `input()` function corresponds to using a `Scanner` in Java to read input from the console. Java arrays are 0-indexed, so make sure to handle the indices correctly when translating Python code that uses 1-indexing. Also, keep in mind that strings in Java are zero-based indexed, and you must use the `charAt()` method to access individual characters. Also, the `print()` function in Python is equivalent to `System.out.println()` in Java for printing the output to the console.
