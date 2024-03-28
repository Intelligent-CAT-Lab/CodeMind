import sys

def calc(n, a, b):
    output = []
    for i in range(n - a + 1, n + 1):
        output.append(i)
    rest = n - a - b + 1
    if rest < 0:
        print(-1)
        return
    elif rest >= 1:
        if not calc_inner(rest, a - 1, b - 1):
            print(-1)
            return
    for i in range(n - a, rest, -1):
        output.append(i)
    print(*output)

def calc_inner(n, a, b):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        firstI = n - a + 1 if n - a + 1 >= 1 else 1
        for i in range(firstI, n + 1):
            first.append(i)
        rest = n - a - b + 1
        endI = rest + 1 if rest + 1 >= 1 else 1
        subSecond = []
        for i in range(firstI - 1, endI - 1, -1):
            subSecond.append(i)
        second = subSecond + second
        if rest <= 0:
            output.extend(first)
            output.extend(second)
            return True
        else:
            n = rest
            a -= 1
            b -= 1

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    calc(n, a, b)

if __name__ == "__main__":
    main()