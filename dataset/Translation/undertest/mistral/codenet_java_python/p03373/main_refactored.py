class main:
    import sys
    
    def solve():
        a, b, c, x, y = map(int, sys.stdin.readline().strip().split())
        min = sys.maxsize
        for i in range(max(x, y) + 1):
            tmp