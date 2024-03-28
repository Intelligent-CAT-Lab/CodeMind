import sys
import math

# Template for atcoder
class p02624:

    def __init__(self):
        self.br = sys.stdin
        self.out = sys.stdout
        self.st = None
        self.eof = False
        self.MOD = 1000 * 1000 * 1000 + 7
        self.dx = [0, -1, 0, 1]
        self.dy = [1, 0, -1, 0]

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1

        res = 0
        n = int(self.next_token())
        for i in range(1, n + 1):
            res += i * div[i]
        self.out.write(str(res) + '\n')

    def shuffle(self, a):
        n = len(a)
        for i in range(0, n):
            r = i + int(math.random() * (n - i))
            tmp = a[i]
            a[i] = a[r]
            a[r] = tmp

    def next_token(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except Exception as e:
                self.eof = True
                return None
        return self.st.nextToken()

    def next_string(self):
        try:
            return self.br.readLine()
        except Exception as e:
            self.eof = True
            return None

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return long(self.next_token())

    def next_double(self):
        return float(self.next_token())

if __name__ == '__main__':
    p02624()