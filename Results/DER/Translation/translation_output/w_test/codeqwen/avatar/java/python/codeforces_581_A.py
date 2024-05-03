Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    count = 0
    while True:
        if a > 0 and b > 0:
            count += 1
            a -= 1
            b -= 1
        else:
            break
    ans = a // 2 + b // 2
    print(count, ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, counts the number of times the two numbers can be decremented by 1 until either of them becomes 0, and then calculates the number of times the two numbers can be divided by 2 until either of them becomes 0. The result is then printed to the console.
