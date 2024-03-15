Here's the translated code to Python, keeping a similar structure and logic:

```python
while True:
    try:
        line = input()

        # Python has no character type, so there's no need to split into an array of length 1
        # Instead, we use line directly to access characters
        result_num1 = -1
        result_num2 = -1

        for i in range(len(line)):
            if i + 1 <= len(line) - 1 and line[i] == line[i + 1]:
                result_num1 = i + 1
                result_num2 = i + 2
                break

            if i + 2 <= len(line) - 1 and line[i] == line[i + 2]:
                result_num1 = i + 1
                result_num2 = i + 3
                break

        print(result_num1, result_num2)
    except EOFError:
        break
```

Key differences:
- We don't need to import anything as standard input handling in Python doesn't require explicit imports.
- Instead of using a `Scanner` like in Java, we simply use `input()` to read input from the user.
- The `try` block is used to keep reading until an `EOFError` is raised, which is Python's equivalent of not having any more input (`cin.hasNext()` in Java).
- We directly access characters in a string with indexing rather than splitting the string into an array of characters.
- Python's `print` automatically separates arguments with spaces, so we can pass two numbers without converting to strings or adding a space between them.
