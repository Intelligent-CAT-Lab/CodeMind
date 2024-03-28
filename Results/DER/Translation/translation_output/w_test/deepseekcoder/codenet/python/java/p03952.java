<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
Yes
1
6
3
7
4
5
2


```
N, x = [int(i) for i in input().split()]
import sys

if x == 1 or x == 2*N-1:
    if N != 1:
        print('No')
        sys.exit()
    else:
        print('Yes')
        print(1)
        sys.exit()

smaller = True
if x > N:
    smaller = False
    x = 2*N-x

ans = list(range(2*N-1,N+x-1,-1))+list(range(1,N+x))
if not smaller:
    ans =[2*N - ans[i] for i in range(2*N-1)]

print('Yes')
for i in range(2*N-1):
    print(ans[i])
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();

        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                System.exit(0);
            } else {
                System.out.println("Yes");
                System.out.println(1);
                System.exit(0);
            }
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }

        int[] ans = new int[2 * N - 1];
        for (int i = 0; i < N + x - 1; i++) {
            ans[i] = 2 * N - 1 - i;
        }
        for (int i = N + x - 1; i < 2 * N - 1; i++) {
            ans[i] = i - N - x + 2;
        }
        if (!smaller) {
            for (int i = 0; i < 2 * N - 1; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < 2 * N - 1; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the input, checks if the second integer is 1 or 2*N-1, and if it is, it prints "No" and exits if N is not 1, or "Yes" and 1 if N is 1. If the second integer is not 1 or 2*N-1, it determines whether the first integer is smaller than the second, and then creates an array of integers based on these conditions. Finally, it prints "Yes" followed by the elements of the array.
<|EOT|>
