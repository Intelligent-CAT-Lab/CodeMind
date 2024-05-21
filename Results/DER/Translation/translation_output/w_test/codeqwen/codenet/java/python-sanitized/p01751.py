import sys

class Reader:
    def __init__(self):
        self.inp = sys.stdin.readline

    def nextInt(self):
        return int(self.inp().strip())

    def nextLine(self):
        return self.inp().strip()

    def close(self):
        sys.stdin.close()

def main():
    sc = Reader()
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d and (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    sc.close()

if __name__ == "__main__":
    main()