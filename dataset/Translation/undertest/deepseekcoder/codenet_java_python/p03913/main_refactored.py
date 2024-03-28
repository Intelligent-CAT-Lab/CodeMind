class main:
    import math
    
    def run():
        n, a = map(int, input().split())
        solver(n, a)
    
    def solver(n, a):
        ans = n
        for m in range(2, 41):
            c = int(pow(n,