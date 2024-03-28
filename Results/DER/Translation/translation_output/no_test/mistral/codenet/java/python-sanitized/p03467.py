import heapq

P = 998244353

def go(s):
    if len(s) == 0:
        return 1
    if s in map:
        return map[s]

    ret = (1 + ord(s[0]) - ord('0')) * go(s[1:]) % P
    for x in range(1, len(s) + 1):
        buf = s[:x]
        for k in range(2, x + 1):
            for i in range(x):
                if s[k - 1] * x + i == '0':
                    buf[i] = '0'
            ret += (1 + go(buf) * go(s[k * x:]) % P) % P

    map[s] = ret
    return ret

map = {}

def submit():
    s = input()
    print(go(s))

def preCalc():
    pass

def stress():
    pass

def test():
    pass

if __name__ == '__main__':
    p03467()