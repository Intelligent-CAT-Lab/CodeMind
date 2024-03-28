import sys

class FastReader:
    def __init__(self):
        self.stdin_iterator = iter(sys.stdin.read().splitlines())

    def next(self):
        return next(self.stdin_iterator)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

def main():
    fr = FastReader()
    n = fr.next_int()
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

if __name__ == "__main__":
    main()