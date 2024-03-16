import java.util.*;
import java.io.*;
import java.util.function.*;

class p02823:
    def __init__(self):
        self.in_ = In()
        self.out_ = Out()
        self.mod = 1000000007
        self.inf = 0xfffffffffffffffL

    def solve(self):
        n = self.in_.nextLong()
        a = self.in_.nextLong()
        b = self.in_.nextLong()
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            self.out_.println(min(ans1, ans2))
        else:
            self.out_.println((b - a) // 2)

    def main(self):
        self.solve()
        self.out_.flush()

class In:
    def __init__(self):
        self.reader = BufferedReader(InputStreamReader(System.in), 0x10000)
        self.tokenizer = None

    def next(self):
        try:
            while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = StringTokenizer(self.reader.readLine())
        except IOException:
            pass
        return self.tokenizer.nextToken()

    def nextInt(self):
        return Integer.parseInt(self.next())

    def nextLong(self):
        return Long.parseLong(self.next())

    def nextCharArray(self, n, m):
        a = [[0] * m for _ in range(n)]
        for i in range(n):
            a[i] = list(self.next())
        return a

    def nextIntArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextIntArray(self, n, op):
        a = [0] * n
        for i in range(n):
            a[i] = op.applyAsInt(self.nextInt())
        return a

    def nextLongArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextLong()
        return a

    def nextLongArray(self, n, op):
        a = [0] * n
        for i in range(n):
            a[i] = op.applyAsLong(self.nextLong())
        return a

class Out:
    def __init__(self):
        self.out = PrintWriter(System.out)

    def println(self, *a):
        joiner = StringJoiner(" ")
        for obj in a:
            joiner.add(str(obj))
        self.out.println(joiner)

    def flush(self):
        self.out.flush()