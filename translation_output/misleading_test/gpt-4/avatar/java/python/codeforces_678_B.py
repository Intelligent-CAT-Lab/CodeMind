Here is the Python translation of the provided Java code. The Python version doesn't require importing any additional libraries, as Python natively handles leap years and calendar operations smoothly using the standard library if necessary. But in this code, we'll replicate the functionality without such libraries to stay true to the logic of the original Java code.

```python
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def find_similar_year(y):
    leap = check_leap(y)
    sum_days = 0
    
    i = y + 1
    while True:
        if check_leap(i):
            sum_days += 366
        else:
            sum_days += 365
            
        if sum_days % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                return i
            else:
                continue
        i += 1

# Test input
y = 2096
# Expected output: 2141
print(find_similar_year(y))
```

In the `find_similar_year` function, the code runs indefinitely until it finds the next year with the same calendar as the input year `y`. It utilizes the helper function `check_leap` to determine whether a year is a leap year. Remember that in Python, it is not necessary to explicitly specify the data type of a function's return value or its parameters.

Test the provided code with the respective input to ensure that it produces the expected output.
