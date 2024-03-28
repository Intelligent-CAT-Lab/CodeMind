class main:
    import sys
    
    class p02879:
        def __init__(self):
            self.scan = Scanner(sys.stdin)
    
        def solve(self):
            A = self.scan.nextInt()
            B = self.scan.nextInt()
            if 9 < A or 9 < B:
                print(-1)
                return
            print(A * B)
    
    if __name__ == '__main__':
        main = p02879()
        main.solve()