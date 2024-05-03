Here is the Python equivalent of the Java code:

```python
def main():
    L, R, d = map(int, input().split())

    Ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            Ans += 1

    print(Ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, then iterates over the range from L to R (inclusive), checking if each number is divisible by d. If it is, it increments the counter Ans. Finally, it prints the value of Ans.
