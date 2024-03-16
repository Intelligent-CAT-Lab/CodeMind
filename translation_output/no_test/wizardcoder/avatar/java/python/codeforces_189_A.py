Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
                if (i - codeforces_189_A[j] >= 0 && d[i - codeforces_189_A[j]]!= -1) {
                    d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(d[i], d[i - codeforces_189_A[j]] + 1);
                }
            }
        }
        System.out.println(d[n]);
    }
}
```

### Response:
```python
import util

class codeforces_189_A:
    def __init__(self):
        pass
    
    def mcodeforces_189_Ain(self, codeforces_189_Args):
        in = util.Scanner(codeforces_189_Args[1])
        n = in.nextInt()
        codeforces_189_A = [in.nextInt(), in.nextInt(), in.nextInt()]
        codeforces_189_A.sort()
        mcodeforces_189_Ax = 0
        d = [-500] * (n + 1)
        d[0] = 0
        for i in range(n + 1):
            for j in range(3):
                if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]]!= -500:
                    d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
        print(d[n])

if __name__ == '__main__':
    codeforces_189_A().mcodeforces_189_Ain(sys.argv)
```<|endoftext|>
