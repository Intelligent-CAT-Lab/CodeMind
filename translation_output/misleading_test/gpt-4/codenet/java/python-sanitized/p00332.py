import sys

class Methods:
    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        while b > 0:
            a, b = b, a % b
        return a

    def lcm(self, a, b):
        return (a // self.gcd(a, b)) * b

    def factorial(self, i):
        return 1 if i == 1 else i * self.factorial(i - 1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return ((x2 - x1)**2 + (y2 - y1)**2) ** 0.5

    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(n**0.5) + 1, 2):
            if n % i == 0:
                return False
        return True

def solve(e, y):
    if e == 0:  # seireki
        if 1868 <= y <= 1911:  # meiji
            print("M" + str(y - 1867))
        elif 1912 <= y <= 1925:  # taishou
            print("T" + str(y - 1911))
        elif 1926 <= y <= 1988:  # shouwa
            print("S" + str(y - 1925))
        else:  # heisei
            print("H" + str(y - 1988))
    elif e == 1:  # meiji
        print(1867 + y)
    elif e == 2:  # taishou
        print(1911 + y)
    elif e == 3:  # shouwa
        print(1925 + y)
    elif e == 4:  # heisei
        print(1988 + y)

if __name__ == "__main__":
    e, y = map(int, sys.stdin.readline().strip().split())
    solve(e, y)