import sys

def main():
    input = sys.stdin
    output = sys.stdout
    solver = ATwoProblems()
    solver.solve(1, input, output)

class ATwoProblems:
    def solve(self, testNumber, input, output):
        points = int(input.readline())
        t = int(input.readline())
        a = int(input.readline())
        b = int(input.readline())
        ta = int(input.readline())
        tb = int(input.readline())
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                    output.write("YES\n")
                    return
        output.write("NO\n")

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