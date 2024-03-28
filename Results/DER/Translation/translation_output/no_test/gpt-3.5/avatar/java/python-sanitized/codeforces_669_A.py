import sys

class FastReader:
    def __init__(self):
        self.st = iter(input().split())
    
    def next(self):
        while True:
            try:
                return next(self.st)
            except StopIteration:
                self.st = iter(input().split())
    
    def read_array(self, n):
        return [self.next() for _ in range(n)]
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())

def codeforces_669_A():
    fr = FastReader()
    n = fr.next_int()
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
    codeforces_669_A()