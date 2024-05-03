Here is the Python equivalent of the Java code:

```python
def main():
    number = int(input())
    ans = -1
    value = 0
    mask = 2

    while value < number:
        s = bin(mask)[2:]
        zeros = s.count('0')

        if zeros != s.count('1'):
            mask += 1
            continue

        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s, 2)

    print(value)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then enters a loop that continues until the value of `value` is greater than or equal to the user's input. Inside the loop, it converts the current mask to binary, counts the number of zeros, and checks if the number of zeros is equal to the number of ones. If not, it increments the mask and continues to the next iteration. If the number of zeros is equal to the number of ones, it replaces the zeros and ones with 4s and 7s respectively, converts the string back to an integer, and assigns it to `value`. Finally, it prints the value.
