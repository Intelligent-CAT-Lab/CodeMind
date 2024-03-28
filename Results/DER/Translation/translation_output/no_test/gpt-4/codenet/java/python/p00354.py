Here's the equivalent Python code for the Java program you've provided:

```python
if __name__ == "__main__":
    day_index = int(input()) % 7
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    print(days[day_index])
``` 

This Python code takes an integer as input, calculates the remainder when divided by 7 (to get an index within 0 to 6), and then uses that index to print the corresponding day from the given list of days.
