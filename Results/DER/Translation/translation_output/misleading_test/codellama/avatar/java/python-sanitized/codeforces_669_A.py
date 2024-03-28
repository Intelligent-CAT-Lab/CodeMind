import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                pass
        return self.st.pop(0)

    def readArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
        return a

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

def codeforces_669_A(args):
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

if __name__ == "__main__":
    codeforces_669_A(sys.argv[1:])