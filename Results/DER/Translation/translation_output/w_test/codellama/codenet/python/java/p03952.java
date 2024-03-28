<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

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
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i + 1;
        }

        if (!smaller) {
            for (int i = 0; i < ans.length; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user and the `System.out` and `System.exit` methods to print output and exit the program, respectively. The code is similar to the Python code, with some minor differences in syntax and usage of the `Scanner` class.</s>
