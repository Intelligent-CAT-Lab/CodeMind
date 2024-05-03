Here is the Python equivalent of the Java code:

```python
def main():
    n = input()

    for i in range(1, len(n)):
        if n[i] != '0':
            sum = 0
            for j in range(len(n)):
                sum += int(n[j])
            print(sum)
            return

    if n[0] == '1':
        print(10)
        return

    print(int(n[0]))


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string input, then iterates over the string to find the first non-zero digit. If it finds one, it calculates the sum of all digits and prints it. If it doesn't find one, it checks if the first digit is '1' and prints 10 if it is, otherwise it prints the first digit.
