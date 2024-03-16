# author : Atul Anand
# created on : Tue Mar 31 2020

import sys

class Reader:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = ""

    def next(self):
        while not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.reader.readline().strip()

    def close(self):
        self.reader.close()

in = Reader()

MIN = -(10**9)
MAX = 10**9

def read(arr, N):
    for i in range(N):
        arr[i] = in.nextInt()

def print_out(O):
    print(O, end='')

def println(O):
    print(O)

S = in.next()
if S[0] == S[1] == S[2]:
    println("No")
else:
    println("Yes")

in.close()