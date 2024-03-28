class main:
    import sys
    
    def solve():
        n, m = map(int, sys.stdin.readline().split())
        if n == 2 or m == 2:
            print(0)
            return
        ans = max(1, n - 2) * max(1, m - 2)
        print(ans)
    
    if __name__ == "__main__":
        solve()