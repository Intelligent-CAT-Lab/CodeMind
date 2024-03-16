#package com.atcoder.contest174.a;

import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                pass
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLong(self):
        return long(self.next())

def main():
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()