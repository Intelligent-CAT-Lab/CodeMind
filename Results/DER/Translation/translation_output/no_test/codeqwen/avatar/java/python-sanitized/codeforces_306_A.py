import sys
import math

class FastReader:
    def __init__(self):
        self.br = sys.stdin.readline
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = self.br().split()
        return self.st.pop(0)

    def next_line(self):
        return self.br()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def int_array(self, size):
        return [self.next_int() for _ in range(size)]

    def char_array(self):
        return self.next_line().strip().encode('utf-8')

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    class Compare:
        @staticmethod
        def compare(o1, o2):
            return (o1.y - o2.y)

def main():
    fr = FastReader()
    n = fr.next_double()
    m = fr.next_double()
    for i in range(int(m - (n % m))):
        print(int(n / m), end=" ")
    for i in range(int(m - (n % m)), int(m)):
        print(int(math.ceil(n / m)), end=" ")

if __name__ == "__main__":
    main()