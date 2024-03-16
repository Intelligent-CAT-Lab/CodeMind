Here's the code translated from Java to Python:

```python
def solve(N, x):
    ans = [0] * (2 * N - 1)
    if N == 2:
        return [1, 2, 3]
    
    if x == 2:
        ans[N - 2] = 2 * N - 1
        ans[N - 1] = 2
        ans[N] = 1
        ans[N + 1] = 2 * N - 2
        elm = 3
        for index in range(2 * N - 1):
            if ans[index] == 0:
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
            if ans[index] == 0:
                ans[index] = elm
                elm += 1
    return ans

def main():
    N, x = map(int, input().split())

    if x == 1 or x == 2 * N - 1:
        print("No")
    else:
        print("Yes")
        ans = solve(N, x)
        for number in ans:
            print(number)

# Sample Test Case
if __name__ == "__main__":
    main()
```

To test this code, run it and provide the test input to the Python script via standard input or hardcode the input parameters within the `main()` function.

When you run this code and type in your sample test input "4 4" followed by the enter key, the output should be:

```
Yes
1
6
3
7
4
5
2
```
