import sys

class p03892:
    def gcd(a, b):
        if b == 0:
            return a
        return gcd(b, a % b)

    def solve():
        a = int(sys.stdin.readline())
        b = int(sys.stdin.readline())
        a = abs(int(sys.stdin.readline()) - a)
        b = abs(int(sys.stdin.readline()) - b)
        g = gcd(a, b)
        ans = a // g + b // g - 1
        print(ans * g)

if __name__ == "__main__":
    solve()