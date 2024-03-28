class main:
    import sys
    
    mod = 1000000007
    
    class In:
        def __init__(self):
            self.reader = sys.stdin
            self.tokenizer = None
    
        def next(self):
            if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = iter(next(self.reader).split())
            return next(self.tokenizer)
    
        def nextInt(self):
            return int(self.next())
    
    class Out:
        def __init__(self):
            self.out = sys.stdout
    
        def println(self, *args):
            print(*args, file=self.out)
    
    def solve():
        in_obj = In()
        out = Out()
    
        ai = in_obj.nextInt()
        ao = in_obj.nextInt()
        at = in_obj.nextInt()
        aj = in_obj.nextInt()
        al = in_obj.nextInt()
        as_ = in_obj.nextInt()
        az = in_obj.nextInt()
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
        out.println(ans)
    
    if __name__ == "__main__":
        solve()