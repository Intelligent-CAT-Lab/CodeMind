<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

class codeforces_189_Ass:
    def __init__(self):
        self.in = sys.stdin
        self.n = int(self.in.readline())
        self.codeforces_189_A = [int(x) for x in self.in.readline().split()]
        Arrcodeforces_189_Ays.sort(self.codeforces_189_A)
        self.mcodeforces_189_Ax = 0
        self.d = [int(-500) for _ in range(self.n + 1)]
        self.d[0] = 0
        for i in range(self.n + 1):
            for j in range(3):
                if i - self.codeforces_189_A[j] >= 0 and self.d[i - self.codeforces_189_A[j]] != -1:
                    self.d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(self.d[i], self.d[i - self.codeforces_189_A[j]] + 1)
        print(self.d[self.n])

if __name__ == '__main__':
    codeforces_189_Ass()
```</s>
