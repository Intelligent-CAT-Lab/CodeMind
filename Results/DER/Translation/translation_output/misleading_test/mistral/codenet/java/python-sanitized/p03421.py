import sys

def calc(n, a, b):
    output = []
    for i in range(n - a + 1, n + 1):
        output.append(i)
    rest = n - a - b + 1
    if rest < 0:
        return [-1]
    elif rest >= 1:
        if not calc_inner(rest, a - 1, b - 1):
            return [-1]
    else:
        output.append(rest)
    return output

def calc_inner(n, a, b):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        first_i = max(1, n - a + 1)
        for i in range(first_i, n + 1):
            first.append(i)
        rest = n - a - b + 1
        end_i = max(1, rest + 1)
        second.append(first[-1])
        for i in range(first_i - 1, end_i):
            second.append(i)
        first.pop()
        second.insert(0, second)
        if rest <= 0:
            return True
        n = rest
        a -= 1
        b -= 1
    return False

if __name__ == "__main__":
    n, a, b = map(int, sys.stdin.readline().strip().split())
    print(" ".join(map(str, calc(n, a, b))))