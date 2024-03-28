Below is the translated Python code from the provided Java code. I've used the built-in input function to read from standard input, and the print function to output the results. In Python, there's no need to explicitly import a Scanner class as in Java.

```python
def main():
    a, b = map(int, input().split())
    if a <= 0 <= b:
        print("Zero")
    else:
        print("Positive" if (min(0, b) - min(-1, a)) % 2 == 1 else "Negative")


if __name__ == "__main__":
    main()
```
Here's how the example test case would work with this script:

Test input:
```
1 3
```

Expected output:
```
Positive
```
