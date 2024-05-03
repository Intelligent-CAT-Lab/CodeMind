Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    set_ = set()

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in set_:
            res = -1
            break
        set_.add(num)
        num = num * 10 + 7

    print(res)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then repeatedly multiplies it by 10 and adds 7 until it is greater than or equal to the input number. It then repeatedly takes the remainder of the division of the current number by the input number, increments the result, and adds the current number to a set. If the current number is already in the set, it means that the number will never be zero when divided by the input number, so the result is set to -1 and the loop is broken. Finally, the result is printed.
