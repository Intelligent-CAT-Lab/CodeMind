import sys

class FastInput:
    def __init__(self):
        self.bs = sys.stdin.read()
        self.idx = 0

    def next(self):
        while self.bs[self.idx].isspace():
            self.idx += 1
        start = self.idx
        while self.idx < len(self.bs) and not self.bs[self.idx].isspace():
            self.idx += 1
        return self.bs[start:self.idx]

    def next_int(self):
        return int(self.next())

def main():
    sc = FastInput()
    k = sc.next_int() - 1
    b = sc.next_int() - 1
    print(k * b)

if __name__ == "__main__":
    main()