Here's the translated code from Java to Python. I've maintained the logic and structure as close as possible to the original Java code you provided:

```python
def help(K, A, B):
    if A <= B:
        return 1 if A >= K else -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + (0 if (K - A) % dif == 0 else 1)
    return 2 * t + 1


def main():
    K, A, B = map(int, input().split())
    ans = help(K, A, B)
    print(ans)


if __name__ == "__main__":
    main()
```

You can test this Python code with the given input:

Test input:
```
4000 2000 500
```

Expected output:
```
5
```
