import sys

class FastReader:
    def __init__(self):
        self.lines = sys.stdin.readlines()
        self.index = 0

    def nextLine(self):
        line = self.lines[self.index]
        self.index += 1
        return line.strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        return self.nextLine()


def main():
    s = FastReader()
    h = s.nextLong()
    if h == 1:
        print(1)
    else:
        sum_val = 0
        count = 1
        while h > 1:
            h = h // 2
            sum_val += 2**count
            count += 1
        print(sum_val + 1)

if __name__ == "__main__":
    main()