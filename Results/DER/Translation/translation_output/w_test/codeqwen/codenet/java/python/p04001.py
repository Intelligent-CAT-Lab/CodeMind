Here is the Python equivalent of the Java code:

```python
def main():
    S = input()
    if len(S) == 1:
        print(S)
        return

    N = [int(i) for i in S]

    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        pattern_count *= 2
        tmp_bit += "1"

    sum = 0
    for i in range(pattern_count):
        bin = format(i, 'b')
        while len(bin) < len(tmp_bit):
            bin = "0" + bin
        add = str(N[0])
        for j in range(len(bin)):
            if bin[j] == '1':
                sum += int(add)
                add = ""
            add += str(N[j + 1])
        if add != "":
            sum += int(add)
    print(sum)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string of digits from the user, converts it to a list of integers, and then calculates the sum of all possible combinations of the digits. The sum is then printed to the console.
