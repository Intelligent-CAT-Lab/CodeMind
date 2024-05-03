Here is the Python equivalent of the Java code:

```python
h = int(input())
w = int(input())
a = int(input())
b = int(input())

s1 = "0" * a + "1" * (w - a)
s2 = "1" * a + "0" * (w - a)

for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)
```

This Python code does the same thing as the Java code. It reads four integers from the user, creates two strings `s1` and `s2` based on the values of `a` and `w`, and then prints out the strings `s1` and `s2` in the required pattern.
