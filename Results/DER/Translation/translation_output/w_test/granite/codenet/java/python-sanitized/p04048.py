import sys

def solver():
    n, x = map(int, input().split())
    if x == n - x:
        print(3 * x)
        return
    if x > n - x:
        print(x + n - x + calc(x, n - x, False))
        return
    print(x + n - x + calc(x, n - x, False))

def calc(x, y, first):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y, False)
        return sum

if __name__ == "__main__":
    solver()