import sys

def get(a):
    ret = 0
    now = 1
    t = 1

    while True:
        if now * 10 > a:
            ret += (a - now + 1) * t
            break

        ret += now * 9 * t
        now *= 10
        t += 1

    return ret

def binarySearch(k, l, r, x):
    if r >= l:
        mid = l + (r - l) // 2

        if mid > ans and mid * k <= x:
            global ans
            ans = mid

        if k * mid == x:
            return mid

        if k * mid > x:
            return binarySearch(k, l, mid - 1, x)

        return binarySearch(k, mid + 1, r, x)

    return -1

def main():
    gen, st, tim = map(int, sys.stdin.readline().split())
    gen //= tim
    beg, end = 0, 10**18

    while True:
        med = (beg + end) // 2 + 1

        if get(med) - get(st - 1) > gen:
            end = med - 1
        else:
            beg = med

        if beg == end:
            print(beg - st + 1)
            break

if __name__ == "__main__":
    main()