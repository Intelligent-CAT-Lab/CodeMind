import sys
import math

MOD = 1000000007


class Combinatrics:
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)


def main():
    n, k = map(int, sys.stdin.readline().split())
    c = Combinatrics(n-1)
    
    print(c.homogeneous(k, n - k))


# Using this to prevent stack overflow in Python as per Java original thread creation
if __name__ == '__main__':
    sys.setrecursionlimit(100000)  # Just an example, should be set according to the problem needs
    thread_size = 16 * 1024 * 1024  # Simulating increased stack size of the thread
    # No direct translation for threading with stack size change in python, the line below is a placeholder
    # new_thread = threading.Thread(target=main, args=(), kwargs={}, daemon=None, stack_size=thread_size)
    # new_thread.start()
    main()  # Simply calling the main function instead