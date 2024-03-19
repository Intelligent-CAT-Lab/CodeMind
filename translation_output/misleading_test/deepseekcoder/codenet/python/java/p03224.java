<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean canBeAns = false;
        int k = 0;
        for (k = 1; k <= 100000; k++) {
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
            System.out.println(k);
            int[][] sGrid = new int[k][k - 1];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    sGrid[i - 1 + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }

            for (int i = 0; i < k; i++) {
                System.out.print((k - 1) + " ");
                for (int j = 0; j < k - 1; j++) {
                    System.out.print(sGrid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, checks if it can be a solution to a certain problem, and if it can, it prints the solution. The solution is a grid of integers, where each row has `k - 1` elements and each element is calculated based on the row and column indices.
<|EOT|>
