import sys
import io

sys.stdin = io.StringIO("""
""")

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
    solver()

def ni():
    try:
        num = 0
        minus = False
        while ((num = sys.stdin.read(1)) != "" and not ((num >= '0' and num <= '9') or num == '-')):
            pass
        if num == '-':
            num = 0
            minus = True
        else:
            num = ord(num) - ord('0')
        while True:
            b = sys.stdin.read(1)
            if b == "" or not (b >= '0' and b <= '9'):
                return -num if minus else num
            num = num * 10 + ord(b) - ord('0')
    except Exception:
        return -1

if __name__ == "__main__":
    main()