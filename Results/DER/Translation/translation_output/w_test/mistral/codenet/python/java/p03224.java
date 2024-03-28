<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
Yes
3
2 1 2
2 3 1
2 2 3


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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean can_be_ans = false;
        for (int k = 1; k <= 1000000000; k++) {
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
            int[][] s_grid = new int[k][k - 1];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    s_grid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    s_grid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }
            for (int[] row : s_grid) {
                System.out.print(k - 1 + " ");
                for (int i : row) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
```</s>
