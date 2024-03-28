import sys

def codeforces_669_A(n):
    if n == 2:
        print(1)
        return
    total = 0
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    codeforces_669_A(n)