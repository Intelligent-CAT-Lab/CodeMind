<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
                if (i - codeforces_189_A[j] >= 0 && d[i - codeforces_189_A[j]]!= -1) {
                    d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(d[i], d[i - codeforces_189_A[j]] + 1);
                }
            }
        }
        System.out.println(d[n]);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    input = sys.stdin.readline
    N, A, B, C = map(int, input().split())
    d = [-500] * (N + 1)
    d[0] = 0
    for i in range(N + 1):
        for j in range(3):
            if i - A >= 0 and d[i - A]!= -1:
                d[i] = max(d[i], d[i - A] + 1)
            if i - B >= 0 and d[i - B]!= -1:
                d[i] = max(d[i], d[i - B] + 1)
            if i - C >= 0 and d[i - C]!= -1:
                d[i] = max(d[i], d[i - C] + 1)
    print(d[N])

if __name__ == '__main__':
    main()
```

"""

import sys

def main():
    input = sys.stdin.readline
    N, A, B, C = map(int, input().split())
    d = [-500] * (N + 1)
    d[0] = 0
    for i in range(N + 1):
        for j in range(3):
            if i - A >= 0 and d[i - A]!= -1:
                d[i] = max(d[i], d[i - A] + 1)
            if i - B >= 0 and d[i - B]!= -1:
                d[i] = max(d[i], d[i - B] + 1)
            if i - C >= 0 and d[i - C]!= -1:
                d[i] = max(d[i], d[i - C] + 1)
    print(d[N])

if __name__ == '__main__':
    main()
<|endoftext|>
