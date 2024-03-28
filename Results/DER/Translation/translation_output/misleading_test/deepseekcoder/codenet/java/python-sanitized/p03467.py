import sys

P = 998244353

map = {}

def go(s):
    if len(s) == 0:
        return 1
    if s in map:
        return map[s]

    ret = (1 + int(s[0])) * go(s[1:]) % P
    x = 1
    while 2 * x <= len(s):
        buf = list(s[:x])
        k = 2
        while x * k <= len(s):
            for i in range(x):
                if s[(k - 1) * x + i] == '0':
                    buf[i] = '0'
            ret += go("".join(buf)) * go(s[k * x:]) % P
            k += 1
        x += 1

    iret = int(ret % P)
    map[s] = iret
    return iret

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

def main():
    preCalc()
    submit()
    # stress()
    # test()

if __name__ == '__main__':
    main()