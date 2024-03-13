<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A,B = map(int,input().split())
X = []
for i in range(100):
    defC = "." if i<50 else "#"
    line = [defC for _ in range(100)]
    X.append(line)

h,w = (B-1)//50,(B-1)%50
for i in range(h):
    for j in range(50):
        X[i*2][j*2] = "#"
for i in range(w):
    X[h*2][i*2] = "#"

h,w = (A-1)//50,(A-1)%50
for i in range(h):
    for j in range(50):
        X[i*2+51][j*2] = "."
for i in range(w):
    X[h*2+51][i*2] = "."

print(100,100)
for i in range(100):
    print("".join(X[i]))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String[][] X = new String[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                X[i][j] = (i < 50) ? ((j < 50) ? "#" : ".") : ((j < 50) ? "." : "#");
            }
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = "#";
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = "#";
        }

        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = ".";
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2 + 51][i * 2] = ".";
        }

        System.out.println(100 + " " + 100);
        for (int i = 0; i < 100; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 100; j++) {
                sb.append(X[i][j]);
            }
            System.out.println(sb.toString());
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers A and B from the input, creates a 100x100 grid, and then modifies it according to the rules of the Python code. Finally, it prints the grid.<｜end▁of▁sentence｜>
