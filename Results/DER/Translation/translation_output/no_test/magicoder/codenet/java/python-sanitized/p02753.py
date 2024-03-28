#  author : Atul Anand   
#  created on : Tue Mar 31 2020

import sys

class Reader:
    def __init__(self):
        self.input = sys.stdin.readline().strip()

    def next(self):
        return self.input

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.input

    def close(self):
        pass

def read(arr, N):
    for i in range(N):
        arr[i] = in.nextInt()

def print(O):
    sys.stdout.write(str(O))

def println(O):
    sys.stdout.write(str(O) + '\n')

def println(arr):
    for i in arr:
        print(i, end=' ')
    println("")

def println(arr):
    for i in arr:
        println(i)

def debug(O):
    println(O)

in = Reader()
S = in.next()
if S[0] == S[1] and S[1] == S[2]:
    println("No")
else:
    println("Yes")
in.close()