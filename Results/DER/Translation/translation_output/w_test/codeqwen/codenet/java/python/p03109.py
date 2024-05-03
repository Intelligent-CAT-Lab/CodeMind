Here is the Python equivalent of the Java code:

```python
def main():
    time = input().split('/')[2]
    if time[0] == '1' or int(time[1]) > 4:
        print("TBD")
    else:
        print("Heisei")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, splits it into three parts using the '/' character, and then checks the second part of the string (which represents the month) to determine if it is before or after April 2019. If it is before April 2019, it prints "TBD", otherwise it prints "Heisei".
