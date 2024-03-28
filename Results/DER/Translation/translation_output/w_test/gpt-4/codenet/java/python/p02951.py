Here's the equivalent Python code for the given Java code:

```python
def main():
    a, b, c = map(int, input().split())
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

if __name__ == "__main__":
    main()
```

To run the test case, simply call the `main()` function and input `6 4 3`:

Test input:
```
6 4 3
```

Expected output:
```
1
```
