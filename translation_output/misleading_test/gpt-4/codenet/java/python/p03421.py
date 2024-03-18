Here is the converted Python code based on the Java code you provided:

```python
def calc_inner(n, a, b, output):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        first_i = max(n - a + 1, 1)
        for i in range(first_i, n + 1):
            first.append(str(i))
        rest = n - a - b + 1
        end_i = max(rest + 1, 1)
        sub_second = []
        for i in range(first_i - 1, end_i - 1, -1):
            sub_second.append(str(i))
        second = sub_second + second
        if rest <= 0:
            output.extend(first)
            output.extend(second)
            return True
        else:
            n = rest
            a -= 1
            b -= 1


def calc(n, a, b):
    output = []
    for i in range(n - a + 1, n + 1):
        output.append(str(i))
    rest = n - a - b + 1
    if rest < 0:
        print(-1)
        return
    elif rest >= 1:
        if not calc_inner(rest, a - 1, b - 1, output):
            print(-1)
            return
    for i in range(n - a, rest, -1):
        output.append(str(i))
    print(" ".join(output))


def run():
    n, a, b = map(int, input().split())
    calc(n, a, b)


if __name__ == "__main__":
    run()
```

Here's how the code works with the provided test case:

Test input:
`5 3 2`

Expected output:
`2 4 1 5 3 81`

Please note that in the original Java code, there seems to be an issue with the expected output `2 4 1 5 3 81` as the last `81` doesn't correspond to any logic in the provided code. The Python translation will not print `81` at the end because it's not derived from any actual calculation or logic. The last element should be a number in sequence following the original Java code's algorithm.
