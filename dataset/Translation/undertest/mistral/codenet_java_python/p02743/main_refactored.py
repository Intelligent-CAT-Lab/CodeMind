class main:
    import sys
    
    def solve():
        a, b, c, d = map(int, sys.stdin.readline().split())
        if d > 0 and 4 * a * b < d * d:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        solve()