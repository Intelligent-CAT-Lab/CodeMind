Here is the Python equivalent of the Java code:

```python
import sys

class Codeforces_189_A:
    def main(self, codeforces_189_Args):
        inp = sys.stdin.readline
        n = int(inp())
        codeforces_189_A = sorted(map(int, inp().split()))
        m = 0
        d = [-500] * (n + 1)
        d[0] = 0
        for i in range(1, n + 1):
            for j in range(3):
                if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]] != -1:
                    d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
        print(d[n])

if __name__ == "__main__":
    codeforces_189_A = Codeforces_189_A()
    codeforces_189_A.main(sys.argv)
```

Please note that the Java code uses a custom class `Sccodeforces_189_Anner` to read input, which is not available in Python. Instead, Python's built-in `sys.stdin.readline` function is used to read input. The `Arrcodeforces_189_Ays.sort` and `Arrcodeforces_189_Ays.fill` methods are replaced with the built-in `sorted` and `list.extend` methods in Python. The `Arrcodeforces_189_Ays.max` method is replaced with the built-in `max` function in Python.
