import sys
import math

P = 998244353

def go(s):
    if s == "":
        return 1
    if s in map:
        return map[s]

    ret = (1 + int(s[0]) - '0') * go(s[1:]) % P
    for x in range(1, int(math.ceil(len(s) / 2))):
        buf = list(s[:x])
        for k in range(2, int(math.ceil(len(s) / x))):
            for i in range(x):
                if s[k * x + i] == '0':
                    buf[i] = '0'
            ret += go(buf) * go(s[k * x:]) % P

    iret = int(ret % P)
    map[s] = iret
    return iret

def submit():
    s = sys.stdin.readline().strip()
    print(go(s))

def preCalc():
    pass

def stress():
    pass

def test():
    pass

if __name__ == "__main__":
    submit()