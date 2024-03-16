import sys
import io
import os

class TaskA:
    def solve(self, n):
        x = n // 1000
        y = n % 1000
        if y == 0:
            print(0)
        else:
            ans = 1000 * (x + 1) - n
            print(ans)

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(input().split())
            except EOFError:
                return None
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

def main():
    task = TaskA()
    input_reader = InputReader(sys.stdin)
    n = input_reader.nextInt()
    task.solve(n)

if __name__ == "__main__":
    main()