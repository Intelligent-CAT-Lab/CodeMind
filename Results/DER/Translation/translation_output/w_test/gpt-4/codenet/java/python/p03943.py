Here is the translated Python code:

```python
def main():
    a, b, c = map(int, input().split())

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()
```

To use the code, simply run the main function and it will accept the input in the format specified in the test case (three space-separated numbers on one line), then produce the expected output.

For the test case provided with "10 30 20" as the input, it would print "Yes" as the output. The Java Scanner class's functionality for reading input is replaced by Python's built-in `input()` function in combination with `map()` and `int()` to obtain the integer values. There is no need to replicate the `FastScanner` in Python since the built-in functions are sufficient for this task.
