import sys

class p02766:
    MOD = int(1e9+7)

    def ceil(self, a, b):
        return (a + b - 1) // b

    def gcd(self, a, b):
        return b if a % b == 0 else self.gcd(b, a % b)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def solve(self):
        N, K = map(int, sys.stdin.readline().split())
        base = 1
        cnt = 0
        while base <= N:
            cnt += 1
            base *= K
        print(cnt)

if __name__ == "__main