```python
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def codeforces_678_B():
    y = int(input())
    leap = check_leap(y)
    sum = 0
    
    for i in range(y + 1, 10**9):  # Loop up to a large number as upper bound
        if check_leap(i):
            sum += 366
        else:
            sum += 365
        
        if sum % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                return

codeforces_678_B()
```
Test the code by providing an input number and check the output.
