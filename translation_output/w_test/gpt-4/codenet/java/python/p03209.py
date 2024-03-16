Here is the equivalent code translated to Python:

```python
import sys

def main():
    n, x = map(int, input().split())
    print(calc(n, x))

def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = calculate_length(n - 1)
    p = calculate_p(n - 1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)
    return sum

def calculate_length(n):
    return 1 + 4 * (2**n - 1)

def calculate_p(n):
    return 1 + 2 * (2**n - 1)

if __name__ == "__main__":
    main()
```

You can use the Python script above to perform the same operations as the Java code. You can run the Python code with the test input by either providing the input directly to the script or by redirecting the input from a file or other source. The sample test case with input "2 7" should return the output "4" when you run the code.
