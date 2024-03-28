from sys import stdin, stdout
from collections import deque

class Solver:
    def __init__(self, k, n):
        self.k = k
        self.n = n

    def solveK1(self):
        answers = [1] * ((self.n + 1) // 2)
        return answers

    def solveKEven(self):
        answers = [self.k // 2] + [self.k] * (self.n - 1)
        return answers

    def decrement(self, digits):
        i = self.n - 1
        while True:
            if digits[i] > 1:
                digits[i] -= 1
                for j in range(i + 1, self.n):
                    digits[j] = self.k
                return
            elif digits[i] == 1:
                digits[i] -= 1
                return
            i -= 1

    def solveKOdd(self):
        digits = [(self.k + 1) // 2 for _ in range(self.n)]
        for i in range(self.n // 2):
            self.decrement(digits)
        
        answers = [digits[i] for i in range(self.n) if digits[i] > 0]
        return answers

    def solve(self):
        if self.k == 1:
            return self.solveK1()
        elif self.k % 2 == 0:
            return self.solveKEven()
        else:
            return self.solveKOdd()

def execute(reader, out):
    k = reader.nextInt()
    n = reader.nextInt()
    for i in Solver(k, n).solve():
        out.write(str(i) + '\n')

class ContestReader:
    def __init__(self, in_stream):
        self.reader = in_stream.buffer
        self.tokenizer = None

    def read_next(self):
        while self.tokenizer is None or not self.tokenizer:
            line = self.reader.readline().decode()
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)

    def read_int(self):
        return int(self.read_next())

def main():
    reader = ContestReader(stdin)
    out = stdout.buffer
    execute(reader, out)
    out.flush()

if __name__ == '__main__':
    main()