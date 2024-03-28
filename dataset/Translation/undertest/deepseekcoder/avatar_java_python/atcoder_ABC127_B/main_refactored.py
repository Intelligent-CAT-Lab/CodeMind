class main:
    import sys
    
    def solve():
        r, d, x = map(int, sys.stdin.readline().split())
    
        for _ in range(10):
            x = r * x - d
            print(x)
    
    if __name__ == "__main__":
        solve()