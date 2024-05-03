Here is the Python equivalent of the Java code:

```python
MODULO = 10**9 + 7

def solve(zeroes, ones, k):
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [1] + [0] * ones
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        nice = [False] * (ones + 1)
        for extra in range(0, depth + 1 - i):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
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

This Python code does the same thing as the Java code. It reads the input from the user, calls the `solve` function with the input, and prints the result. The `solve` function is the same as the `solve` function in the Java code, but it uses Python's list comprehension and range functions instead of Java's `Arrays.fill` and `for` loops. The `main` function is the same as the `main` function in the Java code, but it uses Python's `input` function instead of Java's `nextInt` method.
