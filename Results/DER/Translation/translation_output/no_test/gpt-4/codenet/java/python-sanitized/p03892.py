import sys
import io
import atexit

buffer = io.BytesIO()
sys.stdout = buffer

@atexit.register
def write():
    sys.__stdout__.write(buffer.getvalue().decode("utf-8"))


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def solve():
    a = ni()
    b = ni()
    a = abs(ni() - a)
    b = abs(ni() - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)


def lower_bound(lst, key):
    lower = -1
    upper = len(lst)
    while upper - lower > 1:
        center = (upper + lower) // 2
        if lst[center] >= key:
            upper = center
        else:
            lower = center
    return upper


def upper_bound(lst, key):
    lower = -1
    upper = len(lst)
    while upper - lower > 1:
        center = (upper + lower) // 2
        if lst[center] > key:
            upper = center
        else:
            lower = center
    return upper


def next_permutation(lst):
    def swap(i, j):
        lst[i], lst[j] = lst[j], lst[i]
    
    i = len(lst) - 2
    while i >= 0 and lst[i] >= lst[i + 1]:
        i -= 1
    if i < 0:
        return False
    j = len(lst) - 1
    while lst[i] >= lst[j]:
        j -= 1
    swap(i, j)
    i += 1
    j = len(lst) - 1
    while i < j:
        swap(i, j)
        i += 1
        j -= 1
    return True


def inrange(y, x, h, w):
    return 0 <= y < h and 0 <= x < w


def ni():
    return int(ns())


def nl():
    return int(ns())


def ns():
    return sys.stdin.readline().strip()


def nia(n):
    return [ni() for _ in range(n)]


def nla(n):
    return [nl() for _ in range(n)]


if __name__ == "__main__":
    solve()