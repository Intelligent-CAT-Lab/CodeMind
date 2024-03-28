import sys

class MyScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreElements():
            try:
                self.st = sys.stdin.readline()
            except IOError:
                print("Error reading from standard input")
                sys.exit(1)
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline()

class p00957:
    def __init__(self):
        self.sc = MyScanner()
        self.out = sys.stdout

    def main(self):
        l = self.sc.nextInt()
        k = self.sc.nextInt()
        dp = [[0] * (l + 1) for _ in range(2)]
        dp[0][0] = 1
        for i in range(1, l + 1):
            dp[0][i] += dp[1][i - 1]
            dp[1][i] += dp[0][i - 1]
            if i >= k:
                dp[1][i] += dp[0][i - k]
        ans = 0
        for i in range(1, l + 1):
            ans += dp[1][i]
        self.out.write(str(ans) + "\n")
        self.out.close()

if __name__ == "__main__":
    p00957().main()