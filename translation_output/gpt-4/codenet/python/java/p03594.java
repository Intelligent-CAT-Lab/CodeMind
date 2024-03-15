Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] l = {'R', 'Y', 'G', 'B'};
        
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if ((i / d) % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[(j / d + 2) % 4];
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[(j / d) % 4];
                }
            }
        }
        
        char[][] ans = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }
        
        for (char[] row : ans) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
```

Please note the following when translating Python to Java:

1. Unlike Python's dynamic typing, Java requires explicit variable type declarations.
2. Java uses array brackets `[]` after the type instead of using `*` to create multi-dimensional arrays.
3. In Java, you need to use `Scanner` or another method to handle input.
4. `print` statements in Python are replaced with `System.out.print` or `System.out.println` in Java.
5. Java uses `close()` to release the `Scanner` resource after use.
6. A `main` method is required in Java as an entry point for the application.
7. Java's loops use curly braces `{}` to define the scope of the loop.
8. Remember to import the necessary classes (e.g., `java.util.Scanner`) at the beginning of the Java program.
