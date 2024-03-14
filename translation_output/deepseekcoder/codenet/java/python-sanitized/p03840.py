import sys

class p03840:
    def __init__(self):
        self.inp = sys.stdin
        self.out = sys.stdout
        self.mod = 1000000007
        self.iinf = 0xfffffff
        self.inf = 0xfffffffffffffffL

    def solve(self):
        ai = int(self.inp.readline())
        ao = int(self.inp.readline())
        at = int(self.inp.readline())
        aj = int(self.inp.readline())
        al = int(self.inp.readline())
        as_ = int(self.inp.readline())
        az = int(self.inp.readline())
        ans = 0
        ans += ao
        if (ai % 2 + aj % 2 + al % 2) == 3:
            ans += ai + aj + al
        elif (ai % 2 + aj % 2 + al % 2) == 2:
            if ai != 0 and aj != 0 and al != 0:
                ans += ai + aj + al - 1
            else:
                ans += ai + aj + al - 2
        elif (ai % 2 + aj % 2 + al % 2) == 1:
            ans += ai + aj + al - 1
        else:
            ans += ai + aj + al
        self.out.write(str(ans))

if __name__ == "__main__":
    p03840().solve()
    sys.stdout.flush()