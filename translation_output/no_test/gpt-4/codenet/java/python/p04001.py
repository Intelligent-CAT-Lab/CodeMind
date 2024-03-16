Here's the translated Python code for the provided Java code snippet:

```python
def main():
    S = input()
    if len(S) == 1:
        print(S)
        exit(0)

    N = [int(c) for c in S]

    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        if i > 0:
            pattern_count *= 2
            tmp_bit += "1"

    sum = 0
    for i in range(pattern_count):
        binary = "{:b}".format(i).zfill(len(tmp_bit))
        add = str(N[0])
        for j in range(len(binary)):
            if binary[j] == '1':
                sum += int(add)
                add = ""
            add += str(N[j + 1])
        if add:
            sum += int(add)

    print(sum)

if __name__ == '__main__':
    main()
```

Key points of the translation:
- Replace the `Scanner` class with `input()` function for reading input strings in Python.
- Arrays in Java are translated to lists in Python.
- Use list comprehensions to convert the characters of the string `S` into integers for the list `N`.
- Use `exit(0)` in Python to terminate the program immediately, which is a substitute for `System.exit(0)` in Java.
- The integer-to-binary conversion is done using `"{:b}".format(i)` and `.zfill()` to add leading zeroes.
- String concatenation in Python is similar to Java, just the `+` operator is used.
- Python's `print` function replaces `System.out.println`.
- The check of `if add:` ensures that `add` is not empty before attempting to convert it to an integer and adding it to the sum.
- `main` is defined as a function and subsequently called under the `if __name__ == '__main__':` construct to emulate the behavior of Java's `main` method.
