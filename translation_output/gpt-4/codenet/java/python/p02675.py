Below is the python equivalent of the provided Java code:

```python
def p02675():
    N = int(input())
    
    match N % 10:
        case 2 | 4 | 5 | 7 | 9:
            print("hon")
        case 0 | 1 | 6 | 8:
            print("pon")
        case 3:
            print("bon")

# Calling the function if this script is executed as main
if __name__ == "__main__":
    p02675()
```

This Python script uses the newer "match case" syntax (which is similar to Java's switch-case) introduced in Python 3.10. You should ensure that you are running this code with Python version 3.10 or later. If you're using an earlier version of Python, you will need to translate the match case part into a series of if-elif-else statements.
