import java.util

class p03828:

    def __init__(self):
        self.MOD = 1000000007

    def main(self, args):
        sc = java.util.Scanner(System.in)
        n = sc.nextInt()
        ex = [0] * 1001
        for i in range(2, n+1):
            pfs = self.primeFactorize(i)
            for pf in pfs:
                for e in pf.entrySet():
                    ex[e.getKey()] += e.getValue()
        ans = 1
        for i in range(2, n+1):
            ans *= ex[i] + 1
            ans %= self.MOD
        print(ans)

    def primeFactorize(self, n):
        res = []
        for a in range(2, n+1):
            if n % a != 0:
                continue
            ex = 0
            while n % a == 0:
                ex += 1
                n /= a
            res.append(dict(a=a, ex=ex))
        if n != 1:
            res.append(dict(n=n, ex=1))
        return res

if __name__ == '__main__':
    p03828().main(sys.argv[1:])