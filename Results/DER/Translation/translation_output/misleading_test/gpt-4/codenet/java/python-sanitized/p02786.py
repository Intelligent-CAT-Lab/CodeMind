import sys
import math

class FastReader:
    def __init__(self):
        self.stdin = sys.stdin

    def next_line(self) -> str:
        return self.stdin.readline().strip()

    def next_int(self) -> int:
        return int(self.next_line())

    def next_long(self) -> int:
        return int(self.next_line())

    def next_double(self) -> float:
        return float(self.next_line())

    def next(self) -> str:
        while True:
            line = self.next_line()
            if line:
                return line
            else:
                raise ValueError("No more input")


def main():
    s = FastReader()
    h = s.next_long()
    if h == 1:
        print(1)
    else:
        sum = 0
        count = 1
        while h > 1:
            h //= 2
            sum += int(math.pow(2, count))
            count += 1
        print(sum + 1)

if __name__ == "__main__":
    main()