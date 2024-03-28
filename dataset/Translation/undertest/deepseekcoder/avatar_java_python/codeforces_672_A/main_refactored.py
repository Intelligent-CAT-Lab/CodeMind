class main:
    def codeforces_672_A(n):
        s = " "
        for i in range(1, n + 1):
            s += str(i)
        return int(s[n - 1])
    
    print(codeforces_672_A(952))