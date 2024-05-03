Here is the Python equivalent of the Java code:

```python
def main():
    tail = input()
    n = len(tail)  # length of the string
    count = 0
    for i in range(n):
        if i % 2 == 0 and tail[i] == '0':
            count += 1
        elif i % 2 == 1 and tail[i] == '1':
            count += 1
    n -= count
    if count > n:
        print(n)
    else:
        print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of '0's and '1's at even and odd indices respectively, subtracts the count from the length of the string, and then prints the smaller of the two counts.
