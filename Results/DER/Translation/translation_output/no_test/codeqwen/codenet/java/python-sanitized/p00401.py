import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = []
        self.index = 0

    def read(self):
        if self.index >= len(self.buffer):
            self.buffer = self.file.readline().split()
            self.index = 0
        return self.buffer[self.index]

    def next_int(self):
        return int(self.read())

    def next_line(self):
        return self.file.readline().strip()

def main():
    sc = FastScanner(sys.stdin)
    out = sys.stdout

    input = sc.next_int()
    ans = 1
    while input >= ans*2:
        ans *= 2

    out.write(str(ans))
    out.flush()

if __name__ == "__main__":
    main()