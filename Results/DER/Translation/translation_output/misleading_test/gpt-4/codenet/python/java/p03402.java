Below is the translated Java code that performs the equivalent operation as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        char[][] X = new char[100][100];
        for (int i = 0; i < 100; i++) {
            char defC = i < 50 ? '.' : '#';
            for (int j = 0; j < 100; j++) {
                X[i][j] = defC;
            }
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
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
        
        System.out.println(100 + " " + 100);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
```

To run this Java program, you would need to compile it and then provide the input as specified in the test case when running the program.
