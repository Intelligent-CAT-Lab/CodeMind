Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 1

Expected output:
RY
GR


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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        String[] l = {"R", "Y", "G", "B"};
        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if (i / d % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[(j / d + 2) % 4].charAt(0);
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[j / d % 4].charAt(0);
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
            System.out.println(new String(row));
        }
    }
}
```<|endoftext|>
