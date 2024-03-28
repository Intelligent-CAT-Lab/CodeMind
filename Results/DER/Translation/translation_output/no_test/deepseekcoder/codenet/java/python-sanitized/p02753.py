import sys

class p02753:

    def __init__(self):
        self.MIN = -sys.maxsize - 1
        self.MAX = sys.maxsize
        self.in_ = Reader()
        self.out = sys.stdout

    def main(self):
        S = self.in_.next()
        if S[0] == S[1] and S[1] == S[2]:
            self.println("No")
        else:
            self.println("Yes")
        self.in_.close()
        self.out.close()

    def read(self, arr, N):
        for i in range(N):
            arr[i] = self.in_.nextInt()

    def read(self, arr, N):
        for i in range(N):
            arr[i] = self.in_.nextLong()

    def read(self, arr, N):
        for i in range(N):
            arr[i] = self.in_.next()

    def print(self, O):
        self.out.write(str(O))

    def println(self, O):
        self.out.write(str(O) + '\n')

    def println(self, arr):
        for i in arr:
            self.print(i + " ")
        self.println("")

    def println(self, arr):
        for i in arr:
            self.println(i)

    def debug(self, O):
        print(O)


class Reader:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while True:
            if not self.tokenizer or not self.tokenizer.hasMoreTokens():
                self.tokenizer = shlex.shlex(self.reader.readline())
            yield self.tokenizer.get_token()

    def nextInt(self):
        return int(next(self))

    def nextDouble(self):
        return float(next(self))

    def nextLong(self):
        return long(next(self))

    def nextLine(self):
        return self.reader.readline().strip()

    def close(self):
        self.reader.close()


if __name__ == "__main__":
    p02753().main()