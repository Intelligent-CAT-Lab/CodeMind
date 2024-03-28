<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

can_be_ans = False
for k in range(1, 10 ** 5):
    if 2 * N == k * (k - 1):
        can_be_ans = True
        break
    elif 2 * N < k * (k - 1):
        break
        
if not can_be_ans:
    print("No")
else:
    print("Yes")
    print(k)
    s_grid = [[0 for i in range(k - 1)] for j in range(k)]
    for i in range(1, k + 1):
        for j in range(k - i):
            s_grid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) // 2 + 1 + j
            s_grid[i + j][i - 1] = (i - 1) * k - i * (i - 1) // 2 + 1 + j
            
    for row in s_grid:
        print(k - 1, end=" ")
        print(" ".join(map(str, row)))
```

### 解题思路

```
N = int(input())

can_be_ans = False
for k in range(1, 10 ** 5):
    if 2 * N == k * (k - 1):
        can_be_ans = True
        break
    elif 2 * N < k * (k - 1):
        break
        
if not can_be_ans:
    print("No")
else:
    print("Yes")
    print(k)
    s_grid = [[0 for i in range(k - 1)] for j in range(k)]
    for i in range(1, k + 1):
        for j in range(k - i):
            s_grid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) // 2 + 1 + j
            s_grid[i + j][i - 1] = (i - 1) * k - i * (i - 1) // 2 + 1 + j
            
    for row in s_grid:
        print(k - 1, end=" ")
        print(" ".join(map(str, row)))
```

### 代码实现

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean can_be_ans = false;
        for (int k = 1; k < 100000; k++) {
            if (2 * N == k * (k - 1)) {
                can_be_ans = true;
                break;
            } else if (2 * N < k * (k - 1)) {
                break;
            }
        }
        if (!can_be_ans) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(k);
            int[][] s_grid = new int[k - 1][k - 1];
            for (int i = 1; i < k + 1; i++) {
                for (int j = k - i; j > 0; j--) {
                    s_grid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) // 2 + 1 + j;
                    s_grid[i + j][i - 1] = (i - 1) * k - i * (i - 1) // 2 + 1 + j;
                }
            }
            for (int[] row : s_grid) {
                System.out.print(k - 1 + " ");
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
```

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(N)。

### 相关题目

- [Python](https://leetcode-cn.com/problems/number-of-ways-to-make-a-sum/)
- [Java](https://leetcode-cn.com/problems/number-of-ways-to-make-a-sum/)
</s>
