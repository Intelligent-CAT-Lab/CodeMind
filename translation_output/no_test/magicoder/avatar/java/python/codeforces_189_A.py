<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort()
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(1, n + 1):
        for j in range(3):
            if i - a[j] >= 0 and d[i - a[j]] != -1:
                d[i] = max(d[i], d[i - a[j]] + 1)
    print(d[n])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `n` from the standard input, reads three integers into a list `a`, sorts `a`, initializes a list `d` with `-500`, and then iterates over `d` and `a` to calculate the maximum number of coins that can be obtained for each number from 0 to `n`. Finally, it prints the maximum number of coins that can be obtained for `n`.<｜end▁of▁sentence｜>
