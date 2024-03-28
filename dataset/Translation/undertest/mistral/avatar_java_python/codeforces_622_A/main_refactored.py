class main:
    import sys
    
    n1 = int(input())
    n = int((int(1 + 8 * n1) ** 0.5 - 1) / 2)
    ans = n1 - (((n + 1) * n) // 2)
    print(ans if ans != 0 else n)