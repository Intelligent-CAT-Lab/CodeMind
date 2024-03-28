class main:
    import sys
    
    def solve():
        a, b = map(int, sys.stdin.readline().split())
        if a == b:
            return a * 2
        elif a > b:
            return a * 2 - 1
        else:
            return b * 2 - 1
    
    print(solve())