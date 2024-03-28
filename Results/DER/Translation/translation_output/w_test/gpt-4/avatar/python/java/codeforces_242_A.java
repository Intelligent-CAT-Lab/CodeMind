Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<int[]> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c.add(new int[]{i, j});
                }
            }
        }

        System.out.println(c.size());
        for (int[] pair : c) {
            System.out.println(pair[0] + " " + pair[1]);
        }
        scanner.close();
    }
}
```

This Java code does the following:

1. Reads the four integers from the standard input (you can enter the values `5 5 3 2` to match the test input of the provided example).
2. Initializes an `ArrayList` of integer arrays to store the integer pairs (similar to the list `c` in the Python code).
3. Traverses the range of values using two nested loops (for `i` from `a` to `x`, and `j` from `b` to `y`), adding pairs to the list where `i > j`.
4. Prints the size of the resulting list (number of pairs) followed by each pair on a new line.

To run this code, make sure to put it inside a file named `Main.java`, compile it with `javac Main.java`, and then run it with `java Main`. Input the test values when prompted to get the expected output.
