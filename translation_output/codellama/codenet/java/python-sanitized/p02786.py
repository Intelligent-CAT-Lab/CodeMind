import math

class FastReader:
    def __init__(self):
        self.br = open(0)

    def next_line(self):
        return self.br.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next(self):
        while True:
            token = next(self.st, None)
            if token:
                return token
            try:
                self.st = iter(self.br.readline().strip().split())
            except StopIteration:
                break

class p02786:
    def __init__(self):
        self.s = FastReader()

    def main(self):
        h = self.s.next_long()
        if h == 1:
            print(1)
        else:
            count = 1
            while h > 1:
                h = h // 2
                sum = sum + math.pow(2, count)
                count += 1
            print(sum + 1)

if __name__ == "__main__":
    p02786().main()