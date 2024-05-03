Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    length = len(s)

    count = 0
    for i in range(length // 2):
        a = s[i]
        b = s[length - 1 - i]
        if a != b:
            count += 1

    print(count)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, calculates its length, and then iterates over the first half of the string. For each character in the first half, it gets the corresponding character from the end of the string and checks if they are the same. If they are not, it increments a counter. Finally, it prints the counter, which represents the number of characters that are different in the first half of the string and their corresponding characters in the second half.
