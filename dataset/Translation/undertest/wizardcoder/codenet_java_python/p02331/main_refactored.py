class main:
    import sys
    
    class p02331:
        def __init__(self):
            self.sc = self.SC(sys.stdin)
    
        def main(self):
            MOD = 1000000007
            n = self.sc.nextLong()
            k = self.sc.nextLong()
            ans = 1
            for i in range(n):
                ans = (ans * k) % MOD
            self.pl(ans)
    
        def pl(self, o):
            print(o)
    
        def p(self, o):
            print(o, end='')
    
        class SC:
            def __init__(self, f):
                self.r = f.readline
    
            def next(self):
                try:
                    return self.r().strip()
                except:
                    return None
    
            def nextInt(self):
                return int(self.next())
    
            def nextLong(self):
                return long(self.next())
    
            def nextDouble(self):
                return float(self.next())
    
            def nextLine(self):
                return self.r()
    
    p02331().main()