Here's the Java code translated to Python. Please note that Python does not have the same stream-based I/O by default, so I am assuming that the input will be given directly to the program, which would be the typical Python practice. The translated code uses Python's built-in I/O functionality for this purpose.

```python
def solver():
    n, x = map(int, input().split())
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        sum += x + (n - x)
        sum += calc(x, n - x, False)
        print(sum)
        return


def calc(x, y, first):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y, False)
        return sum


if __name__ == "__main__":
    solver()
```

Sample usage with the provided test case would be:

```shell
# Run the program
python p04048.py
# Then input on console:
5 2
# Expected output:
12
```

Given the understanding that the input should be run from the terminal or another source of input after starting the program.
