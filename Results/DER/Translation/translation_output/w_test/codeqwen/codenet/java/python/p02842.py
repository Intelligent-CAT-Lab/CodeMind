Here is the Python equivalent of the Java code:

```python
N = int(input())
for i in range(N+1):
    if int(i*1.08) == N:
        print(i)
        break
else:
    print(":(")
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates from 0 to the input number. For each number, it checks if the number multiplied by 1.08 is equal to the input number. If it is, it prints the number and breaks out of the loop. If it doesn't find a number that satisfies the condition, it prints ":(" and breaks out of the loop as well.
