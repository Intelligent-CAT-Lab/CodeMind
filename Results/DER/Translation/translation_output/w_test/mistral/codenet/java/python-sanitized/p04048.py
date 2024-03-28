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

def solver():
    n = int(input())
    x = int(input())
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        if x > n - x:
            sum += x + n - x
            sum += calc(x, n - x, False)
        else:
            sum += x + n - x
            sum += calc(x, n - x, False)
        print(sum)
        return

if __name__ == '