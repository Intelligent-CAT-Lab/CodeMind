import sys

class In:
    def __init__(self):
        self.reader = (line.rstrip() for line in sys.stdin)
        self.tokenizer = None

    def next(self):
        try:
            while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = StringTokenizer(next(self.reader))
        except StopIteration:
            pass
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextCharArray(self, n, m):
        a = [[0]*m for _ in range(n)]
        for i in range(n):
            a[i] = list(self.next())
        return a

    def nextIntArray(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLongArray(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.nextLong()
        return a

class Out:
    def __init__(self):
        self.out = sys.stdout
        self.autoFlush = False

    def println(self, *a):
        print(*a, file=self.out)
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        print(*a, file=self.out)
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        print(*a, file=self.out)
        if self.autoFlush:
            self.out.flush()

    def flush(self):
        self.out.flush()

class p03840:
    def __init__(self):
        self.in = In()
        self.out = Out()
        self.mod = 1000000007
        self.iinf = 0xfffffff
        self.inf = 0xfffffffffffffffL

    def solve(self):
        ai = self.in.nextInt()
        ao = self.in.nextInt()
        at = self.in.nextInt()
        aj = self.in.nextInt()
        al = self.in.nextInt()
        as_ = self.in.nextInt()
        az = self.in.nextInt()
        ans = 0
        ans += ao
        if (ai % 2 + aj % 2 + al % 2) == 3:
            ans += ai + aj + al
        elif (ai % 2 + aj % 2 + al % 2) == 2:
            if ai != 0 and aj != 0 and al != 0:
                an