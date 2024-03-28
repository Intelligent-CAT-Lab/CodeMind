import math

def main():
    insn = GetInput.getArrayInt()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c//b
    tt = c%b
    y = a//d
    u = a%d
    while(a >=0 or c>=0):
        c = c - b
        if (c <=0):
            print("Yes")
            return
        a = a - d
        if (a<=0):
            print("No")
            return

class GetInput:
    @staticmethod
    def getArrayInt():
        return list(map(int, input().split()))

    @staticmethod
    def getInt():
        return int(input())

    @staticmethod
    def getLongInput():
        return long(input())

    @staticmethod
    def getLongArrayInput():
        return list(map(long, input().split()))