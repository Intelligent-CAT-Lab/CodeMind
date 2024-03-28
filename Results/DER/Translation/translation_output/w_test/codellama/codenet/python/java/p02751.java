<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
111


```
n,m=map(int,input().split())
ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
for k in range(1,11):
    for i in range(2**k,2**n,2**k):
        for j in range(2**k,2**m,2**k):
            if ans[i-1][j-1]=="1":
                ans[i-1][j-1]="0"
            else:
                ans[i-1][j-1]="1"
for i in range(2**n-1):
    print("".join(ans[i]))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int[][] ans = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ans[i][j] = 1;
            }
        }

        for (int k = 1; k < 11; k++) {
            for (int i = 2 * k; i < 2 * n; i += 2 * k) {
                for (int j = 2 * k; j < 2 * m; j += 2 * k) {
                    if (ans[i - 1][j - 1] == 1) {
                        ans[i - 1][j - 1] = 0;
                    } else {
                        ans[i - 1][j - 1] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * m - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first reads in the input from the user, and then it initializes a 2D array `ans` with the values 1. It then loops through the values of `k` from 1 to 10, and for each value of `k`, it loops through the values of `i` and `j` from `2 * k` to `2 * n` and `2 * m` respectively, and for each value of `i` and `j`, it checks if the value at `ans[i - 1][j - 1]` is 1, and if it is, it sets it to 0, otherwise it sets it to 1. Finally, it loops through the values of `i` and `j` from 0 to `2 * n - 1` and `2 * m - 1` respectively, and for each value of `i` and `j`, it prints the value at `ans[i][j]`.</s>
