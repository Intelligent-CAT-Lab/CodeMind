<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
29 27 18 2

Expected output:
-72

```
import jcodeforces_189_Avcodeforces_189_A.util.*;

public clcodeforces_189_Ass codeforces_189_A {
    public stcodeforces_189_Atic void mcodeforces_189_Ain(String codeforces_189_Args[]) {
        Sccodeforces_189_Anner in = new Sccodeforces_189_Anner(System.in);
        int n = in.nextInt();
        int[] codeforces_189_A = new int[3];
        codeforces_189_A[0] = in.nextInt();
        codeforces_189_A[1] = in.nextInt();
        codeforces_189_A[2] = in.nextInt();
        Arrcodeforces_189_Ays.sort(codeforces_189_A);
        int mcodeforces_189_Ax = 0;
        int d[] = new int[n + 1];
        Arrcodeforces_189_Ays.fill(d, -500);
        d[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                if (i - codeforces_189_A[j] >= 0 && d[i - codeforces_189_A[j]] != -1) {
                    d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(d[i], d[i - codeforces_189_A[j]] + 1);
                }
            }
        }
        System.out.println(d[n]);
    }
}
```

@@ Response
Here is the Python equivalent of the given Java code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    codeforces_189_A = list(map(int, sys.stdin.readline().split()))
    codeforces_189_A.sort()
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n + 1):
        for j in range(3):
            if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]] != -1:
                d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
    print(d[n])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, sorts the array, and then uses dynamic programming to find the maximum number of coins that can be obtained. The `max` function is used to find the maximum of two numbers. The `if` condition checks if the current index is greater than or equal to the value of the coin and if the value at the index `i - codeforces_189_A[j]` is not -1. If both conditions are true, it updates the value at index `i` with the maximum of the current value and the value at index `i - codeforces_189_A[j]` plus 1. Finally, it prints the value at index `n` which is the maximum number of coins that can be obtained.<｜end▁of▁sentence｜>
