Here's the provided Java code translated into Python:

```python
def solve(N, x):
    ans = [None] * (2 * N - 1)
    if N == 2:
        return [1, 2, 3]

    if x == 2:
        ans[N - 2] = 2 * N - 1
        ans[N - 1] = 2
        ans[N] = 1
        ans[N + 1] = 2 * N - 2
        elm = 3
        for index in range(2 * N - 1):
            if ans[index] is None:
                ans[index] = elm
                elm += 1
    else:
        ans[N - 2] = 1
        ans[N - 1] = x
        ans[N] = 2 * N - 1
        ans[N + 1] = 2
        elm = 3
        for index in range(2 * N - 1):
            if elm == x:
                elm += 1
            if ans[index] is None:
                ans[index] = elm
                elm += 1
    return ans


def main():
    N = int(input())
    x = int(input())

    if x == 1 or x == 2 * N - 1:
        print("No")
        return
    else:
        print("Yes")

    ans = solve(N, x)
    for i in ans:
        print(i)


if __name__ == "__main__":
    main()
```

In the above Python code, the `main` function handles the input and output similar to the Java code. The `solve` function follows the same logic and structure as the Java version. Note that in Python, the array (list) index starts from 0 unlike Java's 1-based so the logic was adjusted accordingly. The `if __name__ == "__main__"` block ensures that `main` is called when the script is executed directly.
