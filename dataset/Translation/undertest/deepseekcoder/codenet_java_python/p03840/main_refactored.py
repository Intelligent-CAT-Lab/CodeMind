class main:
    import sys
    
    class p03840:
        def __init__(self):
            self.inp = sys.stdin.readline().split()
            self.out = sys.stdout
            self.mod = 1000000007
            self.iinf = 0xfffffff
            self.inf = 0xfffffffffffffffL
    
        def solve(self):
            ai = int(self.inp[0])
            ao = int(self.inp[1])
            at = int(self.inp[2])
            aj = int(self.inp[3])
            al = int(self.inp[4])
            as_ = int(self.inp[5])
            az = int(self.inp[6])
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