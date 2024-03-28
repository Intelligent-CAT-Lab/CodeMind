class main:
    import sys
    
    def solve():
        s = input()
        n = len(s)
    
        from_ = 0
        to = n - 1
        for i in range(n):
            if s[i] == 'A':
                from_ = i
                break
        for i in range(n - 1, -1, -1):
            if s[i] == 'Z':
                to = i
                break
    
        print(to - from_ + 1)
    
    solve()