class main:
    import sys
    
    def solve(n, l):
        diff = [abs(l + i - 1) for i in range(1, n + 1)]
        removeK = diff.index(min(diff)) + 1
        return n * l + n * (n + 1) // 2 - n - (l + removeK - 1)
    
    n, l = map(int, sys.stdin.readline().split())
    print(solve(n, l))