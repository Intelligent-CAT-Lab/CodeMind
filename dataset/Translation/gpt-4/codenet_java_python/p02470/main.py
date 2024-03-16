import sys

class Euler:
    def __init__(self, n):
        self.phi = list(range(n+1))
        for i in range(2, n+1):
            if self.phi[i] == i:
                for j in range(i, n+1, i):
                    self.phi[j] = self.phi[j] // i * (i - 1)

    def totient(self, n):
        return self.phi[n]

    @staticmethod
    def totient_long(n):
        i = n
        phi = n
        if i % 2 == 0:
            phi = phi // 2
            while i % 2 == 0:
                i //= 2
        if i % 3 == 0:
            phi = phi // 3 * 2
            while i % 3 == 0:
                i //= 3
        for j in range(1, sys.maxsize):
            tmp = j * 6 - 1
            if tmp * tmp > n:
                break
            if i % tmp == 0:
                phi = phi // tmp * (tmp - 1)
                while i % tmp == 0:
                    i //= tmp

            tmp = j * 6 + 1
            if tmp * tmp > n:
                break
            if i % tmp == 0:
                phi = phi // tmp * (tmp - 1)
                while i % tmp == 0:
                    i //= tmp
        if i != 1:
            phi = phi // i * (i - 1)

        return phi

def solve():
    n = int(input())
    if n < 1000000:
        euler = Euler(n)
        print(euler.totient(n))
    else:
        print(Euler.totient_long(n))

def main():
    solve()

if __name__ == "__main__":
    main()