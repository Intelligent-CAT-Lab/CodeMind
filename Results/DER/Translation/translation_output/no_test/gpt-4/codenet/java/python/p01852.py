Here is the Python translation for the given Java code:

```python
# A : Finger Counting

def main():
    n = int(input())
    count = 0

    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1

    print(count)

if __name__ == "__main__":
    main()
```

This Python code replicates the behavior of the Java code: it reads a long integer from the standard input, counts the number of times you can divide it by 2 before it becomes less than 2, and then prints out the count. Keep in mind that in Python `//` is used for integer division (truncating any decimal points), which matches the behavior of `/` in Java when used with integers.
