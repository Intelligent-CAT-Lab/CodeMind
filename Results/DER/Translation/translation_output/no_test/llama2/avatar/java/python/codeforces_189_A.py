<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 题目

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

### 解题思路

```python
import sys

n = int(sys.stdin.readline())
codeforces_189_A = list(map(int, sys.stdin.readline().split()))

d = [0] * (n + 1)
d[0] = 0
for i in range(1, n + 1):
    for j in range(3):
        if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]] != -1:
            d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)

print(d[n])
```

### 代码

```python
import sys

n = int(sys.stdin.readline())
codeforces_189_A = list(map(int, sys.stdin.readline().split()))

d = [0] * (n + 1)
d[0] = 0
for i in range(1, n + 1):
    for j in range(3):
        if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]] != -1:
            d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)

print(d[n])
```

### 复杂度分析

- 时间复杂度：$$O(n)$$
- 空间复杂度：$$O(n)$$

### 相关题目

- [codeforces_189_A](https://codeforces.com/problemset/problem/189/A)
- [codeforces_189_B](https://codeforces.com/problemset/problem/189/B)
- [codeforces_189_C](https://codeforces.com/problemset/problem/189/C)
- [codeforces_189_D](https://codeforces.com/problemset/problem/189/D)
- [codeforces_189_E](https://codeforces.com/problemset/problem/189/E)
- [codeforces_189_F](https://codeforces.com/problemset/problem/189/F)
- [codeforces_189_G](https://codeforces.com/problemset/problem/189/G)
- [codeforces_189_H](https://codeforces.com/problemset/problem/189/H)
- [codeforces_189_I](https://codeforces.com/problemset/problem/189/I)
- [codeforces_189_J](https://codeforces.com/problemset/problem/189/J)
- [codeforces_189_K](https://codeforces.com/problemset/problem/189/K)
- [codeforces_189_L](https://codeforces.com/problemset/problem/189/L)
- [codeforces_189_M](https://codeforces.com/problemset/problem/189/M)
- [codeforces_189_N](https://codeforces.com/problemset/problem/189/N)
- [codeforces_189_O](https://codeforces.com/problemset/problem/189/O)
- [codeforces_189_P](https://codeforces.com/problemset/problem/189/P)
- [codeforces_189_Q](https://codeforces.com/problemset/problem/189/Q)
- [codeforces_189_R](https://codeforces.com/problemset/problem/189/R)
- [codeforces_189_S](https://codeforces.com/problemset/problem/189/S)
- [codeforces_189_T](https://codeforces.com/problemset/problem/189/T)
- [codeforces_189_U](
