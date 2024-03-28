class main:
    import sys
    
    def solve():
        a, b, c, x, y = map(int, input().split())
        min = sys.maxsize
        for i in range(max(x, y) + 1):
            tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
            min = min if min < tmp else tmp
        print(min)
    
    solve()