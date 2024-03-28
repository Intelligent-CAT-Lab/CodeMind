import java.util

class atcoder_ABC169_D:
    def __init__(self):
        pass

    def main(self, args):
        sc = java.util.Scanner(System.in)
        N = sc.nextLong()
        factors = self.primeFactor(N)
        count = 0
        for i in range(len(factors)):
            pow = factors[i]
            increase = 1
            while pow - increase >= 0:
                pow -= increase
                increase += 1
                count += 1
        print(count)

    def primeFactor(self, N):
        res = []
        for i in range(2, int(N ** 0.5) + 1):
            count = 0
            while N % i == 0:
                N /= i
                count += 1
            if count != 0:
                res.append(count)
        if N != 1:
            res.append(1)
        return res

atcoder_ABC169_D().main(None)