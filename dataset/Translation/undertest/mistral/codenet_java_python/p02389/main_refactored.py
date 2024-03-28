class main:
    import sys
    
    def solve():
        a, b = map(int, sys.stdin.readline().split())
        print(a*b, 2*a+2*b)
    
    if __name__ == "__main__":
        in = sys.stdin
        out = sys.stdout
        Solution = solve
        Solution()