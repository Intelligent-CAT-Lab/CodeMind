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

This Python code does the same thing as the Java code. It reads an integer from the user, then it calculates the smallest number that is greater than or equal to the input number and ends with 7. It then calculates the number of times 7 is added to the result to get the input number. If the input number is not divisible by the result, it keeps adding 7 to the result until it is divisible. If it encounters a number that has already been added to the set, it sets the result to -1 and breaks out of the loop. Finally, it prints the result.
