Below is the translated code from Java to Python:

```python
def calculate_days(day):
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    idx = days.index(day)
    ans = (6 - idx + 7) % 7
    return 7 if ans == 0 else ans

# Sample test case
input_day = "SAT"
print(calculate_days(input_day))
```

This Python script includes a function `calculate_days()` that mirrors the behavior of the original Java program. The test case demonstrates the function call with the input "SAT" and prints the calculated days to the console.
