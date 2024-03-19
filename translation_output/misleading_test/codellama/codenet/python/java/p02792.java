<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
-13

```
N=int(raw_input())

num = [[0 for i in range(10)] for j in range(10)]

for i in range(1,N+1):
    if i % 10 > 0:
        num[int(str(i)[0])][i % 10] += 1

#print num

c = 0
for i in range(1,10):
    for j in range(1,10):
        c += num[i][j]*num[j][i]
print c

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                num[i / 10][i % 10]++;
            }
        }

        int c = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                c += num[i][j] * num[j][i];
            }
        }

        System.out.println(c);
    }
}
```
This code first reads an integer `N` from the user, and then initializes a 2D array `num` with 10 rows and 10 columns.

The next loop iterates from 1 to `N`, and for each iteration, it checks if the current number is divisible by 10. If it is, it increments the value at the corresponding position in the `num` array.

After the loop, the code calculates the sum of the products of the elements in the `num` array, and prints the result.

Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the result.</s>
