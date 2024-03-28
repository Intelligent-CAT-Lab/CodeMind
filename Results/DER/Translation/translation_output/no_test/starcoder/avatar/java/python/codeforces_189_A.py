<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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
import math

class Scanner:
    def __init__(self, f):
        self.f = f
        self.buffer = ""
        self.pos = 0
        self.fill()

    def fill(self):
        while True:
            if self.pos == len(self.buffer):
                self.buffer = self.f.readline()
                self.pos = 0
                if self.buffer == "":
                    return
            if self.buffer[self.pos] == " ":
                self.pos += 1
            else:
                break

    def token(self):
        while True:
            if self.pos == len(self.buffer):
                self.buffer = self.f.readline()
                self.pos = 0
                if self.buffer == "":
                    return None
            if self.buffer[self.pos] == " ":
                self.pos += 1
            else:
                break
        start = self.pos
        while True:
            if self.pos == len(self.buffer):
                self.buffer = self.f.readline()
                self.pos = 0
                if self.buffer == "":
                    return self.buffer[start:self.pos]
            if self.buffer[self.pos] == " ":
                return self.buffer[start:self.pos]
            self.pos += 1

class Arr:
    def __init__(self, n, init):
        self.n = n
        self.a = [init] * n

    def __getitem__(self, i):
        return self.a[i]

    def __setitem__(self, i, x):
        self.a[i] = x

    def __str__(self):
        return str(self.a)

    def __repr__(self):
        return str(self.a)

    def __iter__(self):
        return self.a.__iter__()

    def __reversed__(self):
        return self.a.__reversed__()

    def __contains__(self, x):
        return self.a.__contains__(x)

    def __len__(self):
        return self.n

    def __add__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n + m, [0] * (n + m))
        elif isinstance(b, int):
            return Arr(n + 1, [0] * (n + 1))
        else:
            raise TypeError

    def __sub__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n - m, [0] * (n - m))
        elif isinstance(b, int):
            return Arr(n - 1, [0] * (n - 1))
        else:
            raise TypeError

    def __mul__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n * m, [0] * (n * m))
        elif isinstance(b, int):
            return Arr(n * 1, [0] * (n * 1))
        else:
            raise TypeError

    def __floordiv__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n // m, [0] * (n // m))
        elif isinstance(b, int):
            return Arr(n // 1, [0] * (n // 1))
        else:
            raise TypeError

    def __mod__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n % m, [0] * (n % m))
        elif isinstance(b, int):
            return Arr(n % 1, [0] * (n % 1))
        else:
            raise TypeError

    def __pow__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n ** m, [0] * (n ** m))
        elif isinstance(b, int):
            return Arr(n ** 1, [0] * (n ** 1))
        else:
            raise TypeError

    def __lshift__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n << m, [0] * (n << m))
        elif isinstance(b, int):
            return Arr(n << 1, [0] * (n << 1))
        else:
            raise TypeError

    def __rshift__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n >> m, [0] * (n >> m))
        elif isinstance(b, int):
            return Arr(n >> 1, [0] * (n >> 1))
        else:
            raise TypeError

    def __and__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n & m, [0] * (n & m))
        elif isinstance(b, int):
            return Arr(n & 1, [0] * (n & 1))
        else:
            raise TypeError

    def __xor__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n ^ m, [0] * (n ^ m))
        elif isinstance(b, int):
            return Arr(n ^ 1, [0] * (n ^ 1))
        else:
            raise TypeError

    def __or__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n | m, [0] * (n | m))
        elif isinstance(b, int):
            return Arr(n | 1, [0] * (n | 1))
        else:
            raise TypeError

    def __iadd__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            for i in range(n):
                a[i] += b[i]
            return self
        elif isinstance(b, int):
            for i in range(n):
                a[i] += b
            return self
        else:
            raise TypeError

    def __isub__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b
