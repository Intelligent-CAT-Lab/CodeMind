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

This Python code does the same thing as the Java code. It takes an integer input, calls the `func` function, and then prints out the resulting list of strings. The `func` function works similarly to the Java version: if the input is 1, it returns a list containing just the string "a". Otherwise, it calls itself with the input decremented by 1, and then for each string in the resulting list, it appends every character from 'a' to the maximum character in the string, and adds the new string to the `new_list`. Finally, it returns the `new_list`.
