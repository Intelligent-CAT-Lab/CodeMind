Here is the Python equivalent of the Java code:

```python
def main():
    input_str = input().split()
    p = int(input_str[0])
    g = int(input_str[1])
    result = 0
    
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

This Python code does the same thing as the Java code. It reads two integers from the user, then iterates over the input string. If the character is 'g', it checks if the number of 'g's is less than or equal to the number of 'p's. If it is, it increments the result and the number of 'p's. If not, it increments the number of 'g's. If the character is not 'g', it does the same thing but decrements the number of 'g's instead. Finally, it prints the result.
