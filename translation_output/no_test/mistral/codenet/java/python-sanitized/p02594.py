# package com.atcoder.contest174.a;

import sys

x = int(sys.stdin.readline())
if x >= 30:
    print("Yes")
else:
    print("No")

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except:
                pass
        return self.st[0]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [int(self.nextInt()) for _ in range(n)]
        return a

    def nextLong(self):
        return long(self.next())