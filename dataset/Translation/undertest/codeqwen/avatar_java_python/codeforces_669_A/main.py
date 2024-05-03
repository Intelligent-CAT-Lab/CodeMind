class FastReader:
    def __init__(self):
        self.br = open(0)
        self.st = ''

    def next(self):
        while not self.st:
            self.st = self.br.readline().strip()
        self.st, self.st = self.st.split(' ', 1)
        return self.st

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def codeforces_669_A():
    fr = FastReader()
    n = fr.nextInt()
    sum = 0
    total = 0
    i = 1
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

codeforces_669_A()