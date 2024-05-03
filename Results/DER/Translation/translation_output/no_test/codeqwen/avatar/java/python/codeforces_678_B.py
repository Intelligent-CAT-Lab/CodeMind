Here is the Python equivalent of the Java code:

```python
import datetime

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

y = int(input())
leap = check_leap(y)
sum = 0

for i in range(y + 1, 1000000000):
    if check_leap(i):
        sum += 366
    else:
        sum += 365
    
    if sum % 7 == 0:
        if ((check_leap(i) and leap) or (!check_leap(i) and not leap)):
            print(i)
            break
```

Please note that the Python code is not exactly equivalent to the Java code because Python does not have a built-in `Scanner` class for reading input from the console. Instead, we use the `input()` function to read input from the console. Also, Python does not have a built-in `System.out.println()` function for printing output to the console. Instead, we use the `print()` function.
