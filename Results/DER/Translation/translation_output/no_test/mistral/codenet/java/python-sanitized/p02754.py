import sys

n = int(input())
a = int(input())
b = int(input())

ans = (n / (a + b)) * a + min(a, n % (a + b))

print(ans)


class FastScanner:
    def __init__(self, stream):
        self.br = None
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = self.br.readline().split()
            except Exception as e:
                e.printStackTrace()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())