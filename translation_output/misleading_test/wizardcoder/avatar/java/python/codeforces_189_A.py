Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
import sys

class Scanner:
    def __init__(self, stream):
        self.stream = stream
        self.buf = ''

    def readline(self):
        while '\n' not in self.buf:
            self.buf += self.stream.read(1).decode()
        line, self.buf = self.buf.split('\n', 1)
        return line

    def read(self):
        while True:
            if '\n' in self.buf:
                line, self.buf = self.buf.split('\n', 1)
                return line
            self.buf += self.stream.read(1).decode()

class Arrcodeforces_189_Ays:
    @staticmethod
    def fill(arr, val):
        for i in range(len(arr)):
            arr[i] = val

    @staticmethod
    def sort(arr):
        for i in range(len(arr)):
            for j in range(i + 1, len(arr)):
                if arr[i] > arr[j]:
                    arr[i], arr[j] = arr[j], arr[i]

class Mcodeforces_189_Ath:
    @staticmethod
    def mcodeforces_189_Ax(a, b):
        if a == -500:
            return b
        if b == -500:
            return a
        return max(a, b)

class Sccodeforces_189_Anner:
    def __init__(self, stream):
        self.scanner = Scanner(stream)

    def nextInt(self):
        return int(self.scanner.readline())

def main():
    in_ = Sccodeforces_189_Anner(sys.stdin)
    n = in_.nextInt()
    codeforces_189_A = [in_.nextInt() for _ in range(3)]
    Arrcodeforces_189_Ays.sort(codeforces_189_A)
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n + 1):
        for j in range(3):
            if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]]!= -1:
                d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(d[i], d[i - codeforces_189_A[j]] + 1)
    print(d[n])

if __name__ == '__main__':
    main()
```<|endoftext|>
