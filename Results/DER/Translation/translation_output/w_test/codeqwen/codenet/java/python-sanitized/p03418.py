import sys
import math

def gcd(a, b):
    # 最大公約数
    if a % b == 0:
        return b
    return gcd(b, a % b)

def lcm(a, b):
    # 最小公倍数
    gcd_value = gcd(a, b)
    return b // gcd_value * a

def count(array):
    # 連続要素のカウント
    result = {}
    l = 0
    r = 0
    while l < len(array):
        while r < len(array) - 1 and array[r] == array[r + 1]:
            r += 1
        result[array[l]] = r - l + 1
        r += 1
        l = r
    return result

def to_string_bws(iterable):
    iterator = iter(iterable)
    return to_string_bws(iterator)

def to_string_bws(iterator):
    sb = ""
    sb += next(iterator)
    while iterator.has_next():
        sb += " "
        sb += next(iterator)
    return sb

def factoring_in_prime_numbers(n, a):
    # 素因数分解
    for i in range(2, len(a)):
        while n % i == 0:
            a[i] += 1
            n //= i
    return n

def is_valid_cell(i, j, h, w):
    return 0 <= i < h and 0 <= j < w

n, k = map(int, input().split())
ans = 0
for b in range(k + 1, n + 1):
    ans += (n // b) * (b - k) + max(0, (n % b) - k + 1) - (k == 0)
print(ans)