Here's the Java code translated into Python. Note that in Python, we don't have a direct equivalent of Java's right-curly braces `{}`, so proper indentation is critical. Also, Python's `print()` function is used instead of Java's `System.out.println()`, and the `datetime` module is used to measure elapsed time.

```python
import datetime

# Record the start time
startTime = datetime.datetime.now()

# Read two long integers from the input
A, B = map(int, input().split())

# Infinite loop that goes over all the numbers greater than B
i = B + 1
while True:
    # If i is a multiple of 256 and more than 3500 milliseconds have passed, break the loop
    if (i & 0xFF) == 0 and (datetime.datetime.now() - startTime).total_seconds() * 1000 > 3500:
        break
    # Calculate counts ca and cb based on the problem logic
    ca = i // A + i % A
    remb = i % B
    cb = i // B + remb // A + remb % A
    # If ca is less than cb, print i and exit the loop
    if ca < cb:
        print(i)
        break
    i += 1
else:
    print(-1)
```

Please note, Python's integer division using // can result in negative numbers rounding differently compared to Java's. If you are dealing with potentially negative numbers, make sure to test this thoroughly or look into using math.floor division if that's the desired behavior. In this code, `A` and `B` are assumed to be positive so it's not an issue.
