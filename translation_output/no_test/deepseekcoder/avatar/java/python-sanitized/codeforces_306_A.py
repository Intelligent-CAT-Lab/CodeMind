import sys
import math

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    fr = FastReader()
    n = fr.next_double()
    m = fr.next_double()
    for i in range(int(m - (n % m))):
        print(int(n / m), end=" ")
    for i in range(int(m - (n % m)), int(m)):
        print(math.ceil(n / m), end=" ")
    print()

if __name__ == "__main__":
    main()