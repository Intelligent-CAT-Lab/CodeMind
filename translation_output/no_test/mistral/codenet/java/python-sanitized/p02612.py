import sys

def solve(n, in, out):
    x = n // 1000
    y = n % 1000
    if y == 0:
        out.write("0\n")
    else:
        ans = 1000 * (x + 1) - n
        out.write(str(ans) + "\n")

def main():
    in = sys.stdin
    out = sys.stdout
    solver = TaskA()
    solver.solve(1, in, out)

class TaskA:
    def solve(self, testNumber, in, out):
        n = in.readline().strip()
        solve(int(n), in, out)

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except:
                raise RuntimeError()
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

if __name__ == "__main__":
    main()