<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

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
            System.out.println(k);

            int[][] sGrid = new int[k][k];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    sGrid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }

            for (int[] row : sGrid) {
                System.out.print(k - 1 + " ");
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}
```
Note that this solution uses the `Scanner` class to read input from the user, and the `System.out` class to print output to the console. The `for` loops are used to iterate over the input and output the desired results. The `if` statements are used to check the conditions and print the appropriate output.</s>
