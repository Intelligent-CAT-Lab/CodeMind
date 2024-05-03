Here is the Python equivalent of the Java code:

```python
def main():
    input_str = input()
    input_list = list(input_str)
    result = 0
    p = 0
    g = 1

    for i in range(1, len(input_list)):
        if input_list[i] == 'g':
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

This Python code does the same thing as the Java code. It reads a string from the user, converts it to a list of characters, and then iterates over the list. If the character is 'g', it increments the `p` variable if `p + 1` is less than or equal to `g`, otherwise it increments `g`. If the character is not 'g', it does the opposite. Finally, it prints the result.
