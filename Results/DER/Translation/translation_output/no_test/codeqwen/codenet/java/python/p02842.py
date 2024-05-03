Here is the Python equivalent of the Java code:

```python
N = int(input())
for i in range(N+1):
    if int(i * 1.08) == N:
        print(i)
        break
else:
    print(":(")
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates from 0 to that integer. For each integer, it checks if the integer multiplied by 1.08 is equal to the original integer. If it is, it prints the integer and breaks out of the loop. If it doesn't find such an integer, it prints ":(" and breaks out of the loop as well.
