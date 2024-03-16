import sys

class SC:
    def __init__(self, inp=sys.stdin):
        self.reader = inp

    def next(self):
        return self.reader.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


def pl(o):
    print(o)


def p(o):
    print(o, end='')


MOD = 1000000007
sc = SC()
n = sc.next_long()
k = sc.next_long()
ans = 1
for _ in range(n):
    ans = (ans * k) % MOD
pl(ans)