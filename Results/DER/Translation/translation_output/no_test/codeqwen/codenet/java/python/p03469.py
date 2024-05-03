Here is the Python equivalent of the Java code:

```python
print(2018)
S = input()
c = list(S)
for i in range(4, len(c)):
    print(c[i], end='')
```

In Python, we use the `input()` function to get user input, and the `list()` function to convert the string into a list of characters. The `range()` function is used to iterate over the list starting from index 4 (the fifth character, as Python uses 0-based indexing) up to the length of the list. The `end=''` argument in the `print()` function is used to prevent a newline character from being printed after each character.
