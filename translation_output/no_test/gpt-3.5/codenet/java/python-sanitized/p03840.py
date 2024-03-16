import sys

class In:
    def __init__(self):
        self.tokenizer = None

    def next(self):
        return input()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

class Out:
    def __init__(self):
        pass

    def println(self, *args):
        print(*args)

    def flush(self):
        sys.stdout.flush()

class p03840:
    def __init__(self):
        self.inp = In()
        self.out = Out()
        self.mod = 1000000007
        self.iinf = 0xfffffff
        self.inf = 0xfffffffffffffff

    def solve(self):
        ai = self.inp.nextInt()
        ao = self.inp.nextInt()
        at = self.inp.nextInt()
        aj = self.inp.nextInt()
        al = self.inp.nextInt()
        _as = self.inp.nextInt()
        az = self.inp.nextInt()
        ans = 0
        ans += ao
        if ai % 2 + aj % 2 + al % 2 == 3:
            ans += ai + aj + al
        elif ai % 2 + aj % 2 + al % 2 == 2:
            if ai != 0 and aj != 0 and al != 0:
                ans += ai + aj + al - 1
            else:
                ans += ai + aj + al - 2
        elif ai % 2 + aj % 2 + al % 2 == 1:
            ans += ai + aj + al - 1
        else:
            ans += ai + aj + al
        self.out.println(ans)

    def main(self):
        self.solve()
        self.out.flush()

if __name__ == '__main__':
    p = p03840()
    p.main()