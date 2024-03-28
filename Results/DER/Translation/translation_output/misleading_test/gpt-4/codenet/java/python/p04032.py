Below is the equivalent code in Python using the provided Java code as a reference:

```python
while True:
    try:
        line = input()

        resultNum1 = -1
        resultNum2 = -1

        for i in range(len(line)):

            if i + 1 < len(line) and line[i] == line[i + 1]:
                resultNum1 = i + 1
                resultNum2 = i + 2
                break

            if i + 2 < len(line) and line[i] == line[i + 2]:
                resultNum1 = i + 1
                resultNum2 = i + 3
                break
            
        print(resultNum1, resultNum2)

    except EOFError:
        break
```

This Python code will behave similarly to the Java code, reading lines from standard input until an EOFError (which happens when no more input is available and is the Python equivalent of Java's Scanner no longer having next input).

The `input()` function is used instead of a Scanner, and Python's print function is used to output the results. The output format matches the Java code's format, with spaces between the two numbers. Additionally, indexes in Python start at 0, just as in Java, so no changes in calculations were needed there.
