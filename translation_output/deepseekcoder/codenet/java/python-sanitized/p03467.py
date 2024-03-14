import sys
from collections import defaultdict

P = 998244353

map = defaultdict(int)

def go(s):
    if not s:
        return 1
    if s in map:
        return map[s]

    ret = (1 + int(s[0])) * go(s[1:]) % P
    x = 1
    while 2 * x <= len(s):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[k * x + i] == '0':
                    buf[i] = '0'
            ret += go("".join(buf)) * go(s[k * x:]) % P
        x += 1

    map[s] = ret % P
    return map[s]

def submit():
    s = nextToken()
    print(go(s))

def preCalc():
    pass

def stress():
    pass

def test():
    pass

def nextToken():
    return sys.stdin.readline().strip()

def nextString():
    return sys.stdin.readline().strip()

def nextInt():
    return int(nextToken())

def nextLong():
    return long(nextToken())

def nextDouble():
    return float(nextToken())

if __name__ == "__main__":
    preCalc()
    submit()
    # stress()
    # test()