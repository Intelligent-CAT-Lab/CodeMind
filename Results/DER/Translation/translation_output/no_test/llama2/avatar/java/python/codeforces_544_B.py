<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = scan.nextInt();
        printIsland(n, count);
    }

    public static void printIsland(int n, int count) {
        int a = (n + 1) / 2;
        int b = n / 2;
        int max = a * a + b * b;
        if (count > max) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0 && count > 0) {
                    sb.append('L');
                    count--;
                } else {
                    sb.append('S');
                }
            }
            sb.append("\n");
        }
    }
}
```

### 解题思路

```python
import sys

n = int(sys.stdin.readline())
count = int(sys.stdin.readline())

a = (n + 1) // 2
b = n // 2
max = a * a + b * b
if count > max:
    print("NO")
else:
    print("YES")

for i in range(n):
    for j in range(n):
        if (i + j) % 2 == 0 and count > 0:
            print("L", end="")
            count -= 1
        else:
            print("S", end="")
    print()
```

### 复杂度分析

- 时间复杂度：O(n^2)。
- 空间复杂度：O(1)。
</s>
