System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> l = Arrays.asList('R', 'Y', 'G', 'B');
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if ((i / d) % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l.get((j / d + 2) % 4);
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l.get(j / d % 4);
                }
            }
        }
        char[][] ans = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
