import sys
import io


def solver():
    n = ni()
    x = ni()
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

def main():
    global INPUT
    is = INPUT.strip() if INPUT else sys.stdin
    out = sys.stdout

    solver()
    out.flush()

def nl():
    try:
        num = int(is.readline())
        return num
    except:
        return -1

def ni():
    try:
        num = int(is.readline())
        return num
    except:
        return -1

def ns():
    try:
        num = is.readline().strip()
        return num
    except:
        return ""

def nse(n):
    try:
        num = is.read(n)
        return num
    except:
        return None

def tr(o):
    if INPUT.strip():
        print(o)

if __name__ == "__main__":
    main()