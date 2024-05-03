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

This Python code does the same thing as the Java code. It reads two integers from the user, checks if A is greater than B, and if so, prints -1 and returns. If A is not greater than B, it enters a loop that iterates from 1 to 99999999. For each iteration, it checks if the integer part of the product of i and 0.08 is equal to A and the integer part of the product of i and 0.10 is equal to B. If it finds such an i, it prints i and returns. If it doesn't find such an i after checking all possibilities, it prints -1.
