Here is the Python equivalent of the Java code:

```python
def main():
    x = int(input())
    sb = ""
    count = 0
    a = 1
    b = 0
    if x >= 3 and x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                sb += " " + str(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb += " " + str(a)
                        break
                    b //= 10
            a += 1
            count += 1
    print(sb)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if it's within the range 3 to 10000, and then iterates from 1 to x, checking if each number is divisible by 3 or contains the digit 3. If it does, it appends the number to a string. Finally, it prints the string.
