Here is the Python equivalent of the given Java code:

```python
def main():
    S = input()
    ans = 0
    if len(S) % 2 == 0:
        if S[len(S) // 2 - 1] != S[len(S) // 2]:
            print(len(S) // 2)
            return
        else:
            S = S[:len(S) // 2] + S[len(S) // 2 + 1:]
            ans = 1

    mid = len(S) // 2
    for i in range(1, mid + 1):
        if mid + i == len(S) or S[mid + i] != S[mid] or S[mid - i] != S[mid]:
            ans += mid + i
            break

    print(ans)

if __name__ == "__main__":
    main()
```
Note: In Python, strings are zero-indexed, and the `substring` method in Java is replaced by slice notation in Python. Also, the `print` function is used in Python instead of `System.out.println`. The main function is wrapped in a `main` function and then called under the `if __name__ == "__main__":` condition to mimic Java's behavior.
