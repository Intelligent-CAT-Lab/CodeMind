import sys

class Scanner:
    def __init__(self):
        self.buf = sys.stdin.read().split()
        self.tokens = self.buf[::-1]

    def next(self):
        return self.tokens.pop()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

scanner = Scanner()

def main():
    s = scanner.next()
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
    print(count)

if __name__ == "__main__":
    main()