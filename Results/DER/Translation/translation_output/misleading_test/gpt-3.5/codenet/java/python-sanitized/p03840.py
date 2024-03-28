import sys

mod = 1000000007
iinf = 0xfffffff
inf = 0xfffffffffffffff

class In:
    def __init__(self):
        self.tokenizer = None
        
    def next(self):
        try:
            while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = iter(input().split())
        except EOFError:
            pass
        return next(self.tokenizer)
        
    def nextInt(self):
        return int(self.next())
        
    def nextLong(self):
        return int(self.next())
        
in_ = In()

ao = in_.nextInt()
ai = in_.nextInt()
at = in_.nextInt()
aj = in_.nextInt()
al = in_.nextInt()
as_ = in_.nextInt()
az = in_.nextInt()

ans = 0
ans += ao

parity_sum = ai % 2 + aj % 2 + al % 2
if parity_sum == 3:
    ans += ai + aj + al
elif parity_sum == 2:
    if ai != 0 and aj != 0 and al != 0:
        ans += ai + aj + al - 1
    else:
        ans += ai + aj + al - 2
elif parity_sum == 1:
    ans += ai + aj + al - 1
else:
    ans += ai + aj + al

print(ans)