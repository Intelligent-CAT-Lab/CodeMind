class main:
    class KMPAutomaton:
        def __init__(self, cap):
            self.data = [None] * (cap + 2)
            self.fail = [-1] + [0] * (cap + 1)
            self.buildLast = 0
            self.matchLast = 0
            self.length = cap
            
        def visit(self, c, trace):
            while trace >= 0 and self.data[trace + 1] != c:
                trace = self.fail[trace]
            return trace
    
        def build(self, c):
            self.buildLast += 1
            self.fail[self.buildLast] = self.visit(c, self.fail[self.buildLast - 1]) + 1
            self.data[self.buildLast] = c
    
        
    def solve(s):
        n = len(s)
        kmp = KMPAutomaton(n)
        inv = KMPAutomaton(n)
        for i in range(n):
            kmp.build(s[i])
            inv.build(s[n - i - 1])
        p = n - kmp.fail[n]
        if n % p != 0:
            p = n
    
        if p == 1:
            print(n, 1)
            return
        if p == n:
            print(1, 1)
            return
        cnt = 0
        for i in range(2, n + 1):
            p1 = i - 1 - kmp.fail[i - 1]
            p2 = (n + 1 - i) - inv.fail[n + 1 - i]
            f1 = p1 == (i - 1) or (i - 1) % p1 != 0
            f2 = p2 == (n + 1 - i) or (n + 1 - i) % p2 != 0
            if f1 and f2:
                cnt += 1
    
        print(2, cnt)
    
    
    # Testing the code with the provided input
    test_input = "aab"
    solve(test_input)