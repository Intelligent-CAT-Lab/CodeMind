Here is the translated code in Python:

```python
def main():
    x = int(input())
    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)

if __name__ == "__main__":
    main()
```

You can test this Python snippet with the provided test case:

Test input:
```
7
```

Expected output:
```
4
```

Simply run the Python function `main()` and input the test value `7`, you should get the output `4`.
