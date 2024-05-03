Here is the Python equivalent of the Java code:

```python
def main():
    X = int(input())
    Y = int(input())
    ans = 0
    if X == 1 and Y == 1:
        ans = 1000000
    else:
        if X == 1:
            ans += 300000
        if Y == 1:
            ans += 300000
        if X == 2:
            ans += 200000
        if Y == 2:
            ans += 200000
        if X == 3:
            ans += 100000
        if Y == 3:
            ans += 100000
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the answer based on the values of X and Y, and then prints the answer.
