Here is the Python version of the provided Java code:

```python
import sys

class Kattio:
    def __init__(self, input_file=sys.stdin, output_file=sys.stdout):
        self.input_file = input_file
        self.output_file = output_file
        self.r = input_file.readline
        self.w = output_file.write

    def hasMoreTokens(self):
        return self.peekToken() is not None

    def getInt(self):
        return int(self.nextToken())

    def getDouble(self):
        return float(self.nextToken())

    def getLong(self):
        return int(self.nextToken())

    def getWord(self):
        return self.nextToken()

    def peekToken(self):
        if self.token is None:
            try:
                while self.st is None or not self.st.tokens:
                    self.line = self.r().strip()
                    if not self.line:
                        return None
                    self.st = StringTokenizer(self.line)
                self.token = self.st.nextToken()
            except EOFError:
                pass
        return self.token

    def nextToken(self):
        ans = self.peekToken()
        self.token = None
        return ans

class Solve:
    def __init__(self, io):
        self.io = io

    def main(self):
        n = self.io.getInt() * 2
        k = self.io.getInt()
        a = [0] * (k + 1)
        b = [0] * (k + 1)
        f = [0] * (n + 1)

        for i in range(1, k + 1):
            a[i] = self.io.getInt()
            b[i] = self.io.getInt()
            f[a[i]] = 1
            f[b[i]] = 1

        for i in range(1, n + 1):
            f[i] += f[i
