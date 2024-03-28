import sys

class FastReader:
    def __init__(self):
        self.input = []
        
    def next(self):
        if not self.input:
            self.input = sys.stdin.readline().strip().split()
        return self.input.pop(0)
    
    def read_int(self):
        return int(self.next())

def codeforces_669_A():
    fr = FastReader()
    n = fr.read_int()
    total = 0

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