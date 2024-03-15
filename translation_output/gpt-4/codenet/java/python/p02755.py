Below is the translated code from Java to Python:

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

if __name__ == "__main__":
    run()
```

This Python code performs the same logic as the provided Java code. It reads two integers, checks if the first is greater than the second, and then runs a loop to find a number whose 8% is equal to the first number and 10% is equal to the second number. If no such number is found, it prints `-1`.
