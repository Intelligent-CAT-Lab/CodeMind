Below is the translated Java code to Python:

```python
import sys

MODULO = int(1e9 + 7)

def solve(zeroes, ones, k):
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        nice = [False] * (ones + 1)
        for extra in range(depth + 1 - i):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in reversed(range(ones + 1)):
            if ways[old] != 0:
                for cur in range(1, min(k, ones - old + 1)):
                    if nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    ways[old + cur] += ways[old]
                    if ways[old + cur] >= MODULO:
                        ways[old + cur] -= MODULO
    return res

def main():
    zeroes = int(input())
    ones = int(input())
    k = int(input())
    print(solve(zeroes, ones, k))

if __name__ == "__main__":
    main()
```
To use this code, please note that the input format is expected line by line (first zeroes, then ones, and finally k) and will produce a single line of output with the result. Keep in mind that, unlike Java, Python does not have a defined main entry point, so the `if __name__ == "__main__":` construct is used to execute the main function when the script is run directly.
