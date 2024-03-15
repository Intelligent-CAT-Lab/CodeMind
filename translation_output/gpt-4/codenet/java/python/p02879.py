Below is the translated code from the provided Java code to Python:

```python
import sys

class p02879:
    def solve(self):
        # This assumes the input is given in the same line separated by a space.
        # If inputs are in different lines, replace "input()" with "sys.stdin.readline()"
        A, B = map(int, input().split())
        if A > 9 or B > 9:
            print(-1)
        else:
            print(A * B)

if __name__ == "__main__":
    main = p02879()
    main.solve()
```

Note that in Python, we don't need to import Scanner or BufferedReader to read input from stdin. We can simply use `input()` for most cases, or if we expect high performance when using with large inputs, `sys.stdin.readline()`.

Keep in mind that in competitive programming or some other cases, you might want to strip the newline character when reading with `sys.stdin.readline()` by using `rstrip()`. The line would then be: `A, B = map(int, sys.stdin.readline().rstrip().split())`.
