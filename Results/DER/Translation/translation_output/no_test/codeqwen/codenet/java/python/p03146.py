Here is the Python equivalent of the Java code:

```python
def main():
    s = int(input())
    set_ = set()
    set_.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set_:
            print(i)
            return
        else:
            set_.add(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the user, then enters a loop that calculates the Collatz sequence for that number. If the sequence reaches a number that has already been seen (i.e., is in the set), it prints the number of steps it took to reach that number and returns. Otherwise, it adds the new number to the set and continues the loop.
