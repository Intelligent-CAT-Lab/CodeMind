import java.io.*;
import java.util.*;

class p03467:
    P = 998244353
    map = {}

    def go(self, s):
        if s == "":
            return 1
        if s in self.map:
            return self.map[s]

        ret = (1 + ord(s[0]) - ord('0')) * self.go(s[1:]) % self.P
        for x in range(1, len(s) // 2 + 1):
            for k in range(2, len(s) // x + 1):
                for i in range(x):
                    if s[(k - 1) * x + i] == '0':
                        buf = list(s[:i] + '0' + s[i+1:])
                ret += self.go(''.join(buf)) * self.go(s[k*x:]) % self.P

        self.map[s] = ret
        return ret

    def submit(self):
        s = self.nextToken()
        self.out.println(self.go(s))

    def preCalc(self):
        pass

    def stress(self):
        pass

    def test(self):
        pass

    def __init__(self):
        self.br = BufferedReader(InputStreamReader(System.in))
        self.out = PrintWriter(System.out)
        self.preCalc()
        self.submit()
        # self.stress()
        # self.test()
        self.out.close()

    def nextToken(self):
        while self.st == None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except IOException as e:
                raise RuntimeException(e)
        return self.st.nextToken()

    def nextString(self):
        try:
            return self.br.readLine()
        except IOException as e:
            raise RuntimeException(e)

    def nextInt(self):
        return Integer.parseInt(self.nextToken())

    def nextLong(self):
        return Long.parseLong(self.nextToken())

    def nextDouble(self):
        return Double.parseDouble(self.nextToken())