import sys

def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)

def db(os):
    print(os)

def p03248():
    c = sys.stdin.readline().strip()
    l = len(c)

    if c[0] == '0' or c[l-1] == '1':
        print(-1)
        return
    else:
        for i in range(l//2):
            if c[i] != c[l-i-2]:
                print(-1)
                return

    print(1, 2)

    for i in range(3, l+1):
        print(i, i)
        if c[i-2] == '1':
            i = i

if __name__ == '__main__':
    p03248()