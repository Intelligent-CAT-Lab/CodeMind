import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            line = self.br.readline()
            self.st = line.split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        arr = [self.next_int() for _ in range(n)]
        return arr

    def next_long(self):
        return int(self.next())

if __name__ == '__main__':
    fs = FastScanner()
    x = fs.next_int()
    if x >= 30:
        print("Yes")
    else:
        print("No")