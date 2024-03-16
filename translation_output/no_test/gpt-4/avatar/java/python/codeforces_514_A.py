Below is the translated Python code from the given Java code:

```python
def main():
    x = int(input())
    list_digits = []
    new_number = 0
    power = 0

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list_digits.append(r)
            else:
                list_digits.append(9 - r)
        else:
            list_digits.append(r)
        x = x // 10

    for digit in reversed(list_digits):
        new_number += digit * (10 ** power)
        power += 1

    print(new_number)


if __name__ == "__main__":
    main()
```

This Python program will have the same functionality as the original Java code; it takes a number as input, modifies its digits according to the given rules, and prints out the new number.
