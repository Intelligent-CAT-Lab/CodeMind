import math
import sys
def rem(a, b, c):
    if a % 2 != 0 or b % 2 != 0 or c % 2 != 0:
        return False
    else:
        return True
def isDouble(a, b, c):
    if (a%1!=0 or b%1!=0 or c%1!=0):
        return False
    else:
        return True
a, b, c = map(int, "4 12 20".split())
cnt = 0
fa = a
fb = b
fc=c
while True:
    if (cnt != 0 and fa == a and fb == b and fc == c):
        print(-1)
        sys.exit()
    tmp1 = a / 2
    tmp2 = b / 2
    tmp3 = c / 2
    if (not isDouble(tmp1, tmp2, tmp3)):
        break
    cnt += 1
    a = tmp2 + tmp3
    b = tmp1 + tmp3
    c = tmp1 + tmp2
    if (not rem(a, b, c)):
        break
print(cnt)
