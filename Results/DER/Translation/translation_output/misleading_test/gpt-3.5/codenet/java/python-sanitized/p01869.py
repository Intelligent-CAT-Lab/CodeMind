class p01869:
    def __init__(self):
        self.hash = {}
    
    def isAll8(self, d):
        while d > 0:
            if d % 10 != 8:
                return False
            d //= 10
        return True
    
    def func(self, n):
        if n in self.hash:
            return self.hash[n]
        
        same = False
        now = n
        res = -1
        maxLen = len(str(n))
        for dlen in range(maxLen, 0, -1):
            for i in range(1 << dlen):
                d = 0
                ten = 1
                for j in range(dlen):
                    if (i & (1 << j)) == 0:
                        d += ten * 8
                    else:
                        d += ten * 2
                    ten *= 10
                if n == d:
                    same = True
                    continue
                if now < d:
                    continue
                if now % d == 0:
                    res = max(res, self.func(now // d) + self.func(d))
        
        if same:
            res = max(res, 1)
        elif res == -1:
            res = -100000000
        
        self.hash[n] = res
        return res
    
    def solve(self):
        n = int(input())
        if n == 1:
            print(-1)
            return
        
        res = self.func(n)
        print(res if res <= -1 else -1)
    
    def run(self):
        self.solve()

if __name__ == "__main__":
    p = p01869()
    p.run()