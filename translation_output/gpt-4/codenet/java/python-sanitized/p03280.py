import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def next(self):
        while True:
            self.st = input().split()
            for token in self.st:
                return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        try:
            return self.input_stream.readline().strip()
        except Exception as e:
            raise e

if __name__ == "__main__":
    sc = FastReader()
    k = sc.next_int() - 1
    b = sc.next_int() - 1

    print(k * b)
    sys.stdout.flush()