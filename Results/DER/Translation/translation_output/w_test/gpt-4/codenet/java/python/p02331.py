Here's the conversion of the given Java code to Python:

```python
class SC:
    def __init__(self):
        self.tokens = []
        self.current_index = 0

    def next(self):
        while not self.tokens:
            self.tokens = input().split(' ')
        token = self.tokens[self.current_index]
        self.current_index += 1
        if self.current_index >= len(self.tokens):
            self.tokens = []
            self.current_index = 0
        return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())  # In Python, there's no distinct type for long integers like in Java.

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return input()

def main():
    sc = SC()
    MOD = 1000000007
    n = sc.next_long()
    k = sc.next_long()
    ans = 1
    for i in range(n):  # In Python, range generates a sequence of integers
        ans = (ans * k) % MOD
    print(ans)

if __name__ == '__main__':
    main()
```

Note: I've removed all the print and print line methods that Java had (`pl` and `p`), as Python has a built-in `print` function.

**How this works**: We've defined a class `SC` similar to the Java class for taking input. The `next`, `next_int`, `next_long`, etc., methods work similarly to the Java class methods. The `main` function demonstrates how to solve the problem following a similar approach to the Java `main` method.

The `next_long()` is used in both cases for `n` and `k` but returns `int` in Python, as Python automatically handles big integers and does not differentiate between `int` and `long `data types. Additionally, the `MOD` value is kept the same, and the modular exponentiation logic is processed in a loop using the range function.

The test case specified (2 3) should be provided as standard input to the Python program, and it will output 9 to the console as expected.
