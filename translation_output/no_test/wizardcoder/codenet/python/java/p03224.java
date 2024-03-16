Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean canBeAns = false;
        for (int k = 1; k <= 100000; k++) {
            if (2 * N == k * (k - 1)) {
                canBeAns = true;
                break;
            } else if (2 * N < k * (k - 1)) {
                break;
            }
        }
        if (!canBeAns) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int k = 0;
            for (int i = 1; i <= 100000; i++) {
                if (2 * N == i * (i - 1)) {
                    k = i;
                    break;
                }
            }
            int[][] sGrid = new int[k][k];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    sGrid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(sGrid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
```<|endoftext|>
