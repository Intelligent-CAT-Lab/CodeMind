Here's the equivalent Java code for the Python script you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        A = Integer.parseInt(parts[0]);
        B = Integer.parseInt(parts[1]);

        char[][] X = new char[100][100];
        for (int i = 0; i < 100; i++) {
            char defC = i < 50 ? '.' : '#';
            for (int j = 0; j < 100; j++) {
                X[i][j] = defC;
            }
        }

        int h, w;
        h = (B - 1) / 50;
        w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = '#';
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = '#';
        }

        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = '.';
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2 + 51][i * 2] = '.';
        }

        System.out.println("100 100");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    }
}
```

Please note that in this Java code, we are using a `Scanner` to read the input, splitting the input using `split(" ")`, and parsing them to integers with `Integer.parseInt()`. The 2D array `X` is of type `char`, which holds characters ('.' or '#'). The structure of the loops and logic follows closely the original Python code to achieve the same result.
