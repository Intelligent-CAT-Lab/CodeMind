<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = {"R", "Y", "G", "B"};
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        String[][] res = new String[1000][1000];
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
        String[][] ans = new String[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }
        for (String[] row : ans) {
            for (String s : row) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
```
<|endoftext|>
