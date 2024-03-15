import java.util
import java.io

# Template for atcoder
class p02624:

    br = None
    out = None
    st = None
    eof = False
    MOD = 1000 * 1000 * 1000 + 7
    dx = [0, -1, 0, 1]
    dy = [1, 0, -1, 0]

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT):
                div[j] += 1
        res = 0
        n = int(next())
        for i in range(1, n + 1):
            res += i * div[i]
        print(res)

    def shuffle(self, a):
        n = len(a)
        for i in range(n):
            r = i + (int)(random() * (n - i))
            tmp = a[i]
            a[i] = a[r]
            a[r] = tmp

    def outln(self, o):
        self.out.println(o)

    def out(self, o):
        self.out.print(o)

    def __init__(self):
        self.br = java.io.BufferedReader(java.io.InputStreamReader(java.io.System.in))
        self.out = java.io.PrintWriter(java.io.System.out)
        self.solve()
        self.out.close()

    def main(self):
        self.__init__()

if __name__ == '__main__':
    p02624().main()