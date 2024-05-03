Here is the Python equivalent of the Java code:

```python
a = int(input())
c = 0
for i in range(1, a+1):
    if len(str(i)) % 2 != 0:
        c += 1
print(c)
```

This Python code does the same thing as the Java code: it reads an integer from the user, counts how many numbers from 1 to that integer have an odd number of digits, and then prints that count.
