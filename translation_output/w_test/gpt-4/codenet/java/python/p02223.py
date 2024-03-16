Here's the equivalent Python code for the given Java code snippet:

```python
def main():
    N = int(input())
    if N == 1:
        print(1)
        print("0")
    elif N == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(N - 1)
        for i in range(2, N + 1):
            s = ['1'] * i
            s[0] = s[i - 1] = '0'
            print("".join(s))

if __name__ == "__main__":
    main()
```

Test this code within Python with the input prompt.

Test input:
```
2
```

Expected output:
```
2
0
11
```

Just enter the number `2` when prompted, and the Python code should produce the required output.
