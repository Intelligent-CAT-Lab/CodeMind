```python
import sys

MOD = 998244353

def dist(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])

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
    import random
    for i in range(len(array)):
        randomPosition = random.randint(0, len(array) - 1)
        temp = array[i]
        array[i] = array[randomPosition]
        array[randomPosition] = temp
    return array

def main():
    N, A, B = map(int, input().split())
    print(min(A * N, B))


if __name__ == "__main__":
    main()
```

