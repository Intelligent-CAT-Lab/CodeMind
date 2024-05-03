Here is the Python equivalent of the Java code:

```python
def main():
    day_of_week = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    print(day_of_week[int(input()) % 7])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It creates a list of days of the week, then uses the modulo operator to get the remainder when the user input is divided by 7. This is because there are 7 days in a week, and the remainder when the input is divided by 7 will be between 0 and 6, which correspond to the days of the week. The program then prints the day of the week at the index of the remainder.
