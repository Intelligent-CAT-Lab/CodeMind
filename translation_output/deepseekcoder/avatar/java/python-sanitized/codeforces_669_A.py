import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            self.st = self.br.readline().split()
        return self.st.pop(0)

    def read_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_int()
        return a

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

def codeforces_669_A():
    fr = FastReader()
    n = fr.next_int()
    total = 0
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            n -= 2
        total += 1
    print(total)

codeforces_669_A()