import java.util.*;
import java.io.*;

class p02624:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(System.in))
        self.out = PrintWriter(System.out)
        self.eof = False
        self.MOD = 1000L * 1000L * 1000L + 7
        self.dx = [0, -1, 0, 1]
        self.dy = [1, 0, -1, 0]
        self.solve()
        self.out.close()

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1

        res = 0
        n = self.nextInt()
        for i in range(1, n+1):
            res += i * div[i]
        self.outln(res)

    def shuffle(self, a):
        n = len(a)
        for i in range(n):
            r = i + int(random() * (n - i))
            a[i], a[r] = a[r], a[i]

    def outln(self, o):
        self.out.println(o)

    def out(self, o):
        self.out.print(o)

    def nextLongArr(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.nextLong()
        return res

    def nextIntArr(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.nextInt()
        return res

    def nextToken(self):
        while self.st == None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except Exception:
                self.eof = True
                return None
        return self.st.nextToken()

    def nextString(self):
        try:
            return self.br.readLine()
        except IOException:
            self.eof = True
            return None

    def nextInt(self):
        return Integer.parseInt(self.nextToken())

    def nextLong(self):
        return Long.parseLong(self.nextToken())

    def nextDouble(self):
        return Double.parseDouble(self.nextToken())

p02624()