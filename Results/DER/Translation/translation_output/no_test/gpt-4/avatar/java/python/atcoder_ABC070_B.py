Below is the translated version of the provided Java code into Python:

```python
def atcoder_ABC070_B():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    ans = sum(1 for i in array if i == 2)
    
    print(ans)

# Call the function
atcoder_ABC070_B()
```

In this translation, the following changes were made to convert Java code to Python syntax:
- Python uses `def` keyword for defining a function instead of a class as in Java.
- Python does not require importing a Scanner or similar utilities for basic input; it has built-in `input()` function.
- Explicit type declarations are not needed in Python.
- Python does not require semicolons at the end of statements.
- For loop in Python does not need explicit initialization, check, and increment expressions. The `range` function is used instead.
- The `print` function is used to output values in Python.
- Instead of manually counting `ans` in a loop, a `sum` function with a generator expression is used to achieve the same result in a more Pythonic way.
- It is common practice in Python to call the function at the end of the script if it is meant to be executed immediately when the script runs.
