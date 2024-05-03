Here is the Python equivalent of the Java code:

```python
def func(n):
    if n == 1:
        return ["a"]
    else:
        prev_list = func(n - 1)
        new_list = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord(max_char) + 1, ord('z') + 1):
                new_string = s + chr(c)
                new_list.append(new_string)
        return new_list

n = int(input())
result = func(n)
for s in result:
    print(s)
```

This Python code does the same thing as the Java code. It takes an integer `n` as input, calls the `func` function with `n`, and then prints out the resulting list of strings. The `func` function works similarly to the Java version: if `n` is 1, it returns a list containing just the string "a". Otherwise, it calls itself with `n - 1` and then iterates over the resulting list. For each string `s` in the list, it finds the maximum character and then appends a new string to the `new_list` for each character `c` that is one greater than the maximum character. Finally, it returns the `new_list`.
