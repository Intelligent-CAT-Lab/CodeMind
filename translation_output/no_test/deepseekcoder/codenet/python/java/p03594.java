<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
l = ['R', 'Y', 'G', 'B']
h, w, d = map(int, input().split())
res = [[None] * 1000 for _ in range(1000)]
for i in range(1000):
    if (i // d) % 2 == 0:
        for j in range(1000):
            res[i][j] = l[(j // d + 2) % 4]
    else:
        for j in range(1000):
            res[i][j] = l[j // d % 4]
ans = [[None] * w for _ in range(h)]
for i in range(h):
    for j in range(w):
        ans[i][j] = res[i + j][h - i - 1 + j]
for row in ans:
    print(''.join(row))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] l = {'R', 'Y', 'G', 'B'};
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
    }
}
```

This Java code does the same thing as the Python code. It reads three integers `h`, `w`, and `d` from the input, creates a 2D array `res` with 1000 rows and 1000 columns, fills it with characters from the array `l`, creates a 2D array `ans` with `h` rows and `w` columns, fills it with characters from the 2D array `res`, and then prints the `ans` array.
<|EOT|>
