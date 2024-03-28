class main:
    class BigInt:
        def __init__(self, N):
            self.N = list(map(int, str(N)))
    
        def multiply(self, n):
            self.N = list(map(int, str(int(''.join(map(str, self.N))) * n)))
    
        def add(self, n):
            self.N = list(map(int, str(int(''.join(map(str, self.N))) + n)))
    
        def digitSum(self):
            return sum(self.N)
    
        def clone(self):
            return BigInt(''.join(map(str, self.N)))
    
    def canMake(n, bigint):
        bigint.add(n)
        return bigint.digitSum() <= n
    
    def solve(N):
        n = len(N)
        bigint = BigInt(N)
        bigint.multiply(9)
    
        ok = n * 10
        ng = 0
        while abs(ok - ng) > 1:
            med = (ok + ng) // 2
            if canMake(med, bigint.clone()):
                ok = med
            else:
                ng = med
        return (ok + 8) // 9
    
    N = input()
    print(solve(N))