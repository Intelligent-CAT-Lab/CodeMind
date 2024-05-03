import sys
import math
import random

MOD = 998244353
#INF = 1000000000000000007
#MOD = 1000000007
#INF = 1000000007

#factorial = [1]
#for i in range(1, 1000001):
#    factorial.append((factorial[-1] * i) % MOD)

def main():
    sc = FastScanner()
    pw = sys.stdout

    N = sc.ni()
    A = sc.ni()
    B = sc.ni()
    pw.write(str(min(A*N, B)))
    pw.close()

def dist(p1, p2):
    return abs(p2[0]-p1[0]) + abs(p2[1]-p1[1])

def gcd(a, b):
    if a < b:
        return gcd(b, a)
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

def shuffle(array):
    rgen = random.Random()
    for i in range(len(array)):
        random_position = rgen.randint(0, len(array) - 1)
        array[i], array[random_position] = array[random_position], array[i]
    return array

def sort(array):
    # Sort an array (immune to quicksort TLE)
    random.shuffle(array)
    array.sort(key=lambda x: (x[0], x[1]))
    return array

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):