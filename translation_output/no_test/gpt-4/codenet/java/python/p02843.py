Here is the translated Python code from the provided Java code:

```python
def main():
    x = int(input())
    if x % 100 <= x // 100 * 5:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```

Keep in mind that the division operator in Python (`/`) performs floating-point division, which is why for integer division (to match Java's behavior), the floor division operator (`//`) is used instead. Also, Python does not have a built-in equivalent to Java's Scanner class, so `input()` is used to read input from the console as a string, and `int()` is then used to convert that input to an integer.
