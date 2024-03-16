Here's the equivalent Python code for the provided Java code:

```python
def p03029(A, P):
    return (P + 3 * A) // 2

if __name__ == "__main__":
    # Reading input from user
    str_input = input().split()
    A = int(str_input[0])
    P = int(str_input[1])
    
    # Computing and printing the result
    print(p03029(A, P))
```

Please note that in the Python code, I have defined a function `p03029` which takes two integers `A` and `P` and returns the result of the calculation. The I/O part is done separately in the `if __name__ == "__main__":` block, which is the standard Python way to write the main entry point of a script.

To test the above code with the given test input `1 3`, you would run the code and input `1 3` when prompted. The expected output would be `3`.
