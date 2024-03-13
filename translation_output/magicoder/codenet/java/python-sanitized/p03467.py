import sys

P = 998244353

map = {}

def go(s):
    if not s:
        return 1
    if s in map:
        return map[s]

    ret = (1 + ord(s[0]) - ord('0')) * go(s[1:]) % P
    for x in range(1, len(s) // 2 + 1):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[k * x + i] == '0':
                    buf[i] = '0'
            ret += go(''.join(buf)) * go(s[k * x:]) % P

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

def main():
    preCalc()
    submit()
    # stress()
    # test()

if __name__ == '__main__':
    main()