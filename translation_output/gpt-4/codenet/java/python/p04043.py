Here's the Java code translated into Python:

```python
a = int(input())
b = int(input())
c = int(input())

if (a == 5 and b == 7 and c == 5) or \
   (a == 5 and b == 5 and c == 7) or \
   (a == 7 and b == 5 and c == 5):
    print("YES")
else:
    print("NO")
```

Note that in Python, you don't need to import a Scanner or create a class to get input from the console. You can simply use the `input()` function and then convert the string to an integer using `int()`. The logical structure is the same, using `and` for logical conjunction, `or` for logical disjunction, and `if`-`else` for conditional statements.
