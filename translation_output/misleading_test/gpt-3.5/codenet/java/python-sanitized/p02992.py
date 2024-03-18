class FastIO:
    def __init__(self):
        self.buffer = []
        self.buffer_size = 1024
        self.read = 0
        self.length = 0

    def hasNextByte(self):
        if self.read < self.length:
            return True
        self.read = 0
        try:
            self.buffer = input().encode()
            self.length = len(self.buffer)
        except:
            return False
        return self.length > 0

    def readByte(self):
        return self.buffer[self.read] if self.hasNextByte() else -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def isNumber(self, c):
        return ord('0') <= c <= ord('9')

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.read]):
            self.read += 1
        return self.hasNextByte()

    def nextChar(self):
        if not self.hasNextByte():
            raise StopIteration
        char = self.buffer[self.read]
        self.read += 1
        return chr(char)

    def nextInt(self):
        return int(self.next())

    def flush(self):
        pass

io = FastIO()

MOD = 1000000007

N, K = map(int, input().split())
sqrt = int(N ** 0.5)
sqrt = 2 * sqrt - 1 if sqrt * (sqrt + 1) > N else 2 * sqrt
dp = [[0 for _ in range(sqrt)] for _ in range(K)]

for i in range(sqrt):
    dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))

for i in range(1, K):
    for j in range(sqrt - 1, -1, -1):
        sum_ = 0
        for k in range(sqrt - j):
            sum_ = (sum_ + dp[i - 1][sqrt - j - 1 + k]) % MOD
        dp[i][j] = sum_ * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD

ans = sum(dp[K - 1]) % MOD
print(ans)