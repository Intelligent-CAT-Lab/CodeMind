class main:
    import sys
    
    class p03419:
        def __init__(self):
            self.in_ = sys.stdin
    
        def solve(self):
            n, m = map(int, self.in_.readline().split())
            if n == 2 or m == 2:
                print(0)
                return
            ans = max(1, n - 2) * max(1, m - 2)
            print(ans)
    
        def main(self):
            self.solve()
    
    if __name__ == '__main__':
        p03419().main()