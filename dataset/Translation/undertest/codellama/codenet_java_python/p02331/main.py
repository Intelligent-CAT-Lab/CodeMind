import sys

class SC:
    def __init__(self, inp):
        self.reader = inp
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except UncheckedIOException as e:
                raise e
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        try:
            return self.reader.readLine()
        except UncheckedIOException as e:
            raise e

MOD = 1000000007

n = SC(sys.stdin).nextLong()
k = SC(sys.stdin).nextLong()
ans = 1
for i in range(n):
    ans = (ans * k) % MOD

print(ans)