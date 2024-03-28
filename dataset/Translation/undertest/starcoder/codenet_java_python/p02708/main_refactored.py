class main:
    import sys
    
    MOD = 1000000007
    
    class Mas:
        def __init__(self, x, y, step):
            self.x = x
            self.y = y
            self.step = step
    
    def pow(l, i):
        if i == 0:
            return 1
        else:
            if i % 2 == 0:
                val = pow(l, i / 2)
                return val * val % MOD
            else:
                return pow(l, i - 1) * l % MOD
    
    def main():
        fs = sys.stdin
        n = int(fs.readline())
        k = int(fs.readline())
        ans = 0
        for i in range(k, n + 1):
            f = i * (i - 1) / 2
            l = (n * 2 - i + 1) * i / 2
            add = l - f + 1
            ans = (ans + add) % MOD
        print(ans)
    
    if __name__ == '__main__':
        main()