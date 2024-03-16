class FastScanner:
    def __init__(self):
        self.inp = input().split()

    def nextInt(self):
        return int(self.inp[0])

    def nextLong(self):
        return long(self.inp[0])

    def next(self):
        return self.inp[0]


def main():
    sc = FastScanner()
    n = sc.nextInt()
    m = sc.nextInt()
    if n % 2 == 0:
        print(0, end="")
        for i in range(1, n // 2):
            print(" 0", end="")
        for i in range(n // 2, n):
            print(" " + str(m), end="")
    else:
        print(0, end="")
        for i in range(1, n // 2):
            print(" 0", end="")
        for i in range(n // 2, n):
            print(" " + str(m), end="")
    print()


if __name__ == "__main__":
    main()