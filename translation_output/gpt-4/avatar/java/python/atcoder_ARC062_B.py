```python
def atcoder_ARC062_B():
    input_str = input()
    result = 0
    p = 0
    g = 1
    
    for i in range(1, len(input_str)):
        if input_str[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1
    
    print(result)

atcoder_ARC062_B()
```

The Python code uses functions instead of classes by default and utilizes the built-in `input` function to read from standard input. String handling in Python doesn't require conversion to a character array, as strings can be accessed by index directly. The `print` function is used to output the result.
