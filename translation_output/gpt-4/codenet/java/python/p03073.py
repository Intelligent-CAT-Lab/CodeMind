Here is the Python version of the given Java code:

```python
# main method in Python does not require an explicit declaration
if __name__ == "__main__":
    tail = input()  # Reading input in Python
    n = len(tail)  # Getting the length of the input string
    count = 0
    for i in range(n):
        # Python allows direct comparison of string and integer with the == operator
        if i % 2 == 0 and tail[i] == "0":
            count += 1
        if i % 2 == 1 and tail[i] == "1":
            count += 1
    n -= count
    # using the min function to print the smaller of the two, count and n
    print(min(count, n))
``` 

I've translated the original Java code to Python, keeping the logic intact. Note that in Python's `print` function, `print()` automatically appends a newline by default, unlike Java's `System.out.print()`, which does not append a newline unless explicitly done with `System.out.println()`. If you want to exactly match Java's `print` without a newline, you can pass `end=''` to Python's `print` function:
```python
print(min(count, n), end='')
```

But for this piece of code, it is not necessary because the output ends after printing the number.
