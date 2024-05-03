Here is the Python equivalent of the Java code:

```python
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def main():
    y = int(input())
    leap = check_leap(y)
    sum = 0
    
    for i in range(y + 1, 10000):
        if check_leap(i):
            sum += 366
        else:
            sum += 365
        
        if sum % 7 == 0:
            if ((check_leap(i) and leap) or (!check_leap(i) and not leap)):
                print(i)
                return
            else:
                continue

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It takes an input year, checks if it's a leap year, and then iterates over the years from the input year to 9999. For each year, it checks if it's a leap year and adds 366 or 365 to the sum depending on whether it is a leap year or not. If the sum of the days is divisible by 7, it checks if the current year is a leap year and if it's the same as the input year. If it is, it prints the year and returns. If it's not, it continues to the next year.
