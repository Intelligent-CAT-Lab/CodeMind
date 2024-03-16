Here's the translated code from Java to Python:

```python
def p03292():
    T = int(input())
    R = int(input())
    Y = int(input())

    A = max(T, R, Y)
    B = min(T, R, Y)

    print(A - B)

if __name__ == "__main__":
    p03292()
```

Keep in mind that Python's `input()` function reads an entire line from the input, whereas Java's `Scanner.nextInt()` only reads the next integer. You might need to adapt the input to match the expectations of your application, especially if all three integers are provided in one line. If that's the case, you could modify the input gathering in Python as follows:

```python
def p03292():
    nums = [int(x) for x in input().split()]  # Assuming T, R, Y are given in one line, separated by space.
    T, R, Y = nums[0], nums[1], nums[2]

    A = max(T, R, Y)
    B = min(T, R, Y)

    print(A - B)

if __name__ == "__main__":
    p03292()
```
