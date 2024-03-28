Here's the translated code from Java to Python:

```python
def solve():
    N, A, B, C, D = map(int, input().split())

    for i in range(N):
        max_diff = D * (N - 1 - i) - C * i
        min_diff = C * (N - 1 - i) - D * i
        if abs(B - A) >= min_diff and abs(B - A) <= max_diff:
            print("YES")
            return

    print("NO")


if __name__ == "__main__":
    solve()
```

Here is the test case according to the provided input:

Test input:
`5 1 5 2 4`

Expected output:
`YES` (not "YEp" as mentioned in the expected output, because the Java code will output "YES" if the condition is met)

You can run the test case by executing the program and providing the test input. The program should print the expected output to the console.
