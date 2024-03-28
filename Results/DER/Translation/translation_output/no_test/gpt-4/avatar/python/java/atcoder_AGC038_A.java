Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = "0";
                    } else {
                        answer[i][j] = "1";
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = "1";
                    } else {
                        answer[i][j] = "0";
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.join(" ", answer[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
    }
}
```

This Java code assumes you will be receiving input through standard input, much like the Python program was designed to take input from `sys.stdin`. Make sure you have the inputs ready when you run this Java program or provide a source for the standard input.
