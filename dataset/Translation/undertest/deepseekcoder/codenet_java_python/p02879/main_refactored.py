class main:
    import sys
    
    def solve():
        A, B = map(int, sys.stdin.readline().split())
        if A > 9 or B > 9:
            print(-1)
            return
        print(A * B)
    
    if __name__ == "__main__":
        solve()