Below is the Python equivalent of the provided Java code:

```python
def main():
    s = input()
    counter = 0

    for i in range(len(s) - 1):
        if s[i] != s[i + 1]:
            counter += 1

    print(counter)

if __name__ == "__main__":
    main()
```

This Python code reads a string from standard input and uses a loop to compare adjacent characters, incrementing `counter` each time it finds two consecutive characters that are not equal. Finally, it prints out the value of `counter`.
