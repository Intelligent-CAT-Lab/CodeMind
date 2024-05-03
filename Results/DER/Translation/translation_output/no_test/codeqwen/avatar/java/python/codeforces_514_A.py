Here is the Python equivalent of the Java code:

```python
def main():
    x = int(input())
    list_ = []

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list_.append(r)
            else:
                list_.append(9 - r)
        else:
            list_.append(r)
        x = x // 10

    new_number = 0
    pow_ = 0

    for i in range(len(list_)):
        new_number += list_[i] * (10 ** pow_)
        pow_ += 1

    print(new_number)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the digits of the number in reverse order, and then prints the new number.
