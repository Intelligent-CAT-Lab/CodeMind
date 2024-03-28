import sys
import random

MOD = 998244353

def main():
    input_values = input().split()
    N, A, B = map(int, input_values)
    print(min(A*N, B))

def dist(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def power(x, y, m):
    if y < 0:
        return 0
    ans = 1
    x %= m
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % m
        y //= 2
        x = (x * x) % m
    return ans

def shuffle_array(array):
    random.shuffle(array)
    return array

def sort_2d_array(array):
    array.sort(key=lambda e: (e[0], e[1]))
    return array

if __name__ == "__main__":
    main()