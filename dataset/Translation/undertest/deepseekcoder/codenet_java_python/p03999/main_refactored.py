class main:
    def helper(n):
        if n == 0:
            return 1
        return 2 ** (n - 1)
    
    def p03999():
        s = input()
        ans = 0
        for dx in range(len(s)):
            for start in range(len(s) - dx):
                cur = int(s[start:start + dx + 1])
                ans += cur * (helper(start) * helper(len(s) - dx - start - 1))
        print(ans)
    
    p03999()