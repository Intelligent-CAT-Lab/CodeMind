Here's the Java code translated to Python:

```python
def main():
    N, K = map(int, input().split())

    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1**3 + c2**3)
    else:
        c = N // K
        print(c**3)

if __name__ == "__main__":
    main()
```

When given the input `3 2`, this Python program should produce the output `9`.
