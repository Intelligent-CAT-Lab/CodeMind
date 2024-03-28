import sys

class MyScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.next()


def main():
    sc = MyScanner()
    sys.stdout = open(1, 'w')
    l = sc.next_int()
    k = sc.next_int()
    dp = [[0]*(l+1) for _ in range(2)]
    dp[0][0] = 1
    for i in range(1, l+1):
        dp[0][i] += dp[1][i-1]
        dp[1][i] += dp[0][i-1]
        if i >= k:
            dp[1][i] += dp[0][i-k]
    ans = 0
    for i in range(1, l+1):
        ans += dp[1][i]
    print(ans)

if __name__ == "__main__":
    main()