Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    x = 0
    y = 0
    out = [''] * 11  # 1000000000000001 <= 26^10 <= 2^64

    for i in range(11):
        N -= 1  # 
        x = N // 26
        y = N % 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
        N = x

    for i in range(10, -1, -1):
        if out[i] == '':
            continue
        print(out[i], end='')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer N from the user, subtracts 1 from it, and then repeatedly divides it by 26 and takes the remainder to get the corresponding character. The character is then added to the output list. If the quotient is 0, the loop breaks. Finally, the output list is printed in reverse order.
