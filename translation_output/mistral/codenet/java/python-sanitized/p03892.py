import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def solve():
    a, b = map(int, input().split())
    a, b = abs(a - ni()), abs(b - ni())
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

def ni():
    res = 0
    b = -1
    while ((b = readByte()) != -1 and not ((b >= '0' and b <= '9') or b == '-')):
        pass
    if b == '-':
        res = -1
        b = readByte()
    for b in range(10):
        res = res * 10 + (b - '0')
    return res

def nl():
    res = 0
    b = -1
    while ((b = readByte()) != -1 and not ((b >= '0' and b <= '9') or b == '-')):
        pass
    if b == '-':
        res = -1
        b = readByte()
    for b in range(10):
        res = res * 10 + (b - '0')
    return res

def main():
    solve()
    out.flush()

if __name__ == '__main__':
    main()

private static InputStream in = sys.stdin
private static PrintWriter out = sys.stdout

def inrange(y, x, h, w):
    return y >= 0 and y < h and x >= 0 and x < w

@SuppressWarnings("unchecked")
def lower_bound(list, key):
    lower = -1
    upper = len