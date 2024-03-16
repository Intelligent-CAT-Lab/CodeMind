import math

class FastScanner:
    def __init__(self):
        self.br = open(0)
        self.st = ""

    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline()
            except:
                pass
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLong(self):
        return int(self.next())

    def nextline(self):
        return None

sc = FastScanner()
s = sc.next()
t = sc.next()
mah = s + t
a = int(mah)
b = int(math.sqrt(a))
if b * b == a:
    print("Yes")
else:
    print("No")