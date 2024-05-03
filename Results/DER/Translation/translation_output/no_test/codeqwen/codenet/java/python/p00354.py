Here is the Python equivalent of the Java code:

```python
import sys

def main():
    day_of_week = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    day_number = int(sys.stdin.readline()) % 7
    print(day_of_week[day_number])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, modifies it by taking the remainder when divided by 7, and then prints the corresponding day of the week. The days of the week are stored in a list, and the day number is used to index into this list.
