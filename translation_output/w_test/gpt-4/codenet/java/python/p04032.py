Here is the translated Python code enclosed as requested:

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

This Python script reads lines continuously until it hits the end of the file (EOF), which will happen if you run this code as a script and pass the input through a file or use a pipe to direct the input. When inputting directly in an interactive session (like a Python interpreter or similar environment), you typically would signify the end of input with a special EOF character (often Ctrl+D on Linux/Mac or Ctrl+Z on Windows, followed by Enter).
