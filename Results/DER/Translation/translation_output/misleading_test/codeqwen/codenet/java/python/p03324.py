Here is the Python equivalent of the Java code:

```python
def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0) * 1
    return b == o

def main():
    D = int(input())
    A = 10000 if D == 2 else 100 if D == 1 else 1
    N = int(input())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the value of A based on the input D, and then enters a loop that continues until the number of found numbers is equal to N. In each iteration of the loop, it increments the count and checks if the number formed by multiplying A by the current count is a valid number according to the search function. If it is, it increments the serial number. After the loop, it prints the final number.
