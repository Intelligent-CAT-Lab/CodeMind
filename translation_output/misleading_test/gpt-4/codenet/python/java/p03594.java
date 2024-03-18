Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class ColorPattern {
    public static void main(String[] args) {
        char[] l = {'R', 'Y', 'G', 'B'};
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();

        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if ((i / d) % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[(j / d + 2) % 4];
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[j / d % 4];
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
        
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code:

1. It takes three integers `h`, `w`, and `d` as an input from the user.
2. It generates a pattern based on the given logic and the values of `h`, `w`, and `d`.
3. It prints out the resulting h by w pattern.
