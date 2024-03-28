Here's the translated code from Java to Python:

```python
# In Python, we don't need import statements for basic functionality

if __name__ == "__main__":
    # Taking two long input integers, equivalent to x and y in the Java code.
    x, y = map(int, input().split())
    
    # If statement checking whether x is divisible by y,
    # if true, it prints -1 else it prints the value of x.
    if x % y == 0:
        print(-1)
    else:
        print(x)
```

Additional notes:

1. In Python, we don't have to specify the data type as we do in Java. Python is dynamically-typed, so it will infer that `x` and `y` are integers.

2. The `%` operator in Python behaves the same way as in Java.

3. The `print` function in Python replaces `out.println` used in Java to display the output.

4. The `if __name__ == "__main__":` line checks if the module is being run directly, which is similar to the way the `public static void main` method works in Java. It's a common practice to put code that should run when the module is executed directly in this `if` block.

5. I used `map(int, input().split())` to read two integers from a single line of input. Java's `Scanner` class method `nextLong()` is analogously replaced with a cast to `int` in Python. While Python's `int` type is not identical to Java's `long` type, Python's `int` has a variable size and can handle arbitrarily large integers, effectively similar to `BigInteger` in Java.
