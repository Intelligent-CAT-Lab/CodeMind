Here is the Python equivalent of the Java code:

```python
def main():
    X = int(input())
    Y = int(input())

    sum = 0
    judge = False
    a = 0
    b = 0
    c = 0

    for i in range(X+1):
        for k in range(X-i+1):
            sum = 10000*i + 5000*k + 1000*(X-i-k)
            if sum == Y:
                judge = True
                a = i
                b = k
                c = X-i-k
                break

    if judge:
        print(a, b, c)
    else:
        print("-1 -1 -1")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the sum of the three parts of the number, and checks if the sum is equal to the user's input. If it is, it prints the three parts of the number. If it isn't, it prints "-1 -1 -1".
