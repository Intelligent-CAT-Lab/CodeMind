Here's the translated Python code:

```python
def main():
    solver()

def solver():
    M = int(input())
    N = int(input())
    m0 = int(input())
    md = int(input())
    n0 = int(input())
    nd = int(input())
    m = [0] * M
    n = [0] * N
    m[0] = m0
    n[0] = n0

    for i in range(1, M):
        m[i] = (m[i - 1] * 58 + md) % (N + 1)
    for i in range(1, N):
        n[i] = (n[i - 1] * 58 + nd) % (M + 1)

    m = sort_values(m, N)
    n = sort_values(n, M)

    accumN = [0] * (N + 1)
    accumM = [0] * (M + 1)
    for i in range(N):
        accumN[i + 1] = accumN[i] + n[i]
    for i in range(M):
        accumM[i + 1] = accumM[i] + m[i]

    cur = N
    sum_val = accumM[0] + accumN[cur] + (N - cur) * (M - 0)
    for i in range(M + 1):
        while cur >= 1 and accumM[i] + accumN[cur] + (N - cur) * (M - i) >= accumM[i] + accumN[cur - 1] + (N - (cur - 1)) * (M - i):
            cur -= 1
        sum_val = min(sum_val, accumM[i] + accumN[cur] + (N - cur) * (M - i))

    print(sum_val)

def sort_values(a, max_value):
    counter = [0] * (max_value + 1)
    for value in a:
        counter[value] += 1
    pos = 0
    for i in range(len(counter)):
        while counter[i] > 0:
            a[pos] = i
            pos += 1
            counter[i] -= 1
    return a

def tr(*objects):
    print(objects)

if __name__ == "__main__":
    main()
```

In the Python version, we use lists in place of arrays, and we directly use the `min()` function instead of `Math.min()` from Java. The Python code also uses `input()` to capture user input instead of using a `Scanner` instance, and a `for` loop together with `range()` for iteration. Lastly, the `sort_values` function replaces the `sort` method from the original Java code. Please note, this function will work provided that all values in the list are non-negative and less than or equal to `max_value`.
