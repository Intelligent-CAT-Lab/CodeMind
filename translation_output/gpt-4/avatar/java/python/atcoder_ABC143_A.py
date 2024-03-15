Below is the translated code from Java to Python:

```python
# We don't need to import anything in Python to use basic input/output functionality

def atcoder_ABC143_A():
    A = int(input())  # Reading integer input in Python
    B = int(input())
    
    result = A - (B * 2)
    
    if result > 0:
        print(result)  # Printing the result in Python
    else:
        print(0)  # In case (A - B * 2) is not greater than 0, we should print 0

# Executing the function
atcoder_ABC143_A()
```

Please note that in Python, conditional statements use `if`, `elif`, and `else` with a colon (:) at the end of the condition. Indentation (typically 4 spaces) replaces curly braces {} from Java to denote code blocks within these conditionals.
Also, the `system.out.println` statement in Java corresponds to the `print()` function in Python. 

In addition to that, the `Scanner` system from Java is replaced by the `input()` function in Python for stdin input. Each `input()` call reads a line from the stdin, which is then cast to an integer using `int()`.
