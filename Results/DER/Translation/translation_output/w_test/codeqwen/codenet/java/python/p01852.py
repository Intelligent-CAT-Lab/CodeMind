Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    count = 0

    if n > 0:
        while n >= 2:
            n /= 2
            count += 1
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, divides it by 2 until it's less than 2, and counts the number of divisions. The count is then printed out.
