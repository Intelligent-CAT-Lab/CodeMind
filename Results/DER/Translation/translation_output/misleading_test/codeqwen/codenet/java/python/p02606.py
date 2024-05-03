Here is the Python equivalent of the Java code:

```python
def main():
    L = int(input())
    R = int(input())
    d = int(input())

    Ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            Ans += 1

    print(Ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, then iterates over the range from L to R (inclusive), checking if each number is divisible by d. If it is, it increments the count of such numbers. Finally, it prints the count.
