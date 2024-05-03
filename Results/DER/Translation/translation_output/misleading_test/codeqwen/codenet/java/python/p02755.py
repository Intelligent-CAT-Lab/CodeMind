Here is the Python equivalent of the Java code:

```python
def run():
    A = int(input())
    B = int(input())

    if A > B:
        print(-1)
        return

    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            return

    print(-1)

run()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the first integer is greater than the second, and if so, prints -1 and returns. If the first integer is not greater than the second, it enters a loop that iterates from 1 to 99999999. For each iteration, it checks if the integer multiplied by 0.08 is equal to the first integer and the integer multiplied by 0.10 is equal to the second integer. If it finds such an integer, it prints it and returns. If it doesn't find such an integer after checking all possibilities, it prints -1.
