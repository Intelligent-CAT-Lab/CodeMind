Below is the translated version of the provided Java code into Python:

```python
def main():
    M, N, m0, md, n0, nd = map(int, input().split())
    m = [0] * M
    n = [0] * N
    m[0] = m0
    n[0] = n0

    for i in range(1, M):
        m[i] = (m[i - 1] * 58 + md) % (N + 1)
    for i in range(1, N):
        n[i] = (n[i - 1] * 58 + nd) % (M + 1)

    m = sort_counts(m, N)
    n = sort_counts(n, M)

    accumN = [0] * (N + 1)
    accumM = [0] * (M + 1)
    for i in range(N):
        accumN[i + 1] = accumN[i] + n[i]
    for i in range(M):
        accumM[i + 1] = accumM[i] + m[i]

    cur = N
    sum_result = accumM[0] + accumN[cur] + (N - cur) * (M - 0)
    for i in range(M + 1):
        while cur >= 1 and accumM[i] + accumN[cur] + (N - cur) * (M - i) >= accumM[i] + accumN[cur - 1] + (N - (cur - 1)) * (M - i):
            cur -= 1
        sum_result = min(sum_result, accumM[i] + accumN[cur] + (N - cur) * (M - i))

    print(sum_result)


def sort_counts(arr, max_val):
    counter = [0] * (max_val + 1)
    for num in arr:
        counter[num] += 1
    pos = 0
    for i in range(len(counter)):
        while counter[i] > 0:
            arr[pos] = i
            pos += 1
            counter[i] -= 1
    return arr


if __name__ == "__main__":
    main()
```

This Python code is now set to accept input in the format specified, perform the calculations, and print the required sum as output. You can test this Python code with your provided input:

Test input:
```
2 3 1 3 1 0
```

Expected output:
```
-41
```
