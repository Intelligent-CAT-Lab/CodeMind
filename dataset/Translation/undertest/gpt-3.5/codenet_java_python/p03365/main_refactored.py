class main:
    MOD = 1000000007
    
    class TaskC:
        @staticmethod
        def solve():
            i = int(input())
            md = [0] * i
    
            rm = i - 2
            lx = i - 2
            while rm >= 0:
                md[lx + 1] = c(rm, lx)
                rm -= 2
                lx -= 1
    
            res = 0
            prev = 0
            for m in range(1, i):
                cur = fact(m) * fact(i - m - 1) % MOD
                cur = cur * md[m] % MOD
    
                res += (cur - prev + MOD) * m % MOD
                prev = cur
    
            return res % MOD
    
    def c(a, b):
        return ifact(a) * ifact(b - a) % MOD * fact(b) % MOD
    
    def fact(n):
        f = 1
        for i in range(1, n + 1):
            f = (f * i) % MOD
        return f
    
    def ifact(n):
        ret = 1
        for i in range(2, n + 1):
            ret = ret * pow(i, MOD - 2, MOD) % MOD
        return ret
    
    if __name__ == '__main__':
        print(TaskC.solve())