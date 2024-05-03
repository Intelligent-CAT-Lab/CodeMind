Here is the Python equivalent of the Java code:

```python
def main():
    input_str = input()
    result = 0
    p = 0
    g = 1

    for i in range(1, len(input_str)):
        if input_str[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1

    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is 'g', it checks if the current value of `p` is less than or equal to `g`. If it is, it increments `result` and `p`. If not, it increments `g`. If the character is not 'g', it does the opposite: it checks if `p` is less than or equal to `g`, and if it is, it increments `p`. If not, it increments `g` and decrements `result`. Finally, it prints the value of `result`.
