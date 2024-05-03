Here is the Python equivalent of the Java code:

```python
n = float(input())

odd = 0
not_odd = 0
for i in range(1, int(n)+1):
    if i % 2 == 0:
        not_odd += 1
    else:
        odd += 1

print(odd / n)
```

This Python code does the same thing as the Java code. It reads a number from the user, then iterates over a range from 1 to the number entered by the user. For each number, it checks if it is even or odd and increments the appropriate counter. Finally, it prints the ratio of odd numbers to the total number of numbers.
