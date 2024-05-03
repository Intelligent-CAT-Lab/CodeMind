Here is the Python equivalent of the Java code:

```python
import math

def main():
    s, t = map(int, input().split())
    mah = str(s) + str(t)
    a = int(mah)
    b = math.sqrt(a)
    if b.is_integer():
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, concatenates them into a string, converts the string back into an integer, and then checks if the square root of this integer is an integer. If it is, it prints "Yes", otherwise it prints "No".
