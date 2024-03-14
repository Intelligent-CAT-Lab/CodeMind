import sys
import re
import math

def main():
    s = input()
    arr = list(s)
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0]*6
    for c in arr:
        if c == '+':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = ord(c) - ord('0')
                if plus:
                    keis[v] = num
                else:
                    keis[v] = -num
                si = False
            else:
                num = num * 10 + ord(c) - ord('0')
    if plus:
        keis[0] = num
    else:
        keis[0] = -num
    ji = 0
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break
    ans = [0]*ji
    for i in range(1, abs(keis[0])+1):
        result = 0
        for j in range(6):
            result += pow(i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = -i
        result = 0
        for j in range(6):
            result += pow(-i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = i
    ans.sort()
    sb = ""
    for i in range(ji):
        sb += "(x"
        if ans[i] >= 0:
            sb += "+"
        sb += str(ans[i]) + ")"
    print(sb)

if __name__ == "__main__":
    main()