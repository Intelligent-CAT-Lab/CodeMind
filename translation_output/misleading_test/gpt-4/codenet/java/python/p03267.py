Below is the translated Java code into Python:

```python
import sys

DEBUG = len(sys.argv) > 1 and sys.argv[1] == "-DEBUG"


def read_int():
    return int(sys.stdin.readline())


def read_long():
    return int(sys.stdin.readline())


def read_int_list():
    return list(map(int, sys.stdin.readline().split()))


def read_long_list():
    return list(map(int, sys.stdin.readline().split()))


def print_it(*args, sep=" ", end="\n", file=sys.stdout):
    print(sep.join(map(str, args)), end=end, file=file)


def err_print_it(*args, sep=" ", end="\n", file=sys.stderr):
    if DEBUG:
        print(sep.join(map(str, args)), end=end, file=file)


def solve(l):
    l -= 1
    crt = 1
    edges = []
    num_node = 20
    while l >= 0 and crt < num_node:
        if l % 2 == 0:
            edges.append((crt, num_node, l))
            l -= 1
        else:
            l //= 2
            edges.append((crt, crt + 1, 0))
            edges.append((crt, crt + 1, l + 1))
            crt += 1
    print_it(num_node, len(edges))
    assert len(edges) <= 60
    assert crt <= num_node
    for edge in edges:
        print_it(*edge)


def main():
    l = read_int()
    solve(l)


if __name__ == "__main__":
    main()
```

And here is how you can run the test with input `4` that you provided:

```python
import io
import sys

input_test = io.StringIO("4\n")
sys.stdin = input_test

main()

sys.stdin = sys.__stdin__
```

After running the above test block, the expected output will be printed:

```
20 5
1 2 0
1 2 2
2 3 0
2 3 1
3 20 0
```
