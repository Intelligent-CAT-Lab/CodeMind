import sys

def calc(n, a, b):
    output = []
    for i in range(n - a + 1, n + 1):
        output.append(str(i))
    rest = n - a - b + 1
    if rest < 0:
        print(-1)
        return
    elif rest >= 1:
        if not calc_inner(rest, a - 1, b - 1, output):
            print(-1)
            return
    for i in range(n - a, rest - 1, -1):
        output.append(str(i))
    print(" ".join(output))

def calc_inner(n, a, b, output):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        first_i = n - a + 1 if n - a + 1 >= 1 else 1
        for i in range(first_i, n + 1):
            first.append(str(i))
        rest = n - a - b + 1
        end_i = rest + 1 if rest + 1 >= 1 else 1
        sub_second = [str(i) for i in range(first_i - 1, end_i - 1, -1)]
        second = sub_second + second
        if rest <= 0:
            output.extend(first + second)
            return True
        else:
            n = rest
            a -= 1
            b -= 1

def main():
    n = int(sys.stdin.readline().split()[0])
    a = int(sys.stdin.readline().split()[0])
    b = int(sys.stdin.readline().split()[0])
    calc(n, a, b)

if __name__ == "__main__":
    main()