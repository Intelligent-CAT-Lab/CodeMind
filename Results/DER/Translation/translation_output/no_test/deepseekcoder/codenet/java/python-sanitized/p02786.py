import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def nextLine(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        return self.br.readline().strip()

def main():
    s = FastReader()
    h = s.nextLong()
    if h == 1:
        print(1)
    else:
        count = 1
        sum = 1
        while h > 1:
            h = h // 2
            sum += pow(2, count)
            count += 1
        print(sum)

if __name__ == "__main__":
    main()