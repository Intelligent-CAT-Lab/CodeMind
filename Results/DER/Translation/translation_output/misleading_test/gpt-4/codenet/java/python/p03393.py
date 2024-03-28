Below is the translated version of the given Java code into Python:

```python
def next_partial(line: str, cur: str, charset: set) -> str:
    if line[:len(cur)] > cur:
        return None
    if len(line) == len(cur):
        if line < cur:
            return cur
        return None
    for ch in sorted(charset):
        if ch not in cur:
            next_cur = next_partial(line, cur + ch, charset)
            if next_cur:
                return next_cur
    return None


def solve(input_string: str):
    charset = set(chr(i) for i in range(ord('a'), ord('z') + 1))
    for ch in input_string:
        charset.discard(ch)
    if charset:
        return input_string + next(iter(charset))
    if input_string == "zyxwvutsrqponmlkjihgfedcba":
        return "-1"

    return next_partial(input_string, "", set(input_string))


# Sample Test Case
test_input = "atcoder"
print(solve(test_input))
```

As you can see, most of the utility functions and class member variables from the Java class have been removed since they are not needed in the Python solution. The logic inside `solve` and `next` functions have been combined and simplified to fit Python idioms and data structures such as sets and list comprehensions.

To run the script, simply assign `test_input` with the test string and call `print(solve(test_input))`.

Here are a few additional notes on the translation:
- The `TreeSet` collection in Java has been replaced with a Python `set`, taking advantage of Python's built-in set type which already has O(1) average case time complexity for common operations like addition and removal.
- Character iteration and comparisons have been simplified by utilizing Python's powerful string and set manipulation capabilities.
- The `solve` function in Python now directly returns the result, in contrast to the original Java code which used print statements for output.
- Instead of using an input reader and print writer, Python uses simple function arguments and return statements for input-output operations. The test case is directly provided in the script for demonstration purposes.
- Certain auxiliary functions (like `abs`, `max`, `min`, etc.) present in the Java code have not been translated as Python has built-in functions for those operations already.
- The use of recursion for the `next` method in Java has been kept similar in the Python translation (`next_partial` function).

Please note that because of the differences in how Java and Python handle strings, sets, recursion, and input/output operations, the Python version can be more concise and idiomatic than the Java version. The Java code includes infrastructure for handling more general console-based input/output, exceptions, and measures execution time, none of which appear to be required for the problem statement provided.
