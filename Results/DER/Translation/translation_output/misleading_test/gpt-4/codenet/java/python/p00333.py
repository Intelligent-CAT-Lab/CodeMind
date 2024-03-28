Here's the equivalent code in Python:

```python
def gcd(x, y):
    while y != 0:
        x, y = y, x % y
    return x

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W // WH) * (H // WH)
    print(a * C)

if __name__ == "__main__":
    main()
```

This Python script is expected to behave the same as the Java program provided. To run the test case, you would execute the Python script and enter the test input (`10 20 5`) to get the expected output (`-5`). Note that the actual behavior may not produce `-5` as this is calculated from the input, and the gcd calculation should not result in a negative number for positive input values. 

However, in the given Java code, the output will actually be `20`, because `(W/WH)*(H/WH)` gives `2*10`, which, when multiplied by `C` (5), yields 100. There might be a mistake in the provided test expectation as both Java and Python code should provide the same numeric output for the same input.
