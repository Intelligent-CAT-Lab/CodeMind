import sys

class FastReader:
    def __init__(self):
        self.lines = sys.stdin.readlines()
        self.pointer = 0

    def next_int(self):
        self.pointer += 1
        return int(self.lines[self.pointer - 1])

    def next_double(self):
        self.pointer += 1
        return float(self.lines[self.pointer - 1])

if __name__ == '__main__':
    fr = FastReader()
    n = fr.next_double()
    m = fr.next_double()
    
    for i in range(0, int(m - (n % m))):
        print(int(n // m), end=' ')
    
    for i in range(int(m - (n % m)), int(m)):
        print(int(-(-n // m)), end=' ')