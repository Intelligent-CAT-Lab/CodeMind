Below is the translated Python version of the given Java code. I've removed certain parts related to the input/output since in Python, we could just use the `input()` function and print statements directly. Additionally, I translated the DFS logic and the matrix handling, making the necessary syntax adjustments to fit Python conventions:

```python
def main():
    n = int(input())
    ret = [[0] * n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        print(*ret[i][i + 1:], sep=" ")

def dfs(left, right, level, ret):
    if left + 1 >= right:
        return

    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

if __name__ == "__main__":
    main()
```

To test this with the input `3`, you would run the `main()` function (after uncommenting the last two lines) and input `3` when prompted. The expected output as per the given test case would be:

```
1 2
1
```
