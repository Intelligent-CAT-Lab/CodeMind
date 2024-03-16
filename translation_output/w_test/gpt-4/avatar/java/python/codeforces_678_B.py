Below is the Python equivalent of the provided Java code:

```python
def check_leap(year):
    # Check if a year is a leap year in Python
    return year % 400 == 0 or (year % 4 == 0 and year % 100 != 0)

def find_same_day_leap_year(start_year):
    leap = check_leap(start_year)
    # Initialize sum of days passed since provided year
    sum_days = 0
    # Iterate over consecutive years
    i = start_year + 1
    while True:
        # If the year is leap, add 366 days, else add 365
        if check_leap(i):
            sum_days += 366
        else:
            sum_days += 365
        
        # If the total sum of days is a multiple of 7 (a full week), check leap status
        if sum_days % 7 == 0:
            if check_leap(i) == leap:
                return i
            # If not, continue with the next year
        i += 1

# Test input
year = 2096
# Expected output: 2108

# Call the function with the test input and print the result
same_day_leap_year = find_same_day_leap_year(year)
print(same_day_leap_year)
```

This Python code uses a function `check_leap` to determine if the year is a leap year and `find_same_day_leap_year` to find the next year that starts on the same day of the week as the input year and has the same leap year status. The test cases at the end call this function with `year = 2096` and print out the expected output `2108`.
