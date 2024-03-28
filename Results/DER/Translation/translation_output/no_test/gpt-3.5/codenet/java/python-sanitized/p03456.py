import sys
from io import StringIO
import math

class FastScanner:
    def __init__(self, input_data):
        self.input_data = input_data.split()
        self.pointer = 0

    def next(self):
        result = self.input_data[self.pointer]
        self.pointer += 1
        return result

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return int(self.next())

    def nextline(self):
        return None

def main(input_data):
    sc = FastScanner(input_data)
    s, t = sc.next(), sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    input_data = sys.stdin.read()
    main(input_data)