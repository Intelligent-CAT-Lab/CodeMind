Below is the translated Python code that performs the same functionality:

```python
if __name__ == "__main__":
    str_input = input()
    ans = str_input.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)
```

Please note that in Python, there's no need to explicit import the `Scanner` class from the `java.util` package or use a `try-with-resources` statement, as Python context management and file handling are managed differently. The `input()` function is used to get user input from standard input (console).
