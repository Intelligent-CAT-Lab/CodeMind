import sys


def calc_inner(n, a, b):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False, []
        first_i = max(n - a + 1, 1)
        first.extend(range(first_i, n + 1))
        rest = n - a - b + 1
        end_i = max(rest + 1, 1)
        sub_second = list(range(end_i, first_i))
        sub_second.reverse()
        second = sub_second + second
        if rest <= 0:
            return True, first + second
        n = rest
        a -= 1
        b -= 1


def calc(n, a, b):
    output = [i for i in range(n - a + 1, n + 1)]
    rest = n - a - b + 1
    if rest < 0:
        return "-1"
    elif rest >= 1:
        success, inner_output = calc_inner(rest, a - 1, b - 1)
        if not success:
            return "-1"
        output.extend(inner_output)
    output.extend(range(n - a, rest, -1))
    return " ".join(map(str, output))


def main():
    inputs = input().strip().split()
    n, a, b = map(int, inputs)
    print(calc(n, a, b))


if __name__ == "__main__":
    main()