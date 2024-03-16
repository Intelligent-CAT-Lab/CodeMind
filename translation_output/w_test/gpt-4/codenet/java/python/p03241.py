Below is the Python version of the given Java code, followed by test input and expected output applied to the translated code:

```python
def main():
    n, m = map(int, input().split())
    for i in range(m // n, 0, -1):
        if m % i == 0:
            print(i)
            break

# Test the function with the provided input
main()
```

Test input:
`3 14`

Expected output:
`2`
