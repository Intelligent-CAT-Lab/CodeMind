import sys

class FastReader:
    def __init__(self):
        self.st = []
    
    def next(self):
        while not self.st:
            self.st = input().split()
        return self.st.pop(0)
    
    def nextInt(self):
        return int(self.next())

def codeforces_669_A():
    fr = FastReader()
    n = fr.nextInt()
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