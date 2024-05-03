Here is the Python equivalent of the Java code:

```python
class p03570:
    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        in_ = FastScanner(input_stream)
        out = PrintWriter(output_stream)
        solver = TaskD()
        solver.solve(1, in_, out)
        out.close()

class TaskD:
    def solve(self, test_number, in_, out):
        s = in_.next()
        d = [s.__len__()] * (1 << 26)
        d[0] = 0
        mask = 0
        ans = s.__len__()
        for i in range(s.__len__()):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = 0 if j < 0 else (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == s.__len__() - 1:
                    ans = min(ans, cur)
        out.println(ans)

class FastScanner:
    def __init__(self, stream):
        self.in_ = BufferedReader(InputStreamReader(stream))
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.in_.readLine())
            except IOException:
                raise RuntimeError(e)
        return self.st.nextToken()

class PrintWriter:
    def __init__(self, stream):
        self.out = stream

    def println(self, text):
        self.out.write(str(text) + '\n')

if __name__ == "__main__":
    p03570().main()
```

Please note that the Python code assumes that the `sys` module is already imported. If it's not, you need to add `import
