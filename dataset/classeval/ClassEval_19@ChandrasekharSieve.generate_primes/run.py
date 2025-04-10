import os
import unittest
class ChandrasekharSieve:
    def __init__(self, n):
        self.n = n
        self.primes = self.generate_primes()

    def generate_primes(self):
        if self.n < 2:
            return []

        sieve = [True] * (self.n + 1)
        sieve[0] = sieve[1] = False

        p = 2
        while p * p <= self.n:
            if sieve[p]:
                for i in range(p * p, self.n + 1, p):
                    sieve[i] = False
            p += 1

        primes = []
        for i in range(2, self.n + 1):
            if sieve[i]:
                primes.append(i)

        return primes

    def get_primes(self):
        return self.primes
class Test(unittest.TestCase):
    def test(self):
            cs = ChandrasekharSieve(10)
            res = cs.generate_primes()
            return res
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_19@ChandrasekharSieve.generate_primes/output.txt', 'w') as wr:
    wr.write(str(a))
        